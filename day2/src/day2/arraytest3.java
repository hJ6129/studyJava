package day2;

public class arraytest3 {
	public static void main(String[] args) {
		int intArray[] = new int[10];
		int sum = 0;
		
		System.out.print("������ ������ : ");
		
		for(int i=0; i<intArray.length; i++){
			intArray[i] = (int)(Math.random()*10 + 1);
			System.out.print(intArray[i] + " ");
		}
		System.out.print("\n");
		
		for(int i=0; i<intArray.length; i++){
			sum += intArray[i];
		}
		
		System.out.print("����� " + (double)sum/intArray.length);
	}
}
