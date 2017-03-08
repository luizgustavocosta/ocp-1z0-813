package chapter4.questions;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class Q19 {
	
	// Which of the following return primitives
	// Me - 3,4,5 (FloatSupplier doesnt exists!)
	// Correct - 1,3,5()
	// CharSupplier   X
	// FloatSupplier  X
	// StringSupplier X
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		BooleanSupplier bs = BooleanSupplier.class.newInstance();
		bs.getAsBoolean();
		
		DoubleSupplier ds = DoubleSupplier.class.newInstance();
		ds.getAsDouble();
		
		IntSupplier is = IntSupplier.class.newInstance();
		is.getAsInt();
		
	}

}
