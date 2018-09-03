package br.com.cvc.entity;

import java.util.List;

public class HotelResponse {
	private int id;
	private String cityName;
	private List<RoomResponse> rooms;   
	public HotelResponse(int id, String cityName, List<RoomResponse> rooms) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.rooms = rooms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<RoomResponse> getRooms() {
		return rooms;
	}          
	public void setRooms(List<RoomResponse> rooms) {
		this.rooms = rooms;
	}
	  
}
/*
<dependency>
   <groupId>org.apache.cxf</groupId>
   <artifactId>cxf-rt-frontend-jaxrs</artifactId>
   <version>3.1.12</version>
</dependency>
*/