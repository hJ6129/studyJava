package day2;
import java.util.Scanner;

public class arraytest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		int s = scanner.nextInt();
		
		for(int i = 0; i < intArray.length; i++){
			intArray[i] = scanner.nextInt();
			if(intArray[i]%3==0){
				System.out.print(intArray[i] + " ");
			}
		}
			
		System.out.print("3의 배수는 " + intArray);
	}
}
