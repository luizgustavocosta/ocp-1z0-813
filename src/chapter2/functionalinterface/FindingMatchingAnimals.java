package chapter2.functionalinterface;

public class FindingMatchingAnimals {

	private static void print(Animal animal, CheckTrait trait) {
		if (trait.testAnimal(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.isCanHop());
		print(new Animal("Kangaroo", true, false), a -> a.isCanHop());
	}
}
