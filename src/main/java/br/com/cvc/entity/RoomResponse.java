package br.com.cvc.entity;

public class RoomResponse {
private int roomID;
private String categoryName;
private double 	totalPrice;
private PriceDetailResponse priceDetail;  
public RoomResponse(int roomID, String categoryName, double totalPrice, PriceDetailResponse priceDetail) {
	super();    
	this.roomID = roomID;
	this.categoryName = categoryName;
	this.totalPrice = totalPrice;
	this.priceDetail = priceDetail;
}
public int getRoomID() {
	return roomID;
}
public void setRoomID(int roomID) {
	this.roomID = roomID;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public double getTotalPrice() {
	return totalPrice;
}         
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public PriceDetailResponse getPriceDetail() {
	return priceDetail;
}
public void setPriceDetail(PriceDetailResponse priceDetail) {
	this.priceDetail = priceDetail;
}
}
