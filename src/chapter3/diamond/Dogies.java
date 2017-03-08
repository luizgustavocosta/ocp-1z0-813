package chapter3.diamond;

import java.util.ArrayList;
import java.util.List;

public class Dogies {

	List<String> names;

	public Dogies() {
		this.names = new ArrayList<>();
	}
	
	public void copyNames(){
		@SuppressWarnings("unused")
		ArrayList<String> copyOfNames;
		copyOfNames = new ArrayList<>();
	}
	
}
