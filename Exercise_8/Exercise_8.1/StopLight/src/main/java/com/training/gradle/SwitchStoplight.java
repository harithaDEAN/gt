package com.training.gradle;

public class SwitchStoplight {
	private static final String Green = "green";
	private static final String Yellow = "yellow";
	private static final String Red = "red";                           
	
	public enum LightColor  { Green, Yellow, Red, UnknownColor };
	public enum LightAction { Go, SlowDown, Stop, UnknownAction };

	public SwitchStoplight() {}      
	
	public LightAction returnAction(LightColor color) {
		LightAction action = LightAction.UnknownAction;

		switch (color) {    // case sensitive
			case Green:
				action = LightAction.Go;
				break;
			case Yellow:
				action = LightAction.SlowDown;
				break;
			case Red:
				action = LightAction.Stop;
				break;
			default:
				action = LightAction.UnknownAction;
				break;
		}
		return action;
	}
}
