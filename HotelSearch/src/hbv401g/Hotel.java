package hbv401g;

public class Hotel {
	private final String hotelName;
	private final String location;
	private final double stars;
	private final int lowestPrice;
	private boolean hasWifi;
	private boolean hasFreeParking;
	private boolean hasDiscount;
	
	public Hotel(String name, String hotelLocation, double hotelStars,int lPrice, boolean wifi, boolean park,boolean discount ){
		hotelName = name;
		location = hotelLocation;
		stars = hotelStars;
		lowestPrice = lPrice;
		hasWifi = wifi;
		hasFreeParking = park;
		hasDiscount = discount;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public boolean isHasFreeParking() {
		return hasFreeParking;
	}

	public void setHasFreeParking(boolean hasFreeParking) {
		this.hasFreeParking = hasFreeParking;
	}

	public boolean isHasDiscount() {
		return hasDiscount;
	}

	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getLocation() {
		return location;
	}

	public double getStars() {
		return stars;
	}

	public int getLowestPrice() {
		return lowestPrice;
	}

}
