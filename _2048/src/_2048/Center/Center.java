package _2048.Center;

import java.awt.*;
import javax.swing.*;

import _2048.North.Score;

public class Center extends JLabel{
	public boolean aaa;
	public Tile Tile[][]=new Tile[4][4];
	public boolean asd=false;
	GameOver GameOver=new GameOver();
	public Center() {
		setSize(500,440);
		setBackground(new Color(225,204,204));
		setOpaque(true);
		setLayout(null);
		int x[]=new int[4];
		int y[]=new int[4];
		int y_=38;
		int x_=53;
		for(int i=0;i<x.length;i++) {
			x[i]=x_;
			y[i]=y_;
			y_+=101;
			x_+=101;
		}
		for(int j=0;j<Tile.length;j++) {
			for(int i=0;i<Tile[j].length;i++) {
				Tile[i][j]=new Tile();
				add(Tile[i][j]);
				Tile[i][j].setLocation(x[i],y[j]);
			}
		}
		setRamdomTile();
		setRamdomTile();
	}
	public void Judgment(){
		asd=true;
		for(int i=0;i<Tile.length;i++){
			for(int j=0;j<Tile.length;j++){
				if(Tile[i][j].TileNum==0){
					asd=false;
				}
			}
		}
		for(int i=0;i<Tile.length;i++){
			for(int j=1;j<Tile.length;j++){
				if(Tile[i][j].TileNum==Tile[i][j-1].TileNum){
					asd=false;
				}
			}
		}
		for(int i=1;i<Tile.length;i++){
			for(int j=0;j<Tile.length;j++){
				if(Tile[i][j].TileNum==Tile[i-1][j].TileNum){
					asd=false;
				}
			}
		}
		if(asd){
			gameover();
		}
	}
	public void gameover(){
		for(int j=0;j<Tile.length;j++) {
			for(int i=0;i<Tile[j].length;i++) {
				Tile[i][j].setNum(-1);
				setHorizontalAlignment(CENTER);
				setFont(new Font("DIN",Font.BOLD,60));
				setText("GAME_OVER");
			}
		}
	}
	public boolean setRamdomTile() {
		int Tilenum=(int)((Math.random()*2)+1);
		Tilenum*=2;
		boolean system=true;
		while(system) {
			int RamX=(int)(Math.random()*4);
			int RamY=(int)(Math.random()*4);
			if(Tile[RamX][RamY].TileNum==0) {
				Tile[RamX][RamY].setNum(Tilenum);
				return true;
			}
		}
		return false;
	}
	public int up() {
		aaa=false;
		int Score=0;
		for(int a=0;a<3;a++) {
			for(int i=0;i<Tile.length;i++) {
				for(int j=1;j<Tile.length;j++) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i][j-1].TileNum==0) {
							Tile[i][j-1].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		for(int i=0;i<Tile.length;i++) {
			for(int j=1;j<Tile.length;j++) {
				if(Tile[i][j].TileNum!=0) {
					if(Tile[i][j].TileNum==Tile[i][j-1].TileNum) {
						Score+=(Tile[i][j].TileNum)*2;
						Tile[i][j].setNum(0);
						Tile[i][j-1].setNum(Tile[i][j-1].TileNum*2);
						aaa=true;
					}
				}
			}
		}
		for(int a=0;a<3;a++) {
			for(int i=0;i<Tile.length;i++) {
				for(int j=1;j<Tile.length;j++) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i][j-1].TileNum==0) {
							Tile[i][j-1].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		return Score;
	}
	public int left() {
		aaa=false;
		int Score=0;
		for(int a=0;a<3;a++) {
			for(int j=0;j<Tile.length;j++) {
				for(int i=1;i<Tile[j].length;i++) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i-1][j].TileNum==0) {
							Tile[i-1][j].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		for(int j=0;j<Tile.length;j++) {
			for(int i=1;i<Tile[j].length;i++) {
				if(Tile[i][j].TileNum!=0) {
					if(Tile[i][j].TileNum==Tile[i-1][j].TileNum) {
						Score+=(Tile[i][j].TileNum)*2;
						Tile[i-1][j].setNum(Tile[i-1][j].TileNum*2);
						Tile[i][j].setNum(0);
						aaa=true;
					}
				}
			}
		}
		for(int a=0;a<3;a++) {
			for(int j=0;j<Tile.length;j++) {
				for(int i=1;i<Tile[j].length;i++) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i-1][j].TileNum==0) {
							Tile[i-1][j].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		return Score;
	}
	public int down() {
		aaa=false;
		int Score=0;
		for(int a=0;a<3;a++) {
			for(int i=0;i<Tile.length;i++) {
				for(int j=Tile.length-2;j>=0;j--) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i][j+1].TileNum==0) {
							Tile[i][j+1].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		for(int i=0;i<Tile.length;i++) {
			for(int j=Tile.length-2;j>=0;j--) {
				if(Tile[i][j].TileNum!=0) {
					if(Tile[i][j+1].TileNum==Tile[i][j].TileNum) {
						Score+=(Tile[i][j].TileNum)*2;
						Tile[i][j+1].setNum(Tile[i][j+1].TileNum*2);
						Tile[i][j].setNum(0);
						aaa=true;
					}
				}
			}
		}
		for(int a=0;a<3;a++) {
			for(int i=0;i<Tile.length;i++) {
				for(int j=Tile.length-2;j>=0;j--) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i][j+1].TileNum==0) {
							Tile[i][j+1].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		return Score;
	}
	public int right() {
		aaa=false;
		int Score=0;
		for(int a=0;a<3;a++) {
			for(int j=0;j<Tile.length;j++) {
				for(int i=Tile.length-2;i>=0;i--) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i+1][j].TileNum==0) {
							Tile[i+1][j].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		for(int j=0;j<Tile.length;j++) {
			for(int i=Tile.length-2;i>=0;i--) {
				if(Tile[i][j].TileNum!=0) {
					if(Tile[i][j].TileNum==Tile[i+1][j].TileNum) {
						Score+=(Tile[i][j].TileNum)*2;
						Tile[i+1][j].setNum(Tile[i+1][j].TileNum*2);
						Tile[i][j].setNum(0);
						aaa=true;
					}
				}
			}
		}
		for(int a=0;a<3;a++) {
			for(int j=0;j<Tile.length;j++) {
				for(int i=Tile.length-2;i>=0;i--) {
					if(Tile[i][j].TileNum!=0) {
						if(Tile[i+1][j].TileNum==0) {
							Tile[i+1][j].setNum(Tile[i][j].TileNum);
							Tile[i][j].setNum(0);
							aaa=true;
						}
					}
				}
			}
		}
		return Score;
	}
}
