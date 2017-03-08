package chapter3.methodref;

import java.util.Comparator;

import chapter3.compare.comparable.Duck;

public class DuckHelperTest {

	public static void main(String[] args) {
		// The :: operator tell Java to pass the parameters
		// automatically into compareByWeight
		Comparator<Duck> byWeight = DuckHelper::compareByWeight;
	}

}
