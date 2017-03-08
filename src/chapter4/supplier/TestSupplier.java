package chapter4.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		Supplier<Person> p1 = Person::new;
		Supplier<StringBuilder> sb1 = () -> new StringBuilder();
		
		StringBuilder stringBuilder = sb1.get().append("Guga");
		StringBuilder stringBuilder2 = sb1.get();
		System.out.println(stringBuilder.toString() +""+stringBuilder2.toString());
		
	}
}
