package day2;
import java.util.Scanner;

public class arraytest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		String s;
		String rsp[] = {"가위", "바위", "보"};
		
		while(true){
			System.out.print("가위 바위 보!>>");
			s = scanner.next();
			
			int n = (int)(Math.random()*3); //컴퓨터의 가뷔 바위 보 를 랜덤으로 정해줌
			
			//사람의 입력값를 비교함.
			if(s.equals("가위")){
				num = 0;
			}else if(s.equals("바위")){
				num = 1;
			}else if(s.equals("보")){
				num = 2;
			}else if(s.equals("그만")){
				System.out.print("종료");
				scanner.close();
				break;
			}else{
				System.out.println("다시 입력 해 주세요.");
				continue;
			}
			
			//컴퓨터가 낸것을 비교
			if(n==0){
				System.out.print("컴퓨터는 가위, ");
			}else if(n==1){
				System.out.print("컴퓨터는 바위, ");
			}else if(n==2){
				System.out.print("컴퓨터는 보, ");
			}
			
			//사람과 컴퓨터를 비교
			switch(num){
			case 0:
				if(n==0){
					System.out.println("사용자는 가위 / 비겼다.");
				}else if(n==1){
					System.out.println("사용자는 가위 / 졌다.");
				}else if(n==2){
					System.out.println("사용자는 가위 / 이겼다.");
				}
				continue;
			case 1:
				if(n==0){
					System.out.println("사용자는 바위 / 이겼다.");
				}else if(n==1){
					System.out.println("사용자는 바위 / 비겼다.");
				}else if(n==2){
					System.out.println("사용자는 바위 / 졌다.");
				}
				continue;
			case 2:
				if(n==0){
					System.out.println("사용자는 보 / 졌다.");
				}else if(n==1){
					System.out.println("사용자는 보 / 이겼다.");
				}else if(n==2){
					System.out.println("사용자는 보 / 비겼다.");
				}
				continue;
			}
		}
	}
}
