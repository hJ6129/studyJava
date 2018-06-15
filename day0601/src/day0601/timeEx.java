package day0601;
import java.util.Scanner;
import java.util.Calendar;

class time{
	static Scanner scanner = new Scanner(System.in);
	
	public static int run(){
		String key = scanner.nextLine();
		Calendar now = Calendar.getInstance();
		int start = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + start);
		System.out.print("10초 예상 후 <ENTER>");
		key = scanner.nextLine();
		now = Calendar.getInstance();
		int end = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + end);
		
		if(start < end)
			end += 60;
		
		return Math.abs(start-end);
	}
}

public class timeEx extends time{
	public static void main(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <ENTER>키 >>");
		int result1 = run();
		
		System.out.print("이재문 시작 <ENTER>키 >>");
		int result2 = run();
		
		System.out.print("승자는 ");
		if(Math.abs(10-result1) == Math.abs(10-result2))
			System.out.print("없음(비김)");
		
		if(Math.abs(10-result1) > Math.abs(10-result2))
			System.out.print("황기태");
		else if(Math.abs(10-result1) < Math.abs(10-result2))
			System.out.print("이재문");
	}
}
