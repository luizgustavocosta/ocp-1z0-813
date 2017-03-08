package chapter2.questions.eleven;

public class MySecret implements Secret {

	public static void main(String[] args) {
		//caller((e) -> "Poof");
		//caller((e) -> {"Poof"});
//		caller((e) -> {String e= ""; "Poof"});
//		caller((e) -> {String e= ""; return "Poof";});
//		caller((e) -> {String e= ""; return "Poof"});
//		caller((e) -> {String f= ""; return "Poof";});
		
	}
		
	@Override
	public String magic(double d) {
		return "Poof";
	}
	
}
