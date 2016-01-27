import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private Calculator myCalculator = new Calculator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 367);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
		textArea.setText("");
		textArea.setBounds(12, 13, 317, 48);
		contentPane.add(textArea);

		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button_0.setBounds(12, 257, 97, 48);
		contentPane.add(button_0);

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button_1.setBounds(12, 196, 97, 48);
		contentPane.add(button_1);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_2.setBounds(121, 196, 97, 48);
		contentPane.add(button_2);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_3.setBounds(230, 196, 97, 48);
		contentPane.add(button_3);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_4.setBounds(12, 135, 97, 48);
		contentPane.add(button_4);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_5.setBounds(121, 135, 97, 48);
		contentPane.add(button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_6.setBounds(230, 135, 97, 48);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_7.setBounds(12, 74, 97, 48);
		contentPane.add(button_7);

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_8.setBounds(121, 74, 97, 48);
		contentPane.add(button_8);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_9.setBounds(230, 74, 97, 48);
		contentPane.add(button_9);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("+");
				myCalculator.plus();
			}
		});
		button_plus.setBounds(339, 196, 48, 48);
		contentPane.add(button_plus);

		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("-");
				myCalculator.minus();
			}
		});
		button_minus.setBounds(339, 135, 48, 48);
		contentPane.add(button_minus);
		
		JButton button_multiply = new JButton("*");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("*");
				myCalculator.mult();
			}
		});
		button_multiply.setBounds(339, 74, 48, 48);
		contentPane.add(button_multiply);
		
		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				textArea.setText(String.valueOf(myCalculator.getResult()));
			}
		});
		button_equals.setBounds(121, 257, 266, 48);
		contentPane.add(button_equals);
		
		JButton button_clear = new JButton("C");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.clear();
				textArea.setText("");
			}
		});
		button_clear.setBounds(338, 13, 48, 48);
		contentPane.add(button_clear);

	}
}
