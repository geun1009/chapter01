package chapter01;

public class WhileTest {

	public static void main(String[] args) {
		// 1~10까지 합
		int i = 1;
		int sum = 0;

		while (i < 10) {
			// System.out.println(i);
			sum = sum + (i + 1);
			i++;
		}
		System.out.println(sum);
	}
}
