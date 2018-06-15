package day0528;

class Point{
	private int x, y;
	public Point(){
		this.x = this.y  = 0;
	}
	public Point(int x, int y){
		this.x = x; this.y = y;
	}
	public void showPoint(){
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	public void showcolorPoint(){
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showcolorPoint();
	}
}
