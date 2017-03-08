package chapter2.patterns.creational.singleton;

public class LlamaTreiner {

	public boolean feedLlamas(int numberOfLlamas){
		int amountNeeded = 5 * numberOfLlamas;
		HayStorage hayStorage = HayStorage.getInstance();
		if (hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded+10);
		}
		boolean fed = hayStorage.removeHay(amountNeeded);
		if (fed)
			System.out.println("Llama have been fed");
		return fed;
	}
}
