package chapter01;

public class TypeTest {

	public static void main(String[] args) {
		//암시적(implicity) casting
		int i1 = 10;
		long l1 = i1;
		
		//명시적(explicity) casting
		long l2 = 92387954615375L;
		int i2 = (int)l2;
		System.out.println(i1+":");
		System.out.println(l2+":"+i2);
	}
}
