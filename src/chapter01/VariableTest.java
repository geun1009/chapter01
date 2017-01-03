package chapter01;

public class VariableTest {
	int number;
	public void test(){
		int j = number + 10;//인트탄스 변수는 초기화가 된다.
	}
	public static void main(String[] args) {
		//int i = 20; // 에러 변수는 식별자다.
		
		int i;
		
		//int j = i; // 에러 지역변수는 반드시 초기화 되어야 한다.
		
		boolean isHoliday = false;// c는 boolean type 이 없어서 0 사용 // java는 반드시 false,ture 사용
		char c = 'A';// 문자 리터럴
		char c1 = 65; //값(아스키 코드)
		byte b = 10;
		short s = 20;
		int k = 20;
		long l = 123456789;
		float f = 3.14f;//소수는 double으로 보기 때문에 뒤에 f를 붙인다// 정밀도는 떨어진다
		double d = 3.14; 
		
		System.out.println(isHoliday);
		System.out.println(c+":"+c1);
		System.out.println(b);
		System.out.println(s);
		System.out.println(k);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		//상수
		final int MAX_SPEED = 20;
		//MAX_SPEED = 200;
		//에러 final이 붙은 변수는 이후에 값 대입을 할 수 없다.
		
		
		//String 객체 확인
		String str= new String("Hello");
		System.out.println(str);
		//String을 리터럴로 사용하기
		String str1 = "Hello";
		System.out.println(str1);
		// 사용자 편의 제공을 위해 컴파일러가 위에 코드로 자동 변환, String은 기본타입 X
		
		
	}
}
