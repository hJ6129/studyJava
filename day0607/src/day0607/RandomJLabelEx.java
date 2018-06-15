package day0607;
import javax.swing.*;
import java.awt.*;

public class RandomJLabelEx extends JFrame {
	public RandomJLabelEx(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container la = getContentPane();
		
		setSize(300,300);
		setVisible(true);
		
		for(int i=1; i<=20; i++){
			JLabel b = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			b.setLocation(x,y);
			b.setSize(10,10);
			b.setBackground(Color.blue);
			b.setOpaque(true);
			la.add(b);
		}
	}
	
	public static void main(String[] args) {
		new RandomJLabelEx();
	}
}
