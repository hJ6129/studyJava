package day0611;
import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame{
	public ButtonEx(){
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("Images/cat.png");
		ImageIcon rolloverIcon = new ImageIcon("Images/catall.png");
		ImageIcon pressedIcon = new ImageIcon("Images/instagram.png");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}
}
