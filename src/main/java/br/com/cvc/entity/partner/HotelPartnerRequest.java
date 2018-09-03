package br.com.cvc.entity.partner;

import java.util.List;



public class HotelPartnerRequest {
	private int id;
	private String name	;     	
	private String cityCode;
	private String cityName;
	private List<RoomPartnerRequest> rooms; 
	public HotelPartnerRequest() {
		
	}
	public HotelPartnerRequest(int id, String name, String cityCode, String cityName, List<RoomPartnerRequest> rooms) {
		super();
		this.id = id;
		this.name = name;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.rooms = rooms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}     
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<RoomPartnerRequest> getRooms() {
		return rooms;  
	}
	public void setRooms(List<RoomPartnerRequest> rooms) {
		this.rooms = rooms;
	}
}
