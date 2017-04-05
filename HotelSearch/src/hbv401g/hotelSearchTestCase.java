package hbv401g;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class hotelSearchTestCase {
	private ArrayList<Hotel> expectedResults;

	public void setUp() {
		expectedResults = new ArrayList<Hotel>();		
		expectedResults.add(new Hotel("Radison", "Reykjav�k", 3.5, 8990, true, true, false));
		expectedResults.add(new Hotel("Hotel Natura", "Reykjav�k", 4, 9990, true, false, false));
		expectedResults.add(new Hotel("Hotel J�n", "Reykjav�k", 4, 3990, false, false, false));
	}		
	
	
	public void tearDown() {
		expectedResults = null;
	}
	
	public void test() {
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		results = StorageControllerMock.getHotelsByLocation("Reykjav�k");
		assertEquals(results,expectedResults);
		/*
		if(results.size() != expectedResults.size()) {
			//Pr�fi� feila�i
		}
		else {
			//
			//for (int i = 0; i < expectedResults.size(); i++) {
			//	assertEquals(results.get(i).getHotelName() == expectedResults.get(i).getHotelName());
			//}
		}
		*/

	

}
}
