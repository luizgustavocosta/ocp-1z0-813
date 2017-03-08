package chapter2.patterns.creational.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Animal {

	private final List<String> favoriteFoods;
	private final String species;
	private final int age;

	public Animal(String species, int age, List<String> favoriteFoods) {
		super();
		this.species = species;
		this.age = age;
		if (favoriteFoods == null)
			throw new IllegalArgumentException("favorite food is required");
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public String getSpecies() {
		return species;
	}
	
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}
	
	public String getFavoriteFoods(int indexAt) {
		return favoriteFoods.get(indexAt);
	}
	
	public int getAge() {
		return age;
	}
}
