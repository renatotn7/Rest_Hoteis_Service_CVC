package br.com.cvc.businessRules.wrapper;

import br.com.cvc.entity.PriceDetailResponse;
import br.com.cvc.entity.partner.PricePartnerRequest;

public class PriceWrapper {
	private PricePartnerRequest pricePartnerRequest;
	 
	public PriceWrapper(PricePartnerRequest pricePartnerRequest) {
		this.pricePartnerRequest=pricePartnerRequest;	
	}
	public PriceDetailResponse getPriceDetailResponse(int numAdults, int numChildren){
		double priceAdultByDay = (pricePartnerRequest.getAdult()*(double)(numAdults))/0.7;
		double priceChildByDay = (pricePartnerRequest.getChild()*(double)(numChildren))/0.7;
		return new PriceDetailResponse(priceAdultByDay,priceChildByDay);
		 
	}
	public double getPricePerDayAdult() {
		return pricePartnerRequest.getAdult();
	}         
	
}
