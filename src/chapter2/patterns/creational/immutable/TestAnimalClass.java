package chapter2.patterns.creational.immutable;

import java.util.Arrays;

public class TestAnimalClass {

	public static void main(String[] args) {
		Animal a1 = new Animal("Dog",
				10, 
				Arrays.asList("Met","Pasta","Bones"));
		System.out.println(a1.getSpecies());
	}
}
