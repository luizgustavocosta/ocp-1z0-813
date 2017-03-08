package chapter2.questions.ten;

public interface CanWalk {
	
	default void walk(){
		System.out.println("walking on the moon");
	}
}
