package day0604;
import java.util.*;

public class PointEx {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String ,Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true){
			System.out.print("\n이름과 포인트 입력>> ");
			String n = scanner.next();
			if(n.equals("그만"))
				break;
			int p = scanner.nextInt();
			if(h.get(n) != null)
				p += h.get(n);
			
			h.put(n, p);
			
			System.out.print(h);
		}
		scanner.close();
	}
}
