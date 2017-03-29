package appendix.c.switchs;

import java.time.Month;

public class Application {

	public static void main(String[] args) {
		String x = "sd";
		
		switch (x) {
			default:
				System.out.println("No tiene");
			case "Brasil":
				System.out.println("Brasillll");
			case "Argentina":
				System.out.println("Messii");
		}
		
		
		Month mes = Month.NOVEMBER;
		
		switch (mes) {
			case  AUGUST :
				break;
			case  NOVEMBER :
				System.out.println("Novembro fera");
				break;
			case  DECEMBER :
				System.out.println("Diciember");
				break;
			default:
				break;
			}
			
	}

}
