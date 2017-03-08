package chapter3.generics;

public class Crate<T> {
	
	private T contents;
	public T emptyCrate(){
		return contents;
	}

	public void packCrate(T contents){
		this.contents = contents;
	}
	
	public static <T> Crate<T> ship(T t){
		System.out.format("Preparing %s",t);
		return new Crate<T>();
	}
	
	public static <T> void sink(T t){}
	public static <T> T identity(T t){return t;}
	//Error
	//public static T noGood(T t){return t;}
}
class Robot{
	private String type;
	private String fuel;
	public Robot(String type, String fuel) {
		super();
		this.type = type;
		this.fuel = fuel;
	}
	public String getType() {
		return type;
	}
	public String getFuel() {
		return fuel;
	}
}
class Elephant {
	private double weight;
	private String locale;

	public Elephant(double weight, String locale) {
		super();
		this.weight = weight;
		this.locale = locale;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}
}

class Zebra {
	private int age;
	private String name;
	
	public Zebra(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}