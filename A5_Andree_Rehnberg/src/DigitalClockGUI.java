import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField minuteField;
	private JTextField hourField;
	public ClockLogic clockLogic;
	private JLabel lblCurrentTime;
	private JLabel lblAlarmTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setTitle("Alarm clock");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/icon/alarmclock.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 305);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHour = new JLabel("Hour:");
		lblHour.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHour.setBounds(12, 172, 58, 29);
		contentPane.add(lblHour);

		JLabel lblMinute = new JLabel("Minute:");
		lblMinute.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMinute.setBounds(146, 172, 67, 29);
		contentPane.add(lblMinute);

		minuteField = new JTextField();
		minuteField.setText("");
		minuteField.setBounds(225, 173, 58, 28);
		contentPane.add(minuteField);
		minuteField.setColumns(10);

		hourField = new JTextField();
		hourField.setText("");
		hourField.setColumns(10);
		hourField.setBounds(76, 172, 58, 28);
		contentPane.add(hourField);

		lblCurrentTime = new JLabel("00:00:00");
		lblCurrentTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentTime.setFont(new Font("Arial", Font.PLAIN, 40));
		lblCurrentTime.setBounds(0, 49, 309, 72);
		contentPane.add(lblCurrentTime);

		lblAlarmTime = new JLabel("No alarm set!");
		lblAlarmTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmTime.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAlarmTime.setBounds(76, 119, 160, 40);
		contentPane.add(lblAlarmTime);
		
		JButton btnSetAlarm = new JButton("Set alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hour = Integer.parseInt(hourField.getText());
				int minute = Integer.parseInt(minuteField.getText());
				
				if (hour >= 0 &&  hour < 24 && minute >= 0 && minute < 60){
				
				DecimalFormat correctTime = new DecimalFormat("00");
				
				clockLogic.setAlarm(hour, minute);
				lblAlarmTime.setText("Alarm set to: " + correctTime.format(hour) + ":" + correctTime.format(minute));
				}
			}
		});
		btnSetAlarm.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSetAlarm.setBounds(12, 214, 137, 30);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear alarm");
		btnClearAlarm.setFont(new Font("Arial", Font.PLAIN, 13));
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				lblAlarmTime.setText("No alarm set!");
			}
		});
		btnClearAlarm.setBounds(161, 214, 136, 30);
		contentPane.add(btnClearAlarm);
		
		clockLogic = new ClockLogic(this);	
	}

	public void setTimeOnLabel(String time){
		lblCurrentTime.setText(time);
	}

	public void activateAlarm(boolean activate) {
		if (activate) {
			System.out.println("ALARM!!!!");
			Toolkit.getDefaultToolkit().beep();
			contentPane.setBackground(new Color(255, 150, 150));
		} else {
			System.out.println("inget alarm");
			contentPane.setBackground(new Color(255, 255, 255));
		}
	}
}
