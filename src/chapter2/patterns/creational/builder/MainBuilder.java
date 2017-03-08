package chapter2.patterns.creational.builder;

import java.util.Arrays;

import chapter2.patterns.creational.immutable.Animal;

public class MainBuilder {
	
	public static void main(String[] args) {
		Animal dog = new AnimalBuilder()
			.setAge(2)
			.setSpecies("cachorro")
			.setFavoriteFoods(Arrays.asList("Meat","Cheese"))
			.build();
		
		Animal tortuga = new AnimalBuilder()
			.setAge(100)
			.setSpecies("Tortuga caminhas")
			.setFavoriteFoods(Arrays.asList("Lettuce","tomatoes"))
			.build();
		
		System.out.println(dog.getAge() + "<- Dog Tortuga ->"+tortuga.getAge());
	}

}
