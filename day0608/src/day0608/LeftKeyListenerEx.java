package day0608;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LeftKeyListenerEx extends JFrame{
	public LeftKeyListenerEx(){
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Love Java");
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		la.addKeyListener(new LeftKeyList());
		
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
		
		la.setFocusable(true);
		la.requestFocus();
	}
	
	class LeftKeyList extends KeyAdapter{
		String LJ = new String("Love Java ");
		public void keyPressed(KeyEvent e){
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				JLabel la = (JLabel)e.getSource();
				String first = LJ.substring(0, 1);
				String last = LJ.substring(1);
				LJ = last + first;
				la.setText(LJ);
			}
		}
	}
	
	public static void main(String[] args) {
		new LeftKeyListenerEx();
	}
}