package day0604;
import java.util.*;

public class PointEx {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String ,Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true){
			System.out.print("\n�̸��� ����Ʈ �Է�>> ");
			String n = scanner.next();
			if(n.equals("�׸�"))
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
