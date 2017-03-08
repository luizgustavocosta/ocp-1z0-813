package chapter2.patterns.creational.factory;

public class ZooKeeper {

	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("bear");
		food.consumed();
	}

}
