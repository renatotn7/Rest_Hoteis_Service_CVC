package br.com.cvc.businessRules.wrapper;

import java.util.ArrayList;
import java.util.List;

import br.com.cvc.entity.HotelResponse;
import br.com.cvc.entity.RoomResponse;
import br.com.cvc.entity.partner.HotelPartnerRequest;
import br.com.cvc.entity.partner.RoomPartnerRequest;

public class HotelWrapper {
		private HotelPartnerRequest hotelPartnerRequest;
	
		public HotelWrapper(HotelPartnerRequest hotelPartnerRequest) {
			this.hotelPartnerRequest =hotelPartnerRequest;
			
		}
		public HotelResponse getHotelResponse(int numDays, int numAdults, int numChildren)
		{
			 
			 List<RoomResponse> roomsResponse = new ArrayList<RoomResponse>();
			 for(RoomPartnerRequest roomPartnerRequest:hotelPartnerRequest.getRooms()) {
				 RoomWrapper roomWrapper = new RoomWrapper(roomPartnerRequest);
				 RoomResponse roomResponse = roomWrapper.getRoomResponse(numDays, numAdults, numChildren) ;
				 roomsResponse.add(roomResponse);  
				 
			 }
			return new  HotelResponse(hotelPartnerRequest.getId(), hotelPartnerRequest.getCityName(), roomsResponse) ;
		}
	
}
