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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField Color_Input;
	private JTextField Size_Input;
	private JTextField Price_Input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		BikeStore.addBike("Silver", 18, 5000);
		BikeStore.addBike("Blå", 27, 18000);
		BikeStore.addBike("Grön", 10, 2000);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Color_Input = new JTextField();
		Color_Input.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Color_Input.setText("");
		Color_Input.setBounds(27, 55, 116, 37);
		contentPane.add(Color_Input);
		Color_Input.setColumns(10);

		Size_Input = new JTextField();
		Size_Input.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Size_Input.setText("");
		Size_Input.setBounds(155, 55, 116, 37);
		contentPane.add(Size_Input);
		Size_Input.setColumns(10);

		Price_Input = new JTextField();
		Price_Input.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Price_Input.setText("");
		Price_Input.setBounds(283, 55, 116, 37);
		contentPane.add(Price_Input);
		Price_Input.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 152, 372, 261);
		contentPane.add(scrollPane);

		JTextArea CykelLista = new JTextArea();
		CykelLista.setFont(new Font("Monospaced", Font.PLAIN, 18));
		CykelLista.setText(BikeStore.getAllBikes());
		scrollPane.setViewportView(CykelLista);

		JTextArea txtrCyklar_1 = new JTextArea();
		txtrCyklar_1.setFont(new Font("Monospaced", Font.PLAIN, 24));
		txtrCyklar_1.setText("Cyklar!");
		scrollPane.setColumnHeaderView(txtrCyklar_1);

		JLabel lblFrg = new JLabel("F\u00E4rg:");
		lblFrg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFrg.setBounds(27, 26, 116, 25);
		contentPane.add(lblFrg);

		JLabel lblStorlek = new JLabel("Storlek:");
		lblStorlek.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStorlek.setBounds(155, 26, 116, 25);
		contentPane.add(lblStorlek);

		JLabel lblPris = new JLabel("Pris:");
		lblPris.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPris.setBounds(283, 26, 116, 25);
		contentPane.add(lblPris);

		JButton btnLggTillCykel = new JButton("L\u00E4gg till cykel");
		btnLggTillCykel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int convertSize = Integer.parseInt(Size_Input.getText());
				int convertPrice = Integer.parseInt(Price_Input.getText());

				BikeStore.addBike(Color_Input.getText(), convertSize, convertPrice);
				CykelLista.setText(BikeStore.getAllBikes());
				Color_Input.setText("");
				Size_Input.setText("");
				Price_Input.setText("");
			}
		});
		btnLggTillCykel.setBounds(27, 105, 372, 34);
		contentPane.add(btnLggTillCykel);

	}
}
