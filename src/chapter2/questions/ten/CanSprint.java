package chapter2.questions.ten;

public interface CanSprint extends CanRun, CanWalk {
	
	void sprint();

	// When the interface extends other and this has a default methods,
	// the interface needs to implements the default methods
	@Override
	default void walk() {
		// TODO Auto-generated method stub
		CanWalk.super.walk();
	}

}
