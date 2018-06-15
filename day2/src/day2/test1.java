package day2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 > ");
		int coin = scanner.nextInt();
		
		int fiveman = coin / 50000;
		int man = (coin % 50000) / 10000;
		int chun = (coin % 50000 % 10000) / 1000;
		int bak = (coin % 50000 % 10000 % 1000) / 100;
		int fiveten = (coin % 50000 % 10000 % 1000 % 100) / 50;
		int ten = (coin % 50000 % 10000 % 1000 % 100 % 50) / 10;
		int one = (coin % 50000 % 10000 % 1000 % 100 % 50 % 10) / 1;		
		
		System.out.println(coin + "원은");
		System.out.println("오만원" + fiveman + "매");
		System.out.println("만원" + man + "매");
		System.out.println("천원" + chun + "매");
		System.out.println("백원" + bak + "매");
		System.out.println("십원" + ten + "매");
		System.out.println("일원" + one + "매 입니다.");
	}

}
