package br.com.cvc.entity.partner;

public class RoomPartnerRequest {
	private int roomID;
	private String categoryName;
	private PricePartnerRequest price;
	public RoomPartnerRequest(int roomID, String categoryName, PricePartnerRequest price) {
		super();
		this.roomID = roomID;
		this.categoryName = categoryName;
		this.price = price;
	}      
	public RoomPartnerRequest() {
		 
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
	public PricePartnerRequest getPrice() {
		return price;
	}
	public void setPrice(PricePartnerRequest price) {
		this.price = price;
	}
 
}
