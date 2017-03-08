package chapter3.methodref;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Looping {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("Luiz Gustavo", 34),
				new Person("Gustavo", 0),
				new Person("Rodrigo", 35));
		
		Comparator<Person> comparatorNome = (p1, p2) -> p1.nome.compareTo(p2.nome);
		Collections.sort(list, comparatorNome);
		list.forEach(p -> System.out.println(p.nome));
		for (Person person : list) {
			System.out.format("%-40s%2d\n", person.nome, person.idade);
		}
	}
}

class Person{
	int idade;
	String nome;
	public Person(String nome, int idade) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
}
