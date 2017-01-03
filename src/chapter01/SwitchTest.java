package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int month = 10;
		int days = 0;

		if (month == 1) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month == 3) {
			days = 30;
		} else if (month == 4) {
			days = 30;
		} else if (month == 5) {
			days = 31;
		} else if (month == 6) {
			days = 30;
		} else if (month == 7) {
			days = 31;
		} else if (month == 8) {
			days = 31;
		} else if (month == 9) {
			days = 30;
		} else if (month == 10) {
			days = 31;
		} else if (month == 11) {
			days = 30;
		} else if (month == 12) {
			days = 31;
		} else {
			days = 0;
		}
		System.out.println(month + "는 " + days + "일 까지 있습니다");

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 0;
		}
		System.out.println(month + "는 " + days + "일 까지 있습니다");

		// Swith
		switch (month) {
		case 1: {
			days = 31;
			break;
		}
		case 2: {
			days = 28;
			break;
		}
		case 3: {
			days = 31;
			break;
		}
		case 4: {
			days = 30;
			break;
		}
		case 5: {
			days = 31;
			break;
		}
		case 6: {
			days = 30;
			break;
		}
		case 7: {
			days = 31;
			break;
		}
		case 8: {
			days = 31;
			break;
		}
		case 9: {
			days = 30;
			break;
		}
		case 10: {
			days = 31;
			break;
		}
		case 11: {
			days = 30;
			break;
		}
		case 12: {
			days = 31;
			break;
		}
		default:
			System.out.println("해당월이 없습니다");
		}
		System.out.println(month + "는 " + days + "일 까지 있습니다");

		switch (month) {
		case 1: {
			days = 31;
		}
		case 3: {
			days = 31;
		}
		case 5: {
			days = 31;
		}
		case 7: {
			days = 31;
		}
		case 8: {
			days = 31;
		}
		case 12: {
			days = 31;
			break;
		}
		case 2: {
			days = 28;
			break;
		}
		default: {
			days = 30;
			System.out.println("해당월이 없습니다");
		}
			System.out.println(month + "는 " + days + "일 까지 있습니다");
		}
	}
}
