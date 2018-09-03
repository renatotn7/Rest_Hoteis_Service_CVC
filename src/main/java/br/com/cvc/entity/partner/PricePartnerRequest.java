package br.com.cvc.entity.partner;

public class PricePartnerRequest {
	 private double adult;
	 private double child;
	public PricePartnerRequest(double adult, double child) {
		super();
		this.adult = adult;
		this.child = child;
	}      
	public PricePartnerRequest() {
		        
	}
	public double getAdult() {
		return adult;
	}
	public void setAdult(double adult) {
		this.adult = adult;
	}
	public double getChild() {
		return child;
	}
	public void setChild(double child) {
		this.child = child;
	}
}
