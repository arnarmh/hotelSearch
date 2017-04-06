package hbv401g;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Interface {

	private JFrame frame;
	private JTextField starsField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ArrayList<Hotel> StarsMethod(double stars) {
		ArrayList<Hotel> hotels = new StorageControllerMock().getHotelsByStars(stars);
		for(int i = 0; i < hotels.size(); i++) {
			System.out.println(hotels.get(i).getHotelName());
		}
		return hotels;
	}
	
	public ArrayList<Hotel> LocationMethod() {
		ArrayList<Hotel> hotels = new StorageControllerMock().getHotelsByLocation("Reykjavik");
		for(int i = 0; i < hotels.size(); i++) {
			System.out.println(hotels.get(i).getHotelName());
		}
		return hotels;
	}
	
	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSearchStars = new JButton("Search by stars");
		btnSearchStars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(starsField.getText() == null)
					try {
						throw new Exception();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				double stars = Double.parseDouble(starsField.getText());
				StarsMethod(stars);
			}
		});
		btnSearchStars.setBounds(40, 40, 144, 29);
		frame.getContentPane().add(btnSearchStars);
		
		JButton btnSearchLocation = new JButton("Search by location");
		btnSearchLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocationMethod();
			}
		});
		btnSearchLocation.setBounds(40, 97, 144, 29);
		frame.getContentPane().add(btnSearchLocation);
		
		starsField = new JTextField();
//	
		starsField.setBounds(232, 40, 130, 26);
		frame.getContentPane().add(starsField);
		starsField.setColumns(10);
	}
}
