package hbv401g;

// Eiginleiki herbergja
public class Room {
	private final String roomType;
	private final String location;
	private int pricePerNight;
	private boolean isBooked;
	
	public Room(String type, String roomLocation, int price){
		roomType = type;
		location = roomLocation;
		pricePerNight = price;
	}
	

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public String getRoomType() {
		return roomType;
	}

	public String getLocation() {
		return location;
	}
	

}
