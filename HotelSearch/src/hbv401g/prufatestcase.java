package hbv401g;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class prufatestcase {
	private ArrayList<Hotel> expectedResults;
	private ArrayList<Hotel> results;
	
	public void setUp() {
		results = new ArrayList<Hotel>();
		expectedResults = new ArrayList<Hotel>();	
		StorageControllerMock  prufa = new StorageControllerMock();		
		results = StorageControllerMock.getHotelsByLocation("Reykjavík");
		expectedResults.add(new Hotel("Radison", "Reykjavík", 3.5, 8990, true, true, false));
		expectedResults.add(new Hotel("Hotel Natura", "Reykjavík", 4, 9990, true, false, false));
		expectedResults.add(new Hotel("Hotel Jón", "Reykjavík", 4, 3990, false, false, false));
	}	
	public void setUpStars(){
		expectedResults = new ArrayList<Hotel>();	
		expectedResults.add(new Hotel("Hotel Natura", "Reykjavík", 4, 9990, true, false, false));
		expectedResults.add(new Hotel("Hotel Jón", "Reykjavík", 4, 3990, false, false, false));
		StorageControllerMock  prufa = new StorageControllerMock();		
		results = prufa.getHotelsByStars(4);	
		
	}
	public void setUpDiscount(){
		expectedResults = new ArrayList<Hotel>();	
		expectedResults.add(new Hotel("Hotel Arnar", "Egilsstaðir", 5, 12990, true, true, true));
		expectedResults.add(new Hotel("Hotel Vodka", "Ísafjörður", 1, 990, true, true, true));
		StorageControllerMock  prufa = new StorageControllerMock();		
		results = prufa.getHotelsByDiscount();	
		
	}
	
	
	public void tearDown() {
		expectedResults = null;
		results = null;
	}

	@Test
	public void test() {
		setUp();
		for (int i = 0; i < expectedResults.size(); i++) {
				assertEquals(results.get(i).getHotelName(), expectedResults.get(i).getHotelName());
				
		}
		tearDown();
		setUpStars();
		for (int i = 0; i < expectedResults.size(); i++) {
			assertEquals(results.get(i).getHotelName(), expectedResults.get(i).getHotelName());
		}
		tearDown();
		setUpDiscount();
		for (int i = 0; i < expectedResults.size(); i++) {
			assertEquals(results.get(i).getHotelName(), expectedResults.get(i).getHotelName());
		}
		
		
		

	}

}
