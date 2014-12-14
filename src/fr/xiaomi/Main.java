package fr.xiaomi;

public class Main {

	public static void main(String[] arg0){
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		robotEngineer.makeRobot();
		
		Robot first = robotEngineer.getRobot();
		
		first.getRobotHead();
		first.getRobotTorso();
		first.getRobotArms();
		first.getRobotLegs();
		
	}
}
