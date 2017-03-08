package chapter2.questions.ten;

public interface CanRun {
	
	public default void walk(){
		System.out.println("walking on the moon");
	}
	
	public abstract void run();
}
