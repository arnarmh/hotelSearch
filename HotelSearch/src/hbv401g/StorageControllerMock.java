package hbv401g;

import java.util.ArrayList;

public class StorageControllerMock {
	private static ArrayList<Hotel> hotels;
	
	public  StorageControllerMock() {
		hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel("Radison", "Reykjavik", 3.5, 8990, true, true, false));
		hotels.add(new Hotel("Hotel Natura", "Reykjavik", 4, 9990, true, false, false));
		hotels.add(new Hotel("Hotel Kea", "Akureyri", 2.5, 7990, true, false, false));
		hotels.add(new Hotel("Hotel Keflavik", "Keflavik", 4.5, 10990, true, false, false));
		hotels.add(new Hotel("Hotel Arnar", "Egilsstadir", 5, 12990, true, true, true));
		hotels.add(new Hotel("Hotel Jon", "Reykjavik", 4, 3990, false, false, false));
		hotels.add(new Hotel("Hotel Vodka", "Isafjordur", 1, 990, true, true, true));
		hotels.add(new Hotel("Hotel Vampyra", "Husavik", 5, 19990, false, true, false));
		
	}
	
	public static ArrayList<Hotel> getHotelsByLocation(String location) {
		ArrayList<Hotel> hotelResults = new ArrayList<Hotel>();
		for( int i = 0; i <  hotels.size() ; i++ ) {
			if(hotels.get(i).getLocation().equals(location)) {
				hotelResults.add(hotels.get(i));
			}
		}
		return hotelResults;
	}
	
	public ArrayList<Hotel> getHotelsByStars(double stars){
		ArrayList<Hotel> hotelResults = new ArrayList<Hotel>();
		for( int i = 0; i < hotels.size(); i++ ) {
			if(hotels.get(i).getStars() == stars) {
				hotelResults.add(hotels.get(i));
			}
		}
		return hotelResults;
		
	}
	
	public ArrayList<Hotel> getHotelsByDiscount(){
		ArrayList<Hotel> hotelResults = new ArrayList<Hotel>();
		for( int i = 0; i < hotels.size(); i++ ) {
			if(hotels.get(i).isHasDiscount()) {
				hotelResults.add(hotels.get(i));
			}
		}
		return hotelResults;
		
	}
}
