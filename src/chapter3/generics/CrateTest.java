package chapter3.generics;

public class CrateTest {

	public static void main(String[] args) {
		
		Crate<Elephant> crateOfElephants = new Crate<>();
		crateOfElephants.packCrate(
				new Elephant(12.2,"South Africa"));
		Elephant emptyCrate = crateOfElephants.emptyCrate();
		System.out.println(emptyCrate.getLocale());
		
		
		Crate<Zebra> createOfZebra = new Crate<>();
		createOfZebra.packCrate(new Zebra(80, "Marvin"));
		Zebra emptyCrateZebra = createOfZebra.emptyCrate();
		System.out.println(emptyCrateZebra.getName());
		
		Crate<Robot> createOfRobot = new Crate<>();
		createOfRobot.packCrate(new Robot("Iron", "Gasoline"));
		Robot emptyCrateRobot = createOfRobot.emptyCrate();
		System.out.println(emptyCrateRobot.getType());
		
	}
}
