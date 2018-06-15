package homework;
import homework.unit;

public class champion extends unit{
	int mp;
	String type[] = {"근거리", "원거리"};
	int realType;
	double attSpeed;
	int demage;
	int spellDemage;
	int level = 1;
	
	public champion() {}
	
	public champion(int realType){
		if(realType == 0){
			this.hp = 100;
			this.mp = 100;
			this.attSpeed = 0.5;
			this.demage = 10;
			this.spellDemage = 0;
		}else if(realType == 1){
			this.hp = 80;
			this.mp = 120;
			this.attSpeed = 0.4;
			this.demage = 4;
			this.spellDemage = 15;
		}
	}
	
	public void basicAtt(){
		System.out.println("기본공격!");
	}
	public void skill_Q(){
		System.out.println("Q 스킬을 사용했다!");
	}
	public void skill_W(){
		System.out.println("W 스킬을 사용했다!");
	}
	public void skill_E(){
		System.out.println("E 스킬을 사용했다!");
	}
	public void skill_R(){
		System.out.println("R 스킬을 사용했다!");
	}
}