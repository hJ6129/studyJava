package _2048.North;

import java.awt.*;
import javax.swing.*;

public class Title extends JLabel{
	public Title() {
		setFont(new Font("Arial",Font.LAYOUT_NO_LIMIT_CONTEXT,30));
		setText("   2048");
		setSize(500,30);
	}
}
