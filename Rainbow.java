package com.rainbowtest;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Rainbow extends JPanel {
	
	public static final Color INDIGO = new Color(128, 120, 126); //create Indigo color
	public static final Color VIOLET = new Color(89, 130, 179); //create Violet color
	
	//TODO: Create an array of ROY G BIV for rainbow colors
	Color[] objColor = { Color.WHITE,Color.WHITE,Color.RED, Color.ORANGE,
			Color.YELLOW, Color.GREEN, Color.BLUE,INDIGO,VIOLET};
	
	//set the background of the Panel in the constructor to white
	public Rainbow() {
		setBackground(Color.WHITE);
		}
	
	  //this method creates graphics using obj Graphics to draws
	  public void paintComponent(Graphics graphics) {
		  super.paintComponent(graphics);
		     
		   int radius = 20; //define how wide the rainbow looks
		   int centerX = getWidth() / 2; //get mid x
		   int centerY = getHeight() - 10; //get the lower part of y
		   
		   
		   //loop thru colors
		   for(int i = objColor.length; i > 0; i--) {
			   //set the color that will first draw on the white board
			   graphics.setColor(objColor[i-1]);
			   
			   //create half of the rainbow arc and then replicate the other 90 degrees
			                                                           // width
			   graphics.fillArc(centerX - i*radius, centerY - i*radius, i*radius*2,
					   // Height      startAngle      arcAngle
					   i*radius*2,       0,             180);
			   
			   
	       }
		  
	}
}
