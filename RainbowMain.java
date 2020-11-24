package com.rainbowtest;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RainbowMain {
	public static void main(String[]  Args) {
	Rainbow rainbow = new Rainbow();
	//JButton button = new JButton("click me");
	//button.setBounds(10, 5, 5, 10);
	
	
	JFrame frame = new JFrame();
	frame.setSize(400, 300);
	frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(rainbow);
   // frame.add(button);
    
    
}
}