package day0528;
import java.util.Scanner;

class PhoneBook {
	private String name;
	private String tel;
	
	public PhoneBook(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	public String getName(){
		return name;
	}
	public String getTel(){
		return tel;
	}
}	

class Phone{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("인원수>> ");
		int max = scanner.nextInt();
		
		PhoneBook [] p = new PhoneBook[max];
		
		for(int i=0; i<p.length; i++){
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new PhoneBook(name, tel);
		}
		System.out.println("저장되었습니다.");

		while(true){
			System.out.print("검색할 이름>> ");
			String name = scanner.next();
			if(name.equals("그만")){
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}else if(!name.equals("그만")){
				for(int i=0; i<p.length; i++){
					if(p[i].getName().equals(name)){
						String tel =  p[i].getTel();
						System.out.println(name + "의 번호는 " + tel + "입니다.");
					}
				}
			}
		}
		scanner.close();
	}
}
