package chapter01;

import java.util.*;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		// System.out.print("count:");
		// int count = sc.nextInt();
		//
		// int i = 0;
		// while (i < count) {
		// System.out.println("[" + (i + 1) + "]" + "Hello World");
		// i++;
		// }

		// Q1
		int i = 0;
		int result = 1;
		int pow = sc.nextInt();

		while (i < pow) {
			result = result * 2;
			i++;
		}
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");

	}

}
