package day2;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		
		double a = scanner.nextDouble();
		String b = scanner.next();
		double c = scanner.nextDouble();
		
		if(b.equals("/") && c == 0){
			System.out.print("0으로 나눌 수 없습니다.");
		}else if(b.equals("+")){
			System.out.print(a+"+"+c+"의 계산 결과는 "+(a+c));
		}else if(b.equals("-")){
			System.out.print(a+"-"+c+"의 계산 결과는 "+(a-c));
		}else if(b.equals("*")){
			System.out.print(a+"*"+c+"의 계산 결과는 "+(a*c));
		}else if(b.equals("/")){
			System.out.print(a+"/"+c+"의 계산 결과는 "+(a/c));
		}
	}
}
