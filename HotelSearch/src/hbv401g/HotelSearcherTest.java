package hbv401g;
import static org.junit.Assert.*;

import org.junit.Test;

public class HotelSearcherTest {

	public void setUp() {
		
	}
	
	public void tearDown() {
		
	}
	
	public void testSortByPrice() {
		//...
		
		if(results.size() != expectedResults.size()) {
			//Prófið feilaði
		}
		else {
			for (int i = 0; i < expectedResults.size(); i++) {
				assertEquals(results.get(i).getId() == expectedResults.get(i).getId());
			}
		}
	}
	
	
	
}
