package fr.xiaomi;

public class Main {

	public static void main(String[] arg0){
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		robotEngineer.makeRobot();
		
		Robot first = robotEngineer.getRobot();
		
		System.out.println(first.getRobotHead());
		System.out.println(first.getRobotTorso());
		System.out.println(first.getRobotArms());
		System.out.println(first.getRobotLegs());
		
	}
}
