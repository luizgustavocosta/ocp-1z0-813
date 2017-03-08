package chapter3.generics;

public class SizeLimitedCrateTest {

	public static void main(String[] args) {
		Elephant elephant = new Elephant(2389.93, "España");
		SizeLimitedCrate<Elephant, Double> c1 = 
				new SizeLimitedCrate<>(elephant, elephant.getWeight());
		System.out.format("Size limit of %s is %.3f\n", 
				elephant.getClass().getSimpleName(),c1.getSizeLimit());
		
		Robot robocop = new Robot("Steel", "Eletricit");
		SizeLimitedCrate<Robot, Double> c2 = 
				new SizeLimitedCrate<>(robocop, 199.87);
		
		System.out.format("Size limit of %s is %.3f", 
				robocop.getClass().getSimpleName(),c2.getSizeLimit());
	}
}
