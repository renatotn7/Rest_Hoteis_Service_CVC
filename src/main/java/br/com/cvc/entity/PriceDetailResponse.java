package br.com.cvc.entity;

public class PriceDetailResponse {
	private double pricePerDayAdult	;
	private double pricePerDayChild; 
	public PriceDetailResponse(double pricePerDayAdult, double pricePerDayChild) {
		super();    
		this.pricePerDayAdult = pricePerDayAdult;
		this.pricePerDayChild = pricePerDayChild;
	}  
	public double getPricePerDayAdult() {
		return pricePerDayAdult;
	}         
	public void setPricePerDayAdult(double pricePerDayAdult) {
		this.pricePerDayAdult = pricePerDayAdult;
	}
	public double getPricePerDayChild() {
		return pricePerDayChild;
	}
	public void setPricePerDayChild(double pricePerDayChild) {
		this.pricePerDayChild = pricePerDayChild;
	}
}
