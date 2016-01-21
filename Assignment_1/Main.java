import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtDarthVader;
	private JTextField txtOknt;
	private JTextField txtDeathStar;
	private JTextField textField;
	private JTextField txtVaderdarthgalacticfederationgov;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 92, 207, 322);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(Color.WHITE);
		table.setFont(UIManager.getFont("Button.font"));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Darth Vader"},
				{"Princess Leia"},
				{"Luke Skywalker"},
				{"Anakin Skywalker"},
				{"Padm\u00E9 Amidala"},
				{"Jar Jar Binks"},
				{"Kylo Ren"},
				{"Han Solo"},
				{"Obi-Wan Kenobi"},
				{"Emperor Palpatine"},
				{"Rey"},
				{"Count Doku"},
				{"Yoda"},
				{"Finn"},
				{"Mace Windu"},
				{"Poe Dameron"},
				{"General Hux"},
				{"R2-D2"},
				{"C-3PO"},
				{"BB-8"},
			},
			new String[] {
				"Medlemmar"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblSupergymmet = new JLabel("A GYM FAR, FAR A WAY");
		lblSupergymmet.setForeground(Color.YELLOW);
		lblSupergymmet.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 30));
		lblSupergymmet.setBounds(235, 13, 372, 66);
		contentPane.add(lblSupergymmet);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setForeground(Color.YELLOW);
		lblName.setBounds(588, 92, 56, 16);
		contentPane.add(lblName);
		
		txtDarthVader = new JTextField();
		txtDarthVader.setText("Darth Vader");
		txtDarthVader.setBounds(588, 113, 207, 22);
		contentPane.add(txtDarthVader);
		txtDarthVader.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDateOfBirth.setForeground(Color.YELLOW);
		lblDateOfBirth.setBounds(588, 148, 207, 16);
		contentPane.add(lblDateOfBirth);
		
		txtOknt = new JTextField();
		txtOknt.setText("UNKNOWN");
		txtOknt.setBounds(588, 168, 207, 22);
		contentPane.add(txtOknt);
		txtOknt.setColumns(10);
		
		JLabel lblAdress = new JLabel("ADDRESS:");
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdress.setForeground(Color.YELLOW);
		lblAdress.setBounds(588, 203, 207, 16);
		contentPane.add(lblAdress);
		
		txtDeathStar = new JTextField();
		txtDeathStar.setText("Death Star");
		txtDeathStar.setBounds(588, 222, 207, 22);
		contentPane.add(txtDeathStar);
		txtDeathStar.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhoneNumber.setForeground(Color.YELLOW);
		lblPhoneNumber.setBounds(588, 257, 207, 16);
		contentPane.add(lblPhoneNumber);
		
		textField = new JTextField();
		textField.setText("09237-46263870403753");
		textField.setBounds(588, 276, 207, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setForeground(Color.YELLOW);
		lblEmail.setBounds(588, 311, 207, 16);
		contentPane.add(lblEmail);
		
		txtVaderdarthgalacticfederationgov = new JTextField();
		txtVaderdarthgalacticfederationgov.setText("vader.darth@galacticrepublic.gov");
		txtVaderdarthgalacticfederationgov.setBounds(588, 328, 207, 22);
		contentPane.add(txtVaderdarthgalacticfederationgov);
		txtVaderdarthgalacticfederationgov.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/Pictures/darth-vader.jpg")));
		lblNewLabel.setBounds(257, 100, 300, 300);
		contentPane.add(lblNewLabel);
		
		JButton btnSaveProfile = new JButton("SAVE PROFILE");
		btnSaveProfile.setBounds(588, 375, 207, 25);
		contentPane.add(btnSaveProfile);
	}
}
