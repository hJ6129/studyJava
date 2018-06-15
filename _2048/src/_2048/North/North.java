package _2048.North;

import java.awt.*;
import javax.swing.*;

public class North extends JLabel{
	public Score score=new Score();
	public North() {
		setSize(500,30);
		setBackground(new Color(225,204,0));
		setOpaque(true);
		add(new Title());
		add(score);
	}
}