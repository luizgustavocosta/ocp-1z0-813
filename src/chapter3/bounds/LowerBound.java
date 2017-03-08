package chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("tweet");
		
		List<Object> objects = new ArrayList<Object>();
		
		addSound(strings);
		addSound(objects);
	}
	
	/*static void addSound(List<?> list){
		list.add("quack"); Error. Qq classe dont know String
	}*/
	/*static void addSound(List<? extends Object> list){
		list.add("quack"); Error. Object dont know String
	}*/
	/*static void addSound(List<Object> list){
		list.add("quack"); Not, because addSound(string) dont compile
	}*/
	static void addSound(List<? super String> list){
		// String ou qq coisa acima de String, no caso Object is superclass.
		list.add("quack");
	}

}
