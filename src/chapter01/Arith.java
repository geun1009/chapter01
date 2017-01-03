package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7, b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(-a);
		System.out.println(++a);// 전위, 증가 후 구문 실행
		System.out.println(a++);// 후위, 구문 실행 후 증가
		System.out.println(--b);
		System.out.println(b--);
		a = a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);

		// 나누기

		// 2개의 int형의 사칙연산 결과는 int
		System.out.println(10 / 3);// System.out.println((int)10/(int)3);
		// 2개의 double형의 사칙연산 결과는 double
		System.out.println(10. / 3.);
		// int형과 double형의 사칙 연산 결과는 double
		System.out.println(10. / 3);
		System.out.println((double) 10 / 3);
		// 주의
		System.out.println((double) (10 / 3));

		// 나머지
		System.out.println(44 % 3);
		System.out.println(-7 % 3);
		System.out.println(-7 % 3);// -1
		System.out.println(7 % -3);// 1

		// 관계 연산자
		System.out.println(10 > 3);
		System.out.println(10 < 3);
		System.out.println(10 >= 3);
		System.out.println(10 <= 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);

		// 논리 연산자
		System.out.println(10 > 3 && 10 < 3);
		System.out.println(10 > 3 || 10 < 3);
		System.out.println(!(10 > 3));

		boolean x = (7 == 9);
		System.out.println(x);
	}
}
