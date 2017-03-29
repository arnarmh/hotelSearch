package hbv401g;

public class Review {
	private final String hotel;
	private final double rating;
	private final String text;
	
	public Review(String hotelName,double reviewRating, String reviewText){
		hotel = hotelName;
		rating = reviewRating;
		text = reviewText;
		
	}

	public String getHotel() {
		return hotel;
	}

	public double getRating() {
		return rating;
	}

	public String getText() {
		return text;
	}

}
