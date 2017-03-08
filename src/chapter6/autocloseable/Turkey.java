package chapter6.autocloseable;

import java.io.IOException;

public class Turkey {

	public static void main(String[] args) throws IOException {
		try (TurkeyCage t = new TurkeyCage()){
			System.out.println("put turkeys in");
		}
	}

}
