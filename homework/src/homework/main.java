package homework;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String s;
		System.out.print("캐릭터(근거리, 원거리)>> ");
		
		Scanner scanner = new Scanner(System.in);
		
		champion shortDistance = new champion(0);
		champion longDistance = new champion(1);
		
		s = scanner.next();
		
		if(s.equals("근거리")){
			System.out.println("HP : " + shortDistance.hp);
			System.out.println("MP : " + shortDistance.hp);
			System.out.println("공격속도 : " + shortDistance.attSpeed);
			System.out.println("공격력 : " + shortDistance.demage);
			System.out.println("마법력 : " + shortDistance.spellDemage);
			System.out.println("레벨 : " + shortDistance.level);
		}else if(s.equals("원거리")){
			System.out.println("HP : " + longDistance.hp);
			System.out.println("MP : " + longDistance.mp);
			System.out.println("공격속도 : " + longDistance.attSpeed);
			System.out.println("공격력 : " + longDistance.demage);
			System.out.println("마법력 : " + longDistance.spellDemage);
			System.out.println("레벨 : " + longDistance.level);
		}else{
			System.out.println("올바른 값이 아닙니다.");
		}
	}
}
