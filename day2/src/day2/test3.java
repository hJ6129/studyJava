package day2;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���>>");
		
		int month = scanner.nextInt();
		
		switch(month){
		case 3:
			System.out.print("��");
			break;
		case 4:
			System.out.print("��");
			break;
		case 5:
			System.out.print("��");
			break;
		case 6:
			System.out.print("����");
			break;
		case 7:
			System.out.print("����");
			break;
		case 8:
			System.out.print("����");
			break;
		case 9:
			System.out.print("����");
			break;
		case 10:
			System.out.print("����");
			break;
		case 11:
			System.out.print("����");
			break;
		case 12:
			System.out.print("�ܿ�");
			break;
		case 1:
			System.out.print("�ܿ�");
			break;
		case 2:
			System.out.print("�ܿ�");
			break;
		default:
			System.out.print("�߸��Է�");
			break;
		}
		
		scanner.close();
	}
}
