package chapter2.designinterface;

public interface Fly {

	public int getWingSpan() throws Exception;
	
	public static int MAX_SPEED = 100; 
	
	public default void land() {
		System.out.println("Animal is landing");
	}
	
	public static double calculateSpeed(float distance, double time) {
		return distance/time;
	}
	
}
