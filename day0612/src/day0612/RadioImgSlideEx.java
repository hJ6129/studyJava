package day0612;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Vector;
import java.io.File;

public class RadioImgSlideEx extends JFrame{
	private Vector<ImageIcon> v = new Vector<ImageIcon>();
	private JLabel imageArea = new JLabel();
	private int num = 0;
	
	public RadioImgSlideEx(){
		Fileput();
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton left = new JRadioButton("¿ÞÂÊ");
		JRadioButton right = new JRadioButton("¿À¸¥ÂÊ", true);
		
		imageArea.setIcon(v.get(num));
		
		g.add(left);
		g.add(right);
		
		c.add(left);
		c.add(right);
		c.add(imageArea);
		
		setSize(300,300);
		setVisible(true);
		
		c.addMouseListener(new MouseAdapter(){
			public void slideRigth(MouseEvent e){
				int max = v.size()-1;
				if(right.isSelected()){
					num++;
					if(num>=max){
						num=0;
					}
					imageArea.setIcon(v.get(num));
				}else if(left.isSelected()){
					num--;
					if(num<0){
						num=max;
					}
					imageArea.setIcon(v.get(num));
				}
			}
		});
	}
	
	void Fileput(){
		File f = null;
	    File[] paths;
		f = new File("C:\\users\\emt00\\workspace\\day0612\\images");
        paths = f.listFiles();
        for(File path:paths) {
           if(path.isFile()){
        	  String tempPath = path.getParent() + "\\" + path.getName();
        	  v.add(new ImageIcon(tempPath));
           }
        }
	}
	
	public static void main(String[] args) {
		new RadioImgSlideEx();
	}
}
