package homework;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String s;
		System.out.print("ĳ����(�ٰŸ�, ���Ÿ�)>> ");
		
		Scanner scanner = new Scanner(System.in);
		
		champion shortDistance = new champion(0);
		champion longDistance = new champion(1);
		
		s = scanner.next();
		
		if(s.equals("�ٰŸ�")){
			System.out.println("HP : " + shortDistance.hp);
			System.out.println("MP : " + shortDistance.hp);
			System.out.println("���ݼӵ� : " + shortDistance.attSpeed);
			System.out.println("���ݷ� : " + shortDistance.demage);
			System.out.println("������ : " + shortDistance.spellDemage);
			System.out.println("���� : " + shortDistance.level);
		}else if(s.equals("���Ÿ�")){
			System.out.println("HP : " + longDistance.hp);
			System.out.println("MP : " + longDistance.mp);
			System.out.println("���ݼӵ� : " + longDistance.attSpeed);
			System.out.println("���ݷ� : " + longDistance.demage);
			System.out.println("������ : " + longDistance.spellDemage);
			System.out.println("���� : " + longDistance.level);
		}else{
			System.out.println("�ùٸ� ���� �ƴմϴ�.");
		}
	}
}
