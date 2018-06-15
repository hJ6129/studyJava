package homework2;
import java.util.Scanner;

class list{
	static String [][] stepList = {
			{"중요>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"보통>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"낮음>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
	};
}

class completeList{
	static String [][] completes = {
			{"(완료)중요>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"(완료)보통>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
			{"(완료)낮음>> ","-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
		};
}

public class ToDoList {
	public static void main(String[] args) {
		System.out.println("ToDoList를 작성해 보세요.");
		System.out.println("(10개 까지 작성 가능합니다)");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("새로운 일:1, 진행중:2, 완료된 일:3, 끝내기:4 >> ");
			int s = scanner.nextInt();
			
			switch(s){
			case 1:
				System.out.print("중요도 : 중요(1), 보통(2), 낮음(3) >> ");
				int p = scanner.nextInt();

				if(p == 1){
					System.out.print("할 일 이름>> ");
					String name = scanner.next();
					System.out.print("번호(순서)>> ");
					int order = scanner.nextInt();
					list.stepList[p-1][order] = name;
				}else if(p == 2){
					System.out.print("할 일 이름>> ");
					String name = scanner.next();
					System.out.print("번호(순서)>> ");
					int order = scanner.nextInt();
					list.stepList[p-1][order] = name;
				}else if(p == 3){
					System.out.print("할 일 이름>> ");
					String name = scanner.next();
					System.out.print("번호(순서)>> ");
					int order = scanner.nextInt();
					list.stepList[p-1][order] = name;
				}
				continue;

			case 2:
				for(int i=0; i<3; i++){
					for(int j=0; j<10; j++){
						System.out.print(list.stepList[i][j] + " ");
					}System.out.println("");
				}System.out.print("<<진행중인 일들의 리스트를 불러왔습니다>>\n");
				
				System.out.print("완료한 일이 있습니다?>> 네(1) 아니오(2)>> ");
				int cselect = scanner.nextInt();
				
				switch(cselect){
					case 1:
						System.out.print("\n완료한 일의 리스트 : 중요(1), 보통(2), 낮음(3)>> ");
						int completel = scanner.nextInt();
						System.out.print("완료한 일의 번호>> ");
						int complete = scanner.nextInt();
	
						completeList.completes[completel-1][complete] = list.stepList[completel-1][complete];
						list.stepList[completel-1][complete] = "-";
						System.out.println("<<완료되었습니다>>\n");
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
				}System.out.println("<<완료된 일들의 리스트를 불러왔습니다>>\n");
				continue;
				
			case 4:
				System.out.println("종료되었습니다.");
				break;
			}
			break;
		}
	}
}