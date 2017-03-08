package chapter2.patterns.creational.builder;

import java.util.List;

import chapter2.patterns.creational.immutable.Animal;
// Differences between immutable
// Class not marked as final
// The attributes aren't marked as final
// Constructor with parameters
public class AnimalBuilder {
	
	private List<String> favoriteFoods;
	private String species;
	private int age;
	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}
	
	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}
	
	public Animal build(){
		return new Animal(species, age, favoriteFoods);
	}
	
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public String getSpecies() {
		return species;
	}
	public int getAge() {
		return age;
	}
	
}
