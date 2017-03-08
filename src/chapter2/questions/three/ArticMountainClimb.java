package chapter2.questions.three;

public interface ArticMountainClimb extends MountainClimb{

	//public default int getSpeed();
	//Default methods need to have body
	
	public default int getSpeed(){return 0;}
}
