package br.com.cvc.businessRules.wrapper;


import br.com.cvc.entity.PriceDetailResponse;
import br.com.cvc.entity.RoomResponse;
import br.com.cvc.entity.partner.RoomPartnerRequest;

public class RoomWrapper {
 private RoomPartnerRequest roomPartnerRequest;
 public RoomWrapper( RoomPartnerRequest roomPartnerRequest) {
	 this.roomPartnerRequest=roomPartnerRequest;
 }
   
 public RoomResponse getRoomResponse(int numDays, int numAdults, int numChildren) {
	 PriceWrapper priceWrapper = new PriceWrapper(roomPartnerRequest.getPrice());
	 PriceDetailResponse priceDetailResponse= priceWrapper.getPriceDetailResponse( numAdults, numChildren);
	double totalPrice= (priceDetailResponse.getPricePerDayAdult()+priceDetailResponse.getPricePerDayChild())*numDays;
	return new RoomResponse( roomPartnerRequest.getRoomID(),  roomPartnerRequest.getCategoryName(),  totalPrice,priceDetailResponse);
	 
 }
 
}
