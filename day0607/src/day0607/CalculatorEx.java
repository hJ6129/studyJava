package day0607;
import javax.swing.*;
import java.awt.*;

public class CalculatorEx extends JFrame{
	public CalculatorEx(){
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		BorderLayout border = new BorderLayout();
		
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		c.add(new SouthPanel(),BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalculatorEx();
	}

}

class NorthPanel extends JPanel{
	public NorthPanel(){
		add(new JLabel("수식입력"));
		add(new JTextField(15));
	}
}
class CenterPanel extends JPanel{
	public CenterPanel(){
		setLayout(new GridLayout(4,4));
		String [] jbt = {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","x","/"};
		for(int i=0; i<jbt.length; i++){
			if(i>=12){
				add(new JButton(jbt[i])).setBackground(Color.blue);
				setOpaque(true);
			}else{
				add(new JButton(jbt[i]));
			}
		}
	}
}
class SouthPanel extends JPanel{
	public SouthPanel(){
		add(new JLabel("계산결과"));
		add(new JTextField(15));
	}
}