package com.training.gradle;

import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchStoplight {
	private static final String Green = "green";
	private static final String Yellow = "yellow";
	private static final String Red = "red";

	private String color;                              
	SwitchStoplight(String c) {	this.color = c;	}      
	void setColor(String c)   { this.color = c; }
	
	public static void main(String[] args) {
		SwitchStoplight light = new SwitchStoplight(Red);
		light.printAction(); 	
		light.setColor(Green);
		light.printAction();                      
	}
	

	public void printAction() {
		String action = "Unknown";
		if (color == null)  {                  // no NullPointerExceptions
			System.out.println("Color is Null!");			
		}
		else {
			switch (color.toLowerCase()) {    // case sensitive
			case Green:
				action = "Go";
				break;
			case Yellow:
				action = "Slow Down";
				break;
			case Red:
				action = "Stop";
				break;
			default:
				break;
			}
			System.out.println("The stoplight color is " + color + ", so " + action	+ "!");
		}
	}
}
