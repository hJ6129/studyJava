package homework2;
import java.util.Scanner;

class list{
	static String [][] stepList = {
			{"�߿�>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"����>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"����>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
	};
}

class completeList{
	static String [][] completes = {
			{"(�Ϸ�)�߿�>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"(�Ϸ�)����>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"(�Ϸ�)����>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
		};
}

public class ToDoList {
	public static void main(String[] args) {
		System.out.println("ToDoList�� �ۼ��� ������.");
		System.out.println("(10�� ���� �ۼ� �����մϴ�)");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("���ο� ��:1, ������:2, �Ϸ�� ��:3, ������:4 >> ");
			int s = scanner.nextInt();
			
			switch(s){
			case 1:
				System.out.print("�߿䵵 : �߿�(1), ����(2), ����(3) >> ");
				int p = scanner.nextInt();

				if(p == 1){
					System.out.print("�� �� �̸�>> ");
					String name = scanner.next();
					System.out.print("��ȣ(����)>> ");
					int order = scanner.nextInt();
					list.stepList[p-1][order] = name;
				}else if(p == 2){
					System.out.print("�� �� �̸�>> ");
					String name = scanner.next();
					System.out.print("��ȣ(����)>> ");
					int order = scanner.nextInt();
					list.stepList[p-1][order] = name;
				}else if(p == 3){
					System.out.print("�� �� �̸�>> ");
					String name = scanner.next();
					System.out.print("��ȣ(����)>> ");
					int order = scanner.nextInt();
					list.stepList[p-1][order] = name;
				}
				continue;

			case 2:
				for(int i=0; i<3; i++){
					for(int j=0; j<10; j++){
						System.out.print(list.stepList[i][j] + " ");
					}System.out.println("");
				}System.out.print("<<�������� �ϵ��� ����Ʈ�� �ҷ��Խ��ϴ�>>\n");
				
				System.out.print("�Ϸ��� ���� �ֽ��ϴ�?>> ��(1) �ƴϿ�(2)>> ");
				int cselect = scanner.nextInt();
				
				switch(cselect){
					case 1:
						System.out.print("\n�Ϸ��� ���� ����Ʈ : �߿�(1), ����(2), ����(3)>> ");
						int completel = scanner.nextInt();
						System.out.print("�Ϸ��� ���� ��ȣ>> ");
						int complete = scanner.nextInt();
	
						completeList.completes[completel-1][complete] = list.stepList[completel-1][complete];
						list.stepList[completel-1][complete] = "-";
						System.out.println("<<�Ϸ�Ǿ����ϴ�>>\n");
						continue;
					
					case 2:
						break;
				}
				continue;

			case 3:
				for(int i=0; i<3; i++){
					for(int j=0; j<10; j++){
						System.out.print(completeList.completes[i][j] + " ");
					}System.out.println("");
				}System.out.println("<<�Ϸ�� �ϵ��� ����Ʈ�� �ҷ��Խ��ϴ�>>\n");
				continue;
				
			case 4:
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			break;
		}
	}
}