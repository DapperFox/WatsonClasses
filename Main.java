package com.watson;
public class Main {
	public static RobotSystem robotSystem;

	public static void main(String[] args) {
		//Let system be a new RobotSystem
		robotSystem = new RobotSystem();
        robotSystem.searchForCan();
	}
}
