package chapter2.patterns.creational.singleton;

public final class SingletonPattern {
	
	private static SingletonPattern instance
	 = new  SingletonPattern();
	
	public static SingletonPattern getInstance(){
		return instance;
	}
	
	private SingletonPattern() {
	}
}
