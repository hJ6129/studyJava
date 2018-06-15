package day0529;
 
abstract class PairMap{
	protected String keyArray []; //key ���� �����ϴ� �迭
	protected String valueArray []; //value ���� �����ϴ� �迭
	abstract String get(String key); //key ���� ���� value ����. ������  null ����
	abstract void put(String key, String value); //key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	
	abstract String delete(String key); //key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
	abstract int length(); //���� ����� �������� ���� ����
}

class Dictionary extends PairMap{
	int i=0;
	public Dictionary(int num){
		keyArray = new String[num];
		valueArray = new String[num];
	}
	
	@Override
	public String get(String key) {
		int k = 0;
		for(int j=0;j<keyArray.length;j++){
			if(keyArray[j] !=null && keyArray[j].equals(key)){
				k=j;
			}
		}
		return valueArray[k];
	}
 
	@Override
	public void put(String key, String value) {
		for(int j=0;j<keyArray.length;j++){
			if(keyArray[j]!=null && keyArray[j].equals(key)){
				keyArray[j] = key;
				valueArray[j] = value;
				break;
			}
			else if(keyArray[j] == null){
				keyArray[j] = key;
				valueArray[j] = value;
				break;
			}
		}
	}
 
	@Override
	public String delete(String key) {
		String rt = null;
		int k = 0;
		for(int j=0;j<keyArray.length;j++){
			if(keyArray[j]!=null && keyArray[j].equals(key)){
				k=j;
				rt = valueArray[k];
			}
		}
		keyArray[k] =null;
		valueArray[k] = null;
		return rt;
	}
 
	@Override
	public int length() {
		return 0;
	}
	
}
public class DictionaryApp extends Dictionary{
	public DictionaryApp(int i) {
		super(i);
	}
 
	public static void main(String[] args){
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); //���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
//		System.out.println("������ ��:" + dic.delete("Ȳ����"));
		dic.delete("Ȳ����"); //Ȳ���� ������ ����
		
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
}