package _2048.Center;

import java.awt.*;
import javax.swing.*;

public class Tile extends JLabel{
	boolean over=true;
	public int TileNum=0;
	public Tile() {
		setHorizontalAlignment(CENTER);
		setFont(new Font("DIN",Font.BOLD,30));
		setForeground(Color.white);
		setSize(93,93);
		setBackground(new Color(205,193,180));
		setOpaque(true);
		if(TileNum!=0) {
			setText(Integer.toString(TileNum));
		}
	}
	public void setNum(int num) {
		if(over){
			TileNum=num;
			if(TileNum!=0) {
				setText(Integer.toString(TileNum));
			}
			else {
				setText("");
			}
			if(TileNum==2) {
				setBackground(new Color(238,228,219));
				setForeground(new Color(113,104,95));
			}
			else if(TileNum==4) {
				setBackground(new Color(243,228,209));
				setForeground(new Color(103,94,79));
			}
			else if(TileNum==8) {
				setBackground(new Color(243,176,123));
			}
			else if(TileNum==16) {
				setBackground(new Color(241,151,98));
			}
			else if(TileNum==32) {
				setBackground(new Color(248,122,97));
			}
			else if(TileNum==64) {
				setBackground(new Color(238,99,58));
			}
			else if(TileNum==128) {
				setBackground(new Color(235,209,112));
			}
			else if(TileNum==256) {
				setBackground(new Color(239,206,101));
			}
			else if(TileNum==512) {
				setBackground(new Color(237,204,59));
			}
			else if(TileNum==1024) {
				setBackground(new Color(239,197,61));
			}
			else if(TileNum==2048) {
				setBackground(new Color(239,193,43));
			}
			else if(TileNum>2048){
				setBackground(new Color(63,58,52));
			}
			else {
				setBackground(new Color(205,193,180));
			}
			if(TileNum>=8){
				setForeground(new Color(244,242,227));
			}
			if(TileNum==-1){
				setText("");
				setOpaque(false);
				over=false;
			}
		}
	}
}
