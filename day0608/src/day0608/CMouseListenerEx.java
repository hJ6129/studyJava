package day0608;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CMouseListenerEx extends JFrame{
	private JLabel la = new JLabel("C");
	
	public CMouseListenerEx(){
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		la.setSize(10,10);
		la.setLocation(30,30);
		
		CilckC listener = new CilckC(); //리스터 객체 생성
		la.addMouseListener(listener); //MouseListener 리스너 등록
		
		c.add(la);
		setSize(300,300);
		setVisible(true);
	}
	
	class CilckC extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			int x = (int)(Math.random()*200);
			int y = (int)(Math.random()*200);
			la.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new CMouseListenerEx();
	}

}
