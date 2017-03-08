package chapter2.patterns.creational.factory;

public class Fish extends Food {

	public Fish(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Fish eaten:..."+getQuantity());
	}

}
