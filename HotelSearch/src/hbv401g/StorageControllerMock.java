package hbv401g;

import java.util.ArrayList;

public class StorageControllerMock {
	private ArrayList<Hotel> hotels;
	
	public StorageControllerMock() {
		hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel("Radison", "Reykjavík", 3.5, 8990, true, true, false));
		hotels.add(new Hotel("Hotel Natura", "Reykjavík", 4, 9990, true, false, false));
	}
	
	public ArrayList<Hotel> getHotelsByLocation(String location) {
		ArrayList<Hotel> hotelResults = new ArrayList<Hotel>();
		for( int i = 0; i < hotels.size(); i++ ) {
			if(hotels.get(i).getLocation().equals(location)) {
				hotelResults.add(hotels.get(i));
			}
		}
		return hotelResults;
	}
}
