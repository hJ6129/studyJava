package day2;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>>");
		
		double a = scanner.nextDouble();
		String b = scanner.next();
		double c = scanner.nextDouble();
		
		if(b.equals("/") && c == 0){
			System.out.print("0���� ���� �� �����ϴ�.");
		}else if(b.equals("+")){
			System.out.print(a+"+"+c+"�� ��� ����� "+(a+c));
		}else if(b.equals("-")){
			System.out.print(a+"-"+c+"�� ��� ����� "+(a-c));
		}else if(b.equals("*")){
			System.out.print(a+"*"+c+"�� ��� ����� "+(a*c));
		}else if(b.equals("/")){
			System.out.print(a+"/"+c+"�� ��� ����� "+(a/c));
		}
	}
}
