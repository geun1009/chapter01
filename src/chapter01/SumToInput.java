package chapter01;

import java.util.*;

public class SumToInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 n 입력 :");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++)
			sum += i;
		System.out.println(sum);
	}

}
