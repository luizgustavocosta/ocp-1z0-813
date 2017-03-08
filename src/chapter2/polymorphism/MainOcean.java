package chapter2.polymorphism;

public class MainOcean {

	public static void main(String[] args) {
		new Oceanographer().checkSound(new Netuno());
		new Oceanographer().checkSound(new Whale());
	}

}
