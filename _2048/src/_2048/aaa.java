package _2048;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

import _2048.Center.Center;
import _2048.North.North;
import _2048.South.South;

import java.util.*;
import java.io.*;

public class aaa extends JFrame{
	North North=new North();
	Center Center=new Center();
	South South=new South();
	public aaa() {
		super("2048");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500,500);
		Container c=getContentPane();
		new BoxLayout(c,0);
		add(North);
		add(Center);
		add(South);
		setResizable(false);
		addKeyListener(new play());
		setLocationRelativeTo(null);
	}
	class play extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(Center.asd!=true){
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					North.score.addScore(Center.left());
					if(Center.aaa){
						if(Center.setRamdomTile()){}
					}
					Center.Judgment();
					break;
				case KeyEvent.VK_RIGHT:
					North.score.addScore(Center.right());
					if(Center.aaa){
						if(Center.setRamdomTile()){}
					}
					Center.Judgment();
					break;
				case KeyEvent.VK_UP:
					North.score.addScore(Center.up());
					if(Center.aaa){
						if(Center.setRamdomTile()){}
					}
					Center.Judgment();
					break;
				case KeyEvent.VK_DOWN:
					North.score.addScore(Center.down());
					if(Center.aaa){
						if(Center.setRamdomTile()){}
					}
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		new aaa();
	}
}