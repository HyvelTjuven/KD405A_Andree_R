import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanNameField;
	private JTextField dogNameField;

	public Human human = new Human("");

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		humanNameField = new JTextField();
		humanNameField.setText("");
		humanNameField.setBounds(12, 42, 116, 22);
		contentPane.add(humanNameField);
		humanNameField.setColumns(10);

		dogNameField = new JTextField();
		dogNameField.setText("");
		dogNameField.setBounds(12, 91, 116, 22);
		contentPane.add(dogNameField);
		dogNameField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 188, 408, 96);
		contentPane.add(scrollPane);

		JTextArea infoTextArea = new JTextArea();
		infoTextArea.setText("");
		scrollPane.setViewportView(infoTextArea);

		JLabel lblInfo = new JLabel("Info");
		scrollPane.setColumnHeaderView(lblInfo);

		JLabel lblHumanName = new JLabel("Human name");
		lblHumanName.setBounds(12, 25, 116, 16);
		contentPane.add(lblHumanName);

		JLabel lblDogName = new JLabel("Dog name");
		lblDogName.setBounds(12, 75, 116, 16);
		contentPane.add(lblDogName);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 297, 408, 103);
		contentPane.add(scrollPane_1);

		JTextArea errorTextArea = new JTextArea();
		errorTextArea.setText("");
		scrollPane_1.setViewportView(errorTextArea);

		JLabel lblErrorMessage = new JLabel("Error message");
		scrollPane_1.setColumnHeaderView(lblErrorMessage);

		JButton btnNewHuman = new JButton("New human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				errorTextArea.setText("");
				if (humanNameField.getText().length() > 3) {
					human = new Human(humanNameField.getText());
				} else {
					errorTextArea.setText("Human name must have at least 3 characters");
				}
			}
		});
		btnNewHuman.setBounds(168, 41, 116, 25);
		contentPane.add(btnNewHuman);

		JButton btnNewDog = new JButton("Buy dog");
		btnNewDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				errorTextArea.setText("");
				if (dogNameField.getText().equals("")){
					errorTextArea.setText("The dog must have a name");
				} else {
					Dog dog1 = new Dog(dogNameField.getText());
					human.buyDog(dog1);
				}
			} 
		});

		btnNewDog.setBounds(168, 90, 116, 25);
		contentPane.add(btnNewDog);

		JButton btnNewButton = new JButton("Print info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoTextArea.setText(human.getInfo());
			}
		});
		btnNewButton.setBounds(168, 136, 116, 25);
		contentPane.add(btnNewButton);
	}
}
