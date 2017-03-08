

import java.util.ListResourceBundle;

public class Zoo_ct extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"hello","Hola"},
			{"open","Obert"},
			{"ticket","bitllet"},
			{"goal","The goals was scored by {0} player"}
		};
	}

}