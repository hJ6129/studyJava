package day0529;

class Point{
	public int a, b;
	public String color;
	public void set(int a, int b){
		this.a = a; this.b = b;
	}
	public String toString(){
		return color+"색의"+"(" + a + "," + b + ")"+"의 점";
	}
}

public class ColorPoint extends Point{
	public ColorPoint(){
		color = "BLACK";
	}
	public ColorPoint(int i, int j) {}
	public void setColor(){
		this.color = color;
	}
	public void showColorPoint(){
		System.out.print(color);
		toString();
	}
	
	public void setColor(String string) {
		color = "RED";
	}
	
	public void setXY(int a, int b) {
		this.a = a; this.b = b;
	}
	

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();//(0, 0)위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
	
		ColorPoint cp = new ColorPoint(10, 10);//(10, 10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	
}
