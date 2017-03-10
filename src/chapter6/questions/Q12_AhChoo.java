package chapter6.questions;

public class Q12_AhChoo {

	static class SneezeException extends Exception {
		private static final long serialVersionUID = 1L;
	}
	
	static class SniffleException extends SneezeException{
		private static final long serialVersionUID = 1L;
	}
	
	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} catch (SneezeException e){
			e = new SniffleException();
			throw e;
		}
	}

}
