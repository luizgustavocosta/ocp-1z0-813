package chapter2.objectandreference;

public class TestIt {

	public static void main(String[] args) {
		Fish f = new Fish();
		Animal a = f;
		f = (Fish) a;
		Object o = a;
		Object o2 = f;
		
	}

}
