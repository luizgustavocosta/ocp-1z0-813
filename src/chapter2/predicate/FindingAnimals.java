package chapter2.predicate;

import java.util.function.Predicate;

import chapter2.functionalinterface.Animal;

public class FindingAnimals {
	
	public static void main(String[] args) {
		print(new Animal("Shark", false, true), a-> a.isCanSwing());
		print(new Animal("Dog", true, true), a-> a.isCanHop());
	}
	
	public static void print(Animal animal, Predicate<Animal> predicate){
		if (predicate.test(animal)){
			System.out.println(animal);
		}
	}

}
