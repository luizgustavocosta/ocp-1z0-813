package chapter2.patterns.creational.factory;

public class FoodFactory {

	public static Food getFood(String animalName){
		switch(animalName){
			case "zebra":
				return new Hay(199);
			case "rabbit":
				return new Pellets(5);
			case "goat":
				return new Pellets(30);
			case "bear":
				return new Fish(10);
				default:
					throw new 
					UnsupportedOperationException("Unsupported animal "+animalName);
		}
	}
}
