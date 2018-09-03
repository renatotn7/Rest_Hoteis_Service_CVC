package br.com.cvc.service.partner;

import org.springframework.web.client.RestTemplate;

import br.com.cvc.entity.partner.HotelPartnerRequest;
 
public class HotelServicePartnerRequest extends RestTemplate{
  public HotelServicePartnerRequest() {
	  super();
  }
  public HotelPartnerRequest[] hotelsByCity(long cityCode) {
	  return getForObject("https://cvcbackendhotel.herokuapp.com/hotels/avail/" + cityCode,HotelPartnerRequest[].class);
  }
  public HotelPartnerRequest[] hotelsById(long hotelId) {
	  return getForObject("https://cvcbackendhotel.herokuapp.com/hotels/" + hotelId,HotelPartnerRequest[].class);
  }
}
