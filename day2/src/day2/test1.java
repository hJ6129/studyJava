package day2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ� > ");
		int coin = scanner.nextInt();
		
		int fiveman = coin / 50000;
		int man = (coin % 50000) / 10000;
		int chun = (coin % 50000 % 10000) / 1000;
		int bak = (coin % 50000 % 10000 % 1000) / 100;
		int fiveten = (coin % 50000 % 10000 % 1000 % 100) / 50;
		int ten = (coin % 50000 % 10000 % 1000 % 100 % 50) / 10;
		int one = (coin % 50000 % 10000 % 1000 % 100 % 50 % 10) / 1;		
		
		System.out.println(coin + "����");
		System.out.println("������" + fiveman + "��");
		System.out.println("����" + man + "��");
		System.out.println("õ��" + chun + "��");
		System.out.println("���" + bak + "��");
		System.out.println("�ʿ�" + ten + "��");
		System.out.println("�Ͽ�" + one + "�� �Դϴ�.");
	}

}
