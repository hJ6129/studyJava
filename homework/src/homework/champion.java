package homework;
import homework.unit;

public class champion extends unit{
	int mp;
	String type[] = {"�ٰŸ�", "���Ÿ�"};
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
		System.out.println("�⺻����!");
	}
	public void skill_Q(){
		System.out.println("Q ��ų�� ����ߴ�!");
	}
	public void skill_W(){
		System.out.println("W ��ų�� ����ߴ�!");
	}
	public void skill_E(){
		System.out.println("E ��ų�� ����ߴ�!");
	}
	public void skill_R(){
		System.out.println("R ��ų�� ����ߴ�!");
	}
}