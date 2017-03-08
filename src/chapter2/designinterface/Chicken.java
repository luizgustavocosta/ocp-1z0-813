package chapter2.designinterface;

public class Chicken implements Fly {

	public static void main(String[] args) {
		Chicken c = new Chicken();
		System.out.println(Fly.calculateSpeed(450, 4));
		c.land();
	}
	
	@Override
	public int getWingSpan(){
		return 3;
	}

}
