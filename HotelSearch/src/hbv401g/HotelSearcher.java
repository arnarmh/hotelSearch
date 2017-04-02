package hbv401g;

import java.util.ArrayList;

public class HotelSearcher {
	private StorageControllerMock storageController;
	
	public HotelSearcher() {
		storageController = new StorageControllerMock();
	}
	
	public ArrayList<Hotel> searchByLocation(String location) {
		return storageController.getHotelsByLocation(location);
	}
	
	public ArrayList<Hotel> sortByPrice(ArrayList<Hotel>, String order) {
		if(order.equals("desc")) {
			//...
		}
		else if (order.equals("asc")) {
			//....
		}
		else {
			throw new Exception();
		}
	}

}
