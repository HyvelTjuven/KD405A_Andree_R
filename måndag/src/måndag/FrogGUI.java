package måndag;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FrogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;
	private Frog[] myFrogs;
	private ArrayList<Frog> FrogArmy = new ArrayList<Frog>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrogGUI frame = new FrogGUI();
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
	public FrogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		Frog frog1 = new Frog(12, "k3larra", 5);
		String frog1Name = frog1.getName();
		int frog1Age = frog1.getAge();
		int frog1Size = frog1.getSize();
		*/
		
		myFrogs = new Frog[3];
		
		myFrogs[0] = new Frog(34, "Bertil", 234);
		myFrogs[1] = new Frog(23, "Göran", 76);
		myFrogs[2] = new Frog(5, "Martin", 14);
		
		for (int i = 0; i < 100; i++){
			FrogArmy.add(new Frog(10, "grodsoldat", 20));
		}
		
		txtText = new JTextField();
		txtText.setText(frogNames);
		txtText.setBounds(137, 77, 367, 230);
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		for(int i = 0; i < myFrogs.length; i++){
			frogNames = myFrogs[i].getName();
		}
		
	}
}
