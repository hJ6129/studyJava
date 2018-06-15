package day0601;
import java.util.Scanner;
import java.util.Calendar;

class time{
	static Scanner scanner = new Scanner(System.in);
	
	public static int run(){
		String key = scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int start = now.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + start);
		System.out.print("10�� ���� �� <ENTER>");
		key = scanner.nextLine();
		now = Calendar.getInstance();
		int end = now.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + end);
		
		if(start < end)
			end += 60;
		
		return Math.abs(start-end);
	}
}

public class timeEx extends time{
	public static void main(String[] args) {
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("Ȳ���� ���� <ENTER>Ű >>");
		int result1 = run();
		
		System.out.print("���繮 ���� <ENTER>Ű >>");
		int result2 = run();
		
		System.out.print("���ڴ� ");
		if(Math.abs(10-result1) == Math.abs(10-result2))
			System.out.print("����(���)");
		
		if(Math.abs(10-result1) > Math.abs(10-result2))
			System.out.print("Ȳ����");
		else if(Math.abs(10-result1) < Math.abs(10-result2))
			System.out.print("���繮");
	}
}
