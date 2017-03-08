package chapter4.lambdavariables;

public class GorillaFamily implements Gorilla {

	String walk = "walk";
	
	void everyonePlay(boolean baby) {
		String approach = "amble";
		//approach = "run";
		play(()-> walk); // () nao tem paraemtro de entrada
		play(() -> baby ? "hitch a ride":"run");
		play(() -> approach);
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}

	@Override
	public String move() {
		return null;
	}
	
	public static void main(String[] args) {
		GorillaFamily gf = new GorillaFamily();
		gf.everyonePlay(true);
	}

}
