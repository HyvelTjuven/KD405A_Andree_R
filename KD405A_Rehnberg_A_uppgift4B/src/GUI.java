

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class GUI extends JFrame {

	private JPanel contentPane;
	/** ArrayList of animals */
	private ArrayList<Animal> animalList; { 
		animalList = new ArrayList<Animal>();{
			animalList.add(new Dog("Canis lupus familiaris", 3, false, "Anna"));
			animalList.add(new Dog("Canis lupus familiaris", 3, true, "Puck"));
			animalList.add(new Dog("Canis lupus familiaris", 3, false, "Asta"));
			animalList.add(new Cat("Felis catus", 5, 9, "Luna"));
			animalList.add(new Cat("Felis catus", 5, 5, "Anki"));
			animalList.add(new Cat("Felis catus", 5, 7, "Missan"));
			animalList.add(new Snake("Naja naja", true, "Kobra"));
			animalList.add(new Snake("Boa constrictor", false, "Kungsboa"));
			animalList.add(new Snake("Python bivittatus", false, "Burmesisk pyton"));
	}
		
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		for (Animal all : animalList){
			System.out.println(all.getInfo());
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblListOfAnimals = new JLabel("List of animals");
		scrollPane.setColumnHeaderView(lblListOfAnimals);
		
		/** Creates a String containing all animals */
		String s = "";
		for (Animal all : animalList){
			s = s + all.getInfo() + "\n";
		}
		textArea.setText(s);
	}

}
