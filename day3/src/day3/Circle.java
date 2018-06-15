package day3;

public class Circle {
//	//필드 선언
//	int radius;
//	String name;
//	
//	public Circle() {} //기본 생성자
//	
//	public double getArea(){
//		return 3.14*radius*radius;
//	}
//	
//	public static void main(String[] args) {
//		Circle pizza; //Circle 객체에 대한 레퍼런스(주소) 변수 선언 / (객체생성x 레퍼런스(주소)만 선언)
//		pizza = new Circle(); //Circle 객체 생성
//		pizza.radius = 10;
//		pizza.name = "자바피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
//		
//		Circle donut = new Circle(); //Circle 객체에 대한 레퍼런스 변수 선언 과 동시에 객체 생성
//		donut.radius = 2;
//		donut.name = "자바도넛";
//		area = donut.getArea();
//		System.out.println(donut.name + "의 면적은" + area);
//	}

	//생성자 선언 및 활용
	int radius;
	String name;
	
	public Circle() { //매개 변수 없는 생성자
		radius = 1; name = ""; //필드 초기화
	}
	
	public Circle(int r, String n){ //매개 변수를 가진 생성자
		radius = r; name = n; //매개 변수로 필드 초기화
	}
	
	public double getArea(){
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자"); //객체 생성, 반지름을 10으로, 이름을 "자바피자"로 초기화
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //객체 생성, 반지름을 1, 이름을 ""로 초기화
		donut.name = "도넛피자"; //이름변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
	}
}
