/* Scanner�� �̿��Ͽ� ����, ü��, ���� �����͸� Ű���忡�� �Է� �޾�
�ٽ� ����ϴ� ���α׷��� �ۼ��غ���. */

import java.util.Scanner;

public class scanner1 {
	public static void main (String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		System.out.println("����� ���̴� " + a.nextInt() + "���Դϴ�.");
		System.out.println("����� ü���� " + a.nextDouble() +"kg�Դϴ�.");
		System.out.println("����� ������ " + a.nextDouble()+ "cm�Դϴ�.");
	}
}