package day0529;

class Point2{
	int x, y;
	public Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj){
		System.out.println(obj.getClass().getName()); //Ŭ���� �̸�
		System.out.println(obj.hashCode()); //�ؽ� �ڵ� ��
		System.out.println(obj.toString()); //��ü�� ���ڿ��� ����� ���
		System.out.println(obj); //��ü ���
	}
	
	public static void main(String[] args) {
		Point2 p = new Point2(2,3);
		print(p);
	}
}
