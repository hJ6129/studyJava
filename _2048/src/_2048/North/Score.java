package _2048.North;

import java.awt.*;
import javax.swing.*;

public class Score extends JLabel{
	public int Score=0;
	public Score() {
		setFont(new Font("Arial",Font.LAYOUT_NO_LIMIT_CONTEXT,17));
		setSize(500,30);
		setText(Integer.toString(Score)+"       ");
		setHorizontalAlignment(RIGHT);
	}
	public void setScore(int Score) {
		this.Score=Score;
		super.setText(Integer.toString(Score)+"       ");
	}
	public void addScore(int Score) {
		this.Score+=Score;
		super.setText(Integer.toString(this.Score)+"       ");
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Arial",Font.BOLD,17));
		g.drawString("Score",365,22);
	}
}
