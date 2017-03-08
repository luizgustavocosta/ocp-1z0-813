package chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class PlanadorAndGoose {

	public static void main(String[] args) {
		List<Goose> flyer = new ArrayList<>();
		//anyFlyer(flyer); Error because Goose isn't a flyer ...
		groupOfFlyers(flyer);
		
		List<Flyer> flyerAux = new ArrayList<>();
		Goose g = new Goose();
		flyerAux.add(g);
		anyFlyer(flyerAux);
		
	}
	
	private static void anyFlyer(List<Flyer> flyer){
		System.out.println("anyFlyer method");
		for (Flyer flyer2 : flyer) {
			System.out.println(flyer2);
		}
	}
	private static void groupOfFlyers(List<? extends Flyer> flyer){
		System.out.println("groupOfFlyers method");
		for (Flyer flyer2 : flyer) {
			System.out.println(flyer2);
		}
	}
}
