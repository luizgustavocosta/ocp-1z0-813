package chapter4.supplier;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestPredicate {
	public static void main(String[] args) {
		Predicate<Person> p1 = Person::isOk;
		Supplier<Person> sp = () -> new Person();
		Person person2 = sp.get();
		person2.setOk(Boolean.TRUE.booleanValue());
		
		System.out.println(p1.test(person2));
		
		BiPredicate<Person, Person> bp1 =
				(t, u) -> u.getAge() + 10 > t.getAge();
				
		
		Person person = sp.get();
		person.setAge(34);
		
		System.out.println(bp1.test(sp.get(), person));
	}
}
