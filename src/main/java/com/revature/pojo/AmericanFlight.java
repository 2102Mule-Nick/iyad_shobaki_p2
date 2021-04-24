package com.revature.pojo;

public class AmericanFlight {

	private int Id;
	private String code;
	private float price;
	private String departureDate;
	private String origin;
	private String destination;
	private int emptySeats;
	private String planeType;
	private int planeTotalSeats;
	
	
	public AmericanFlight() {
		super();
	}

	
	public AmericanFlight(String code, float price, String departureDate, String origin, String destination,
			int emptySeats, String planeType, int planeTotalSeats) {
		super();
		this.code = code;
		this.price = price;
		this.departureDate = departureDate;
		this.origin = origin;
		this.destination = destination;
		this.emptySeats = emptySeats;
		this.planeType = planeType;
		this.planeTotalSeats = planeTotalSeats;
	}


	public void setId(int id) {
		this.Id = id;
	}
	public int getId() {
		return Id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getEmptySeats() {
		return emptySeats;
	}
	public void setEmptySeats(int emptySeats) {
		this.emptySeats = emptySeats;
	}
	public String getPlaneType() {
		return planeType;
	}
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	public int getPlaneTotalSeats() {
		return planeTotalSeats;
	}
	public void setPlaneTotalSeats(int planeTotalSeats) {
		this.planeTotalSeats = planeTotalSeats;
	}
	
	
}
