package ilstu.edu;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame {
	
//Constructor for creating the frame
	public UserInterface() {
		JTabbedPane tabbedPane = new JTabbedPane();
		JFrame frame = new JFrame("Alarms");
		
//-------------------------------------------------------------------------------------
		
		JPanel addAlarmPanel = new JPanel();
			addAlarmPanel.setLayout(new FlowLayout());
			JButton addAlarm = new JButton("Add Alarm");
//			addAlarm.addActionListener(new addAlarmActionListener());
			addAlarmPanel.add(addAlarm);
			

			
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
