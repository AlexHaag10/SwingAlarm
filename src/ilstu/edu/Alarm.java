package ilstu.edu;

import java.util.Calendar;


public class Alarm
{
	private Alarm[] alarmArray;
	private String optinalMessage = "";
	private int year, month, date, hours, minutes,seconds, arrayCount = 0, numberSnoozed = 0;
	
	
	public Alarm(int year,int month, int date, int hours, int minutes, int seconds) {
		
		this.date = date;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
		alarmArray = new Alarm[10];
	}
	
	public Alarm(int year,int month, int date, int hours, int minutes, int seconds, String optinalMessage) {
		
		this.date = date;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
		alarmArray = new Alarm[10];
	}
	
	public void Snooze(){
		int tempMin;
		int tempHour;
		if(this.getMinutes()>55) {
			tempHour=this.getHours()+1;
			tempMin=this.getMinutes()-55;
			new Alarm(this.year,this.month,this.date, tempHour, tempMin, this.seconds);
		}else {
		tempMin=this.getMinutes()+5;
		
		new Alarm(this.year,this.month,this.date, this.hours, tempMin, this.seconds);
		}
	}
	
	public void addAlarm(Alarm alarm) {
		if(arrayCount==9) {
			System.out.println("alarm is full");
		}
		else {
		alarmArray[arrayCount] = alarm;
		arrayCount++;
		}
	}
	
	public void setDate(int years, int month, int date) {
		this.year=years;
		this.month=month;
		this.date=date;
	}
	
	public void setTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void setMessage(String message) {
		this.optinalMessage = message;
	}
	
	public void soundAlarm(){
		try {
			for(int i = 0;i<10;i++) {
				if (alarmArray[i].getYear() == Calendar.getInstance().get(Calendar.YEAR) && 
						alarmArray[i].getMonth() == Calendar.getInstance().get(Calendar.MONTH) && 
						alarmArray[i].getDate() == Calendar.getInstance().get(Calendar.DATE) && 
						alarmArray[i].getHours() == Calendar.getInstance().get(Calendar.HOUR) &&
						alarmArray[i].getMinutes() == Calendar.getInstance().get(Calendar.MINUTE) && 
						alarmArray[i].getSeconds() == Calendar.getInstance().get(Calendar.SECOND))
					
				{
					System.out.println("ALARM WENT OFF");
					System.out.println(optinalMessage);
				
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println(" ");
		}
		
	
	}
		
	//Getters
	public int getYear(){
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public String getMessage()
	{
		return optinalMessage;
	}

	public int getNumSnooze() {
		return numberSnoozed;
	}
	
	@Override
	public String toString(){
		return "Date: " + getYear() + "/" + getMonth() + "/" + getDate() + "\t Time: " + getHours() + ":" + getMinutes() + ":"
				+ getSeconds();
	}
}
