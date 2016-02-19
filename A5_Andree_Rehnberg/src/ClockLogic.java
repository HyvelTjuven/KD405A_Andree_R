import java.util.Calendar;
import java.text.DecimalFormat;

public class ClockLogic {
	
	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;

	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		this.clockGUI = digitalClockGUI;
		
		new ClockThread().start();
		
	}

	public void setAlarm(int hours, int minutes) {
		alarmHour = hours;
		alarmMinute = minutes;
	}

	public void clearAlarm() {
		setAlarm(-1, -1);
		clockGUI.activateAlarm(false);

	}

	private class ClockThread extends Thread {
		@Override
		public void run() {
			while (true) {
				Calendar cal = Calendar.getInstance();
				int hour = cal.get(cal.HOUR_OF_DAY);
				int minute = cal.get(cal.MINUTE);
				int second = cal.get(cal.SECOND);
				
				DecimalFormat correctTime = new DecimalFormat("00");
				clockGUI.setTimeOnLabel(correctTime.format(hour) + ":" + correctTime.format(minute) + ":" + correctTime.format(second));
				//clockGUI.setTimeOnLabel(hour + ":" + minute + ":" + second);
				
				if (hour == alarmHour && minute == alarmMinute){
					clockGUI.activateAlarm(true);
				} else {
					clockGUI.activateAlarm(false);
				}
				
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}

			}

		}
	}
}
