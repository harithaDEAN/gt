package com.training.gradle;

public class SwitchStoplight {
	private static final String Green = "green";
	private static final String Yellow = "yellow";
	private static final String Red = "red";                           
	
	public SwitchStoplight() {}      
	
	public String returnAction(String color) {
		String action = "Unknown";
		if (color == null)  {                  // no NullPointerExceptions
			return "Error: Color is Null, Not Allowed!";			
		}
		else {
			switch (color.toLowerCase()) {    // case sensitive
			case Green:
				action = "Go!";
				break;
			case Yellow:
				action = "Slow Down!";
				break;
			case Red:
				action = "Stop!";
				break;
			default:
				action = "What Do I Do?";
				break;
			}
			return "The stoplight color is [" + color + "], so " + action;
		}
	}
}
