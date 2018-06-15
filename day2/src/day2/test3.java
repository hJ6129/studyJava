package day2;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요>>");
		
		int month = scanner.nextInt();
		
		switch(month){
		case 3:
			System.out.print("봄");
			break;
		case 4:
			System.out.print("봄");
			break;
		case 5:
			System.out.print("봄");
			break;
		case 6:
			System.out.print("여름");
			break;
		case 7:
			System.out.print("여름");
			break;
		case 8:
			System.out.print("여름");
			break;
		case 9:
			System.out.print("가을");
			break;
		case 10:
			System.out.print("가을");
			break;
		case 11:
			System.out.print("가을");
			break;
		case 12:
			System.out.print("겨울");
			break;
		case 1:
			System.out.print("겨울");
			break;
		case 2:
			System.out.print("겨울");
			break;
		default:
			System.out.print("잘못입력");
			break;
		}
		
		scanner.close();
	}
}
