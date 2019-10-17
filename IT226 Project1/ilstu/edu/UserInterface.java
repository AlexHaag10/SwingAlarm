package ilstu.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface{
	
//Constructor for creating the frame
	public UserInterface() {
		JTabbedPane tabbedPane = new JTabbedPane();
		JFrame frame = new JFrame("Alarms");
		
//-------------------------------------------------------------------------------------
		
		
		
		
		
		
//----------------------------------------------------------------------		
		JPanel addAlarmPanel = new JPanel();
			addAlarmPanel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
		
			JTextArea month, day, year, hour, minute, second;
			String mo,d,yr,hr,min,sec;
			

			
			JButton addAlarm = new JButton("Add Alarm");
			gbc.gridx = 3;
			gbc.gridy = 5;
			addAlarmPanel.add(addAlarm, gbc);
			
			month = new JTextArea("Month",1,6);
			gbc.gridx = 0;
			gbc.gridy = 0;
			addAlarmPanel.add(month, gbc);
			
			day = new JTextArea("Day",1,6);
			gbc.gridx = 1;
			gbc.gridy = 0;
			addAlarmPanel.add(day);
			
			year = new JTextArea("Year",1,6);
			gbc.gridx = 2;
			gbc.gridy = 0;
			addAlarmPanel.add(year);
			
			hour = new JTextArea("Hour",1,6);
			gbc.gridx = 0;
			gbc.gridy = 1;
			addAlarmPanel.add(hour);
			
			minute = new JTextArea("Minute",1,6);
			gbc.gridx = 1;
			gbc.gridy = 1;
			addAlarmPanel.add(minute);
			
			second = new JTextArea("Second",1,6);
			gbc.gridx = 2;
			gbc.gridy = 1;
			addAlarmPanel.add(second);
			
			class addButtonActionListener implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					//logic for the button, can parse from text areas using 
					//   String text = textareaName.getText();
					String number = month.getText();
					int mon = Integer.parseInt(number);
					String number2 = day.getText();
					int da = Integer.parseInt(number2);
					String number3 = year.getText();
					int yea = Integer.parseInt(number3);
					String number4 = hour.getText();
					int hou = Integer.parseInt(number4);
					String number5 = minute.getText();
					int min = Integer.parseInt(number5);
					String number6 = second.getText();
					int sec = Integer.parseInt(number6);
					
					Alarm a= new Alarm(yea,mon,da,hou,min,sec);
					System.out.print(a);
				}
			}
				//adds the logic from the above class
			addAlarm.addActionListener(new addButtonActionListener());

//-------------------------------------------------------------------------------------
			
		JPanel checkAlarmPanel = new JPanel();
		
		tabbedPane.addTab("Add Alarm", addAlarmPanel);
		tabbedPane.addTab("Check Alarms", checkAlarmPanel);
		
		
		
//-------------------------------------------------------------------------------------
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.add(tabbedPane);
		frame.setVisible(true);
//-------------------------------------------------------------------------------------
	}


}
