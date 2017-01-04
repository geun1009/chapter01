package chapter01;
import java.util.*;	// Scanner 클래스를 사용하기 위함

public class PowerOfTwo02 {

   public static void main(String[] args) {

	Scanner scanner = new Scanner( System.in );

	int result = 1;
	System.out.print("승수: ");

	int pow = scanner.nextInt();
	
	// Q: 아래 for문을 작성하시오.
	for(int i=0;i<pow;i++)
		result = result*2;
	
	System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
    }		

}

