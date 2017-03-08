package chapter3.compare.comparator;

public class Squirrel {

	private int weight;
	private String species;

	public Squirrel(String species) {
		super();
		if (species == null)
			throw new IllegalArgumentException();
		this.species = species;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
}
