package chapter01;
import java.util.*;
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum=0;
		int value=0;
		do{
			System.out.print("숫자 입력 >");
			value = sc.nextInt();
			sum+=value;
		}while(value!=0);
		System.out.println(sum);
	}

}
