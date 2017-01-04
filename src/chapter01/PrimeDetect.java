package chapter01;

import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자:");

		int divisor = 2;
		int num = sc.nextInt();
		boolean isPrime = true;

		// 판단 알고리즘
		while (divisor < num) {
			if (num % divisor == 0) {
				isPrime = false;
				break;
			}
			divisor++;
		}
		// 출력
		if (isPrime == true)
			System.out.println(num + "은 소수입니다.");
		else
			System.out.println(num + "은 소수가 아닙니다.");

	}

}
