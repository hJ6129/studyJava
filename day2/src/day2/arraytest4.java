package day2;
import java.util.Scanner;

public class arraytest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		String s;
		String rsp[] = {"����", "����", "��"};
		
		while(true){
			System.out.print("���� ���� ��!>>");
			s = scanner.next();
			
			int n = (int)(Math.random()*3); //��ǻ���� ���� ���� �� �� �������� ������
			
			//����� �Է°��� ����.
			if(s.equals("����")){
				num = 0;
			}else if(s.equals("����")){
				num = 1;
			}else if(s.equals("��")){
				num = 2;
			}else if(s.equals("�׸�")){
				System.out.print("����");
				scanner.close();
				break;
			}else{
				System.out.println("�ٽ� �Է� �� �ּ���.");
				continue;
			}
			
			//��ǻ�Ͱ� ������ ��
			if(n==0){
				System.out.print("��ǻ�ʹ� ����, ");
			}else if(n==1){
				System.out.print("��ǻ�ʹ� ����, ");
			}else if(n==2){
				System.out.print("��ǻ�ʹ� ��, ");
			}
			
			//����� ��ǻ�͸� ��
			switch(num){
			case 0:
				if(n==0){
					System.out.println("����ڴ� ���� / ����.");
				}else if(n==1){
					System.out.println("����ڴ� ���� / ����.");
				}else if(n==2){
					System.out.println("����ڴ� ���� / �̰��.");
				}
				continue;
			case 1:
				if(n==0){
					System.out.println("����ڴ� ���� / �̰��.");
				}else if(n==1){
					System.out.println("����ڴ� ���� / ����.");
				}else if(n==2){
					System.out.println("����ڴ� ���� / ����.");
				}
				continue;
			case 2:
				if(n==0){
					System.out.println("����ڴ� �� / ����.");
				}else if(n==1){
					System.out.println("����ڴ� �� / �̰��.");
				}else if(n==2){
					System.out.println("����ڴ� �� / ����.");
				}
				continue;
			}
		}
	}
}
