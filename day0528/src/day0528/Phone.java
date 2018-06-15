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
			
		System.out.print("�ο���>> ");
		int max = scanner.nextInt();
		
		PhoneBook [] p = new PhoneBook[max];
		
		for(int i=0; i<p.length; i++){
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>> ");
			String name = scanner.next();
			String tel = scanner.next();
			p[i] = new PhoneBook(name, tel);
		}
		System.out.println("����Ǿ����ϴ�.");

		while(true){
			System.out.print("�˻��� �̸�>> ");
			String name = scanner.next();
			if(name.equals("�׸�")){
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}else if(!name.equals("�׸�")){
				for(int i=0; i<p.length; i++){
					if(p[i].getName().equals(name)){
						String tel =  p[i].getTel();
						System.out.println(name + "�� ��ȣ�� " + tel + "�Դϴ�.");
					}
				}
			}
		}
		scanner.close();
	}
}
