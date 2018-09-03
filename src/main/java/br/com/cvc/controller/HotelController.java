package br.com.cvc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import br.com.cvc.businessRules.errors.ErrorsMessage;
import br.com.cvc.businessRules.wrapper.HotelWrapper;
import br.com.cvc.entity.HotelResponse;
import br.com.cvc.entity.PriceDetailResponse;
import br.com.cvc.entity.RoomResponse;
import br.com.cvc.entity.partner.HotelPartnerRequest;
import br.com.cvc.service.partner.HotelServicePartnerRequest;
import br.com.cvc.utils.DateConversions;

@RequestMapping("/v1/hotels")
@RestController
public class HotelController {
	 @ExceptionHandler({ Exception.class })
	    public ResponseEntity<Object> handleAccessDeniedException(
	      Exception ex, WebRequest request) {
		
	        return new ResponseEntity<Object>(
	        		
	          new ErrorsMessage(ex.getMessage(),"0x422"), new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY.FORBIDDEN);
	    }
	public List<HotelResponse> hotels(HotelPartnerRequest[] hotelsPartnerRequest, String checkin, String checkout,int numAdultos, int numCriancas) {
		ArrayList<HotelResponse> hoteis = new ArrayList<HotelResponse>();
		int days = DateConversions.getDaysBetween(checkin, checkout);
		if (days==0) days=1; // menos de um dia inteiro também é diaria...
		for (int i = 0; i < hotelsPartnerRequest.length; i++) {
				HotelWrapper hotelWrapper= new  HotelWrapper(hotelsPartnerRequest[i]);
				HotelResponse hotelResponse= hotelWrapper.getHotelResponse(days, numAdultos, numCriancas);
				hoteis.add(hotelResponse);
		}
		return hoteis;
	}
	public void validaEntrada(String checkin, String checkout, int numAdultos, int numCriancas)  throws Exception{
		
		if(numAdultos<=0) {
			throw new Exception("número de adultos inválido");
		}
		if(numCriancas<=0) {
			throw new Exception("número de crianças inválido");
		}
		
		Date date1;
		Date date2;
		try {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		date1 = myFormat.parse(checkin);
		 date2 = myFormat.parse(checkout);
		}catch(Exception ex) {
			throw new Exception("formato de data inválido");
		}
		if(date2.getTime()<date1.getTime()) {
			throw new Exception("data de checkout menor do que a de checkin");
		}
		
		
	}

	@RequestMapping(value = "/avail/{cityCode}")
	public @ResponseBody Object hotelsByCity(@PathVariable(value = "cityCode", required = true) long cityCode,
			@RequestParam(value = "checkin", required = true) String checkin,
			@RequestParam(value = "checkout", required = true) String checkout,
			@RequestParam(value = "numAdultos", required = true) int numAdultos,
			@RequestParam(value = "numCriancas", required = true) int numCriancas) throws Exception {

		validaEntrada(checkin,checkout, numAdultos, numCriancas);
		HotelServicePartnerRequest hotelServicePartnerRequest = new HotelServicePartnerRequest();
		return hotels(hotelServicePartnerRequest.hotelsByCity(cityCode),checkin,checkout,numAdultos,numCriancas);
 
		// return hotels(result);

		// return new Greeting(cityId,
		// "abc");
	}

	@RequestMapping(value = "/{hotelId}")
	public @ResponseBody Object hotelsById(
			@PathVariable(value = "hotelId", required = true) long hotelId,
			@RequestParam(value = "checkin", required = true) String checkin,
			@RequestParam(value = "checkout", required = true) String checkout,
			@RequestParam(value = "numAdultos", required = true) int numAdultos,
			@RequestParam(value = "numCriancas", required = true) int numCriancas) throws Exception {
			validaEntrada(checkin,checkout, numAdultos, numCriancas);
		// hotels/avail/{cityCode}?checkin=01/01/2018&checkout=02/01/2018&numAdultos=0;numCriancas=0
		// http://localhost:8080/v1/hotels/avail/1032?checkin=01/01/2018&checkout=02/01/2018&numAdultos=0&numCriancas=0

	
		//throw new Exception("sdfdssf");
		HotelServicePartnerRequest hotelServicePartnerRequest = new HotelServicePartnerRequest();
		return hotels(hotelServicePartnerRequest.hotelsById(hotelId),checkin,checkout,numAdultos,numCriancas);

		
	}
}
