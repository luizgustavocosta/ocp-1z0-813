package appendix.c.binarios;

import java.util.function.BiConsumer;

/**
 * This feature is very helpful to bit-oriented systems like processors, network protocols and bitmapped hardware device. 
 * Early the programmer used to transform from binary to decimal/hexadecimal and vice versa. Using this feature will remove this transformation and chances of error will be less in this conversion.
 * 
 * You can use binary literals to make a bitmap more readable:
 * 
 * You can use binary integral constants in code that you can verify against a specifications document, such as a simulator for a hypothetical 8-bit microprocessor:
 * @author lzoa
 *
 */

public class BinariosLiterais {

	static BiConsumer<String, Object> print =  (s, t) ->  System.out.format("%s%d%n", s,t);
	
	public static void main(String[] args) {
		// An 8-bit 'byte' value:
		byte aByte = (byte)0b00100001;
		print.accept("An 8-bit 'byte' value: ", aByte);

		// A 16-bit 'short' value:
		short aShort = (short)0b1010000101000101;
		print.accept("A 16-bit 'short' value: ", aShort);

		// Some 32-bit 'int' values:
		int anInt1 = 0b10100001010001011010000101000101;
		int anInt2 = 0b101;
		int anInt3 = 0B101; // The B can be upper or lower case.
		print.accept("Some 32-bit 'int' values:: ", anInt1);
		print.accept("Some 32-bit 'int' values:: anInt1 + anInt2 + anInt3 ", anInt1 + anInt2 + anInt3);

		// A 64-bit 'long' value. Note the "L" suffix:
		long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;
		print.accept("A 64-bit 'long' value. Note the 'L' suffix: ", aLong);
		
		int x = 0B0000000000000000000000000000000000000000000001;
		System.out.println(Integer.reverseBytes(x));
	}

}
