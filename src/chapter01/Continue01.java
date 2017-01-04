package chapter01;

public class Continue01 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			if (i > 5) {
				i++;// 무한루프 방지
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
