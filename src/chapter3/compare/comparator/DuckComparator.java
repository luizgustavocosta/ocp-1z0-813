package chapter3.compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import chapter3.compare.comparable.Duck;

public class DuckComparator {

	public static void main(String[] args) {
		Comparator<Duck> byWeight = new Comparator<Duck>(){
			@Override
			public int compare(Duck duck, Duck anotherDuck) {
				int retorno = (int) (duck.getWeight() - anotherDuck.getWeight());
				System.out.println("retorno{"+retorno+"}");
				return retorno;
			}
		}; // OR
		
		Comparator<Duck> byWeightEasy = (d1,d2) -> d1.getWeight() - d2.getWeight();
		Comparator<Duck> byWeightEasy2 = (Duck d1, Duck d2) -> d1.getWeight() - d2.getWeight();
		Comparator<Duck> byWeightEasy3 = (d1,d2) -> {return d1.getWeight()-d2.getWeight();};
		Comparator<Duck> byWeightEasy4 = (Duck d1, Duck d2) -> {return d1.getWeight()-d2.getWeight();};
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Zezinho", 100));
		ducks.add(new Duck("Luizinho", 80));
		ducks.add(new Duck("Huguinho", 150));
		Collections.sort(ducks);
		System.out.println(ducks);
		Collections.sort(ducks, byWeight);
		System.out.println(ducks);
	}

}
