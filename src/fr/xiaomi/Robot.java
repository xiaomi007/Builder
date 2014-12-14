package fr.xiaomi;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	@Override
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		robotHead = head;
	}

	public String getRobotHead() {
		return robotHead;
	}

	@Override
	public void setRobotTorso(String torso) {
		// TODO Auto-generated method stub
		robotTorso = torso;
	}

	public String getRobotTorso() {
		return robotTorso;
	}

	@Override
	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		robotArms = arms;
	}

	public String getRobotArms(){
		return robotArms;
	}
	
	@Override
	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		robotLegs = legs;
	}

	public String getRobotLegs() {
		return robotLegs;
	}

}
