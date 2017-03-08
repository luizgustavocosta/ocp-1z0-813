package chapter2.functionalinterface;

public class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwing;
	
	public Animal(String species, boolean canHop, boolean canSwing) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwing = canSwing;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public void setCanHop(boolean canHop) {
		this.canHop = canHop;
	}

	public boolean isCanSwing() {
		return canSwing;
	}

	public void setCanSwing(boolean canSwing) {
		this.canSwing = canSwing;
	}
	
	public String toString() {
		return species;
	};
}
