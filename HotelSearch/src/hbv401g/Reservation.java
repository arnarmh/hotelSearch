package hbv401g;

public class Reservation {
	private final String startDate;
	private final String endDate;
	private final String hotel;
	private final int ssn;
	private final int resId;
	private final String specialNeeds;
	private final String email;
	
	public Reservation(String startD,String endD,String hotelName,int ssNumber,String needs, String mail ){
		startDate = startD;
		endDate = endD;
		hotel = hotelName;
		ssn = ssNumber;
		//finna lei� til a� halda utan um resId svo �au s�u � r�� e�a eithva�
		resId = 1; //resId = UUID.randomUUID().toString() og breyta resId � string (og importa UUID)
		specialNeeds = needs;
		email = mail;
				
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getHotel() {
		return hotel;
	}

	public int getSsn() {
		return ssn;
	}

	public int getResId() {
		return resId;
	}

	public String getSpecialNeeds() {
		return specialNeeds;
	}

	public String getEmail() {
		return email;
	}

}
