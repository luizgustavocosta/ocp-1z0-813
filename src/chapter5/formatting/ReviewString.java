package chapter5.formatting;

public class ReviewString {

	public static void main(String[] args) {
		String s5 = 1 + 2 + "3";
		System.out.println(s5);
		
		String s = "luiz gustavo de Oliveira Costa";
		System.out.println(s.trim());
		System.out.println(s.substring(2, 4).toUpperCase());
		
		String z = "de luiz gustavo oliveira costa";
		
		System.out.println(
				"soma dos caracteres["+sumCharOfString(s.toLowerCase())+"] outra ["+sumCharOfString(z.toLowerCase())+"]");
		
		StringBuilder builder = new StringBuilder("abcde");
		builder.insert(1, '-').delete(3, 4);//a-bcde  a-bde
		System.out.println(builder.toString()); 
		System.out.println(builder.substring(2, 4)); //a-bde {bd}
		
	}

	private static int sumCharOfString(String s) {
		int sum = 0;
		for (int i=0; i<s.length(); i++) {
			sum+=s.charAt(i);
		}
		return sum;
	}

}
