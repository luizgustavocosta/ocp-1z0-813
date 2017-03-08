package chapter4.streams.checkedexceptions;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

	private static List<String> create() throws IOException{
		throw new IOException();
	}
	
	private static List<String> createSafe() {
		try {
			return create();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		//Stream does accept checked Exception
		//ExceptionCaseStudy.create().stream().count();
		//Supplier<List<String>> s = ExceptionCaseStudy::create;
		Supplier<List<String>> s = () -> {
			try {
				return ExceptionCaseStudy.create();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		};
		s.get();
		// ou 
		Supplier<List<String>> safe = ExceptionCaseStudy::createSafe;
		safe.get();
	}
}
