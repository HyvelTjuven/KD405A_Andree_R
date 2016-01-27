import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	private ArrayList<House> manyhouses = new ArrayList<House>();
	private Random rand = new Random();
	private int randomYear;
	private int randomSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		// 1.2
		House myHouse1 = new House(1870, 66);
		House myHouse2 = new House(1963, 520);
		House myHouse3 = new House(2014, 618);

		System.out.println("Assignment 1.2");
		System.out.println(myHouse1.getYearBuilt() + "\t" + myHouse1.getSize());
		System.out.println(myHouse2.getYearBuilt() + "\t" + myHouse2.getSize());
		System.out.println(myHouse3.getYearBuilt() + "\t" + myHouse3.getSize());

		textArea.append("Assingment 1.2 \n");
		textArea.append("Byggår: " + myHouse1.getYearBuilt() + "\t Storlek: " + myHouse1.getSize() + " m^2" + "\n");
		textArea.append("Byggår: " + myHouse2.getYearBuilt() + "\t Storlek: " + myHouse2.getSize() + " m^2" + "\n");
		textArea.append("Byggår: " + myHouse3.getYearBuilt() + "\t Storlek: " + myHouse3.getSize() + " m^2" + "\n");

		// 1.3
		myHouses = new House[10];
		myHouses[0] = new House(1992, 77);
		myHouses[1] = new House(1888, 125);
		myHouses[2] = new House(1999, 423);
		myHouses[3] = new House(1925, 73);
		myHouses[4] = new House(1872, 65);
		myHouses[5] = new House(2001, 188);
		myHouses[6] = new House(2014, 99);
		myHouses[7] = new House(1977, 205);
		myHouses[8] = new House(1944, 570);
		myHouses[9] = new House(1955, 999);

		System.out.println("Assignment 1.3");
		textArea.append("Assingment 1.3 \n");
		for (int i = 0; i < myHouses.length; i++) {
			System.out.println(myHouses[i].getYearBuilt() + "\t" + myHouses[i].getSize());
			textArea.append(
					"Byggår: " + myHouses[i].getYearBuilt() + "\t Storlek: " + myHouses[i].getSize() + " m^2" + "\n");
		}

		// 1.4

		System.out.println("Assignment 1.4");
		textArea.append("Assingment 1.4 \n");

		for (int i = 0; i < 100; i++) {
			randomYear = rand.nextInt(House.getmaxYear() - House.getminYear() + 1) + House.getminYear();
			randomSize = rand.nextInt(House.getmaxSize() - House.getminSize() + 1) + House.getminSize();
			manyhouses.add(new House(randomYear, randomSize));
			System.out.println(manyhouses.get(i).getYearBuilt() + "\t" + manyhouses.get(i).getSize());
			textArea.append("Byggår: " + manyhouses.get(i).getYearBuilt() + "\t Storlek: " + manyhouses.get(i).getSize()
					+ " m^2" + "\n");
		}
	}

}
