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
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int s = scanner.nextInt();
			
			switch(s){
			case 1:
				System.out.print("좌석구분 S(1), A(2), B(3) >> ");
				int p = scanner.nextInt();
				
				if(p == 1){
					for(int i=0; i<place.place[p-1].length; i++){
						System.out.print(place.place[p-1][i]+" ");
					}
					
					System.out.print("\n이름>> ");
					String name = scanner.next();
					System.out.print("번호>> ");
					int num = scanner.nextInt();
					
					if(num>10){
						System.out.println("없는 좌석 번호입니다.");
						continue;
					}else if(place.place[p-1][num] != "---"){
						System.out.println("이미 예약되어있는 자리 입니다.");
						continue;
					}else{
						place.place[p-1][num] = name;
					}
				}else if(p == 2){
					for(int i=0; i<place.place[p-1].length; i++){
						System.out.print(place.place[p-1][i]+" ");
					}
					
					System.out.print("\n이름>> ");
					String name = scanner.next();
					System.out.print("번호>> ");
					int num = scanner.nextInt();
					
					if(num>10){
						System.out.println("없는 좌석 번호입니다.");
						continue;
					}else if(place.place[p-1][num] != "---"){
						System.out.println("이미 예약되어있는 자리 입니다.");
						continue;
					}else{
						place.place[p-1][num] = name;
					}
				}else if(p == 3){
					for(int i=0; i<place.place[p-1].length; i++){
						System.out.print(place.place[p-1][i]+" ");
					}
					
					System.out.print("\n이름>> ");
					String name = scanner.next();
					System.out.print("번호>> ");
					int num = scanner.nextInt();
					
					if(num>10){
						System.out.println("없는 좌석 번호입니다.");
						continue;
					}else if(place.place[p-1][num] != "---"){
						System.out.println("이미 예약되어있는 자리 입니다.");
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
				}System.out.println("<<<조회를 완료하였습니다.>>>");
				continue;
				
			case 4:
				System.out.println("종료되었습니다.");
				break;
			}
			break;
		}
	}
}
