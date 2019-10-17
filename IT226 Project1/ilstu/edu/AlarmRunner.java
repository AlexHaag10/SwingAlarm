package ilstu.edu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AlarmRunner
{
	public static void main(String[]args)
	{
		
	
	int x = 1;
	while (x!=0) {
		Alarm alarm = new Alarm(2019, 3, 10, 11, 13);
		alarm.addAlarm(new Alarm(2019, 3, 10, 11, 13 ));

		
		alarm.addAlarm(alarm);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		//System.out.println("\n\n" + Calendar.getInstance().get(Calendar.SECOND)+ "\n\n");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		alarm.soundAlarm();
	
	}
	}
}