package day0611;
import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame{
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	
	public ListEx(){
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
		c.add(strList);
		
		JList<String> scrollList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
		c.add(new JScrollPane(scrollList)); //����Ʈ�� JScrollPane�� ����
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}

}
