package day0601;
import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int l = text.length();
		for(int i=0; i<l; i++){
			String first = text.substring(0, 1);
			String last = text.substring(1);
			text = last + first;
			System.out.println(text);
		}
	}
}
