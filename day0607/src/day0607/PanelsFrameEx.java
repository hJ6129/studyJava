package day0607;
import javax.swing.*;
import java.awt.*;

public class PanelsFrameEx extends JFrame{
	public PanelsFrameEx(){
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		BorderLayout border = new BorderLayout();
		
		c.add(new NorthPanel2(),BorderLayout.NORTH);
		c.add(new CenterPanel2(),BorderLayout.CENTER);
		c.add(new SouthPanel2(),BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PanelsFrameEx();
	}
}
class NorthPanel2 extends JPanel{
	public NorthPanel2(){
		setBackground(Color.gray);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
class CenterPanel2 extends JPanel{
	public CenterPanel2(){
		setLayout(null);
		for(int i=1; i<=20; i++){
			JLabel b = new JLabel("*");
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			b.setLocation(x,y);
			b.setSize(10,10);
			b.setForeground(Color.red);
			b.setOpaque(true);
			add(b);
		}
	}
}
class SouthPanel2 extends JPanel{
	public SouthPanel2(){
		setBackground(Color.yellow);
		add(new JLabel("Word Input"));
		add(new JTextField(15));
	}
}