package chapter01;

public class Typecast1 {

	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d =f;
		//byte b1 = 256
		byte b1 = (byte)256;
	}

}
