package day0529;
import java.util.Scanner;

class place{
	static String [][] place = {
			{"S>>","---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
			{"A>>","---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
			{"B>>","---", "---", "---", "---", "---", "---", "---", "---", "---", "---"}
	};
}

public class consert {
	public static void main(String[] args) {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int s = scanner.nextInt();
			
			switch(s){
			case 1:
				System.out.print("�¼����� S(1), A(2), B(3) >> ");
				int p = scanner.nextInt();
				
				if(p == 1){
					for(int i=0; i<place.place[p-1].length; i++){
						System.out.print(place.place[p-1][i]+" ");
					}
					
					System.out.print("\n�̸�>> ");
					String name = scanner.next();
					System.out.print("��ȣ>> ");
					int num = scanner.nextInt();
					
					if(num>10){
						System.out.println("���� �¼� ��ȣ�Դϴ�.");
						continue;
					}else if(place.place[p-1][num] != "---"){
						System.out.println("�̹� ����Ǿ��ִ� �ڸ� �Դϴ�.");
						continue;
					}else{
						place.place[p-1][num] = name;
					}
				}else if(p == 2){
					for(int i=0; i<place.place[p-1].length; i++){
						System.out.print(place.place[p-1][i]+" ");
					}
					
					System.out.print("\n�̸�>> ");
					String name = scanner.next();
					System.out.print("��ȣ>> ");
					int num = scanner.nextInt();
					
					if(num>10){
						System.out.println("���� �¼� ��ȣ�Դϴ�.");
						continue;
					}else if(place.place[p-1][num] != "---"){
						System.out.println("�̹� ����Ǿ��ִ� �ڸ� �Դϴ�.");
						continue;
					}else{
						place.place[p-1][num] = name;
					}
				}else if(p == 3){
					for(int i=0; i<place.place[p-1].length; i++){
						System.out.print(place.place[p-1][i]+" ");
					}
					
					System.out.print("\n�̸�>> ");
					String name = scanner.next();
					System.out.print("��ȣ>> ");
					int num = scanner.nextInt();
					
					if(num>10){
						System.out.println("���� �¼� ��ȣ�Դϴ�.");
						continue;
					}else if(place.place[p-1][num] != "---"){
						System.out.println("�̹� ����Ǿ��ִ� �ڸ� �Դϴ�.");
						continue;
					}else{
						place.place[p-1][num] = name;
					}
				}
				continue;
				
			case 2:
				for(int i=0; i<3; i++){
					for(int j=0; j<11; j++){
						System.out.print(place.place[i][j] + " ");
					}System.out.println("");
				}System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
				continue;
				
			case 4:
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			break;
		}
	}
}
