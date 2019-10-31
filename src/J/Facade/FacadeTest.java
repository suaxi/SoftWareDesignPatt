package J.Facade;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��28�� ����5:23:35 
* ���ģʽ 
*/
public class FacadeTest {

	public static void main(String[] args) {
		String str="������ڲ���������ֻ���԰׽�";
		Facade facade = new Facade(str);
		facade.Method();
	}

}

//��ϵͳ1������ͳ������
class CheackWord{
	//������
	public static final int basicAmount=85;
	//������ַ���
	String str;
	//�ַ���������
	int amount;
	public CheackWord(String str) {
		super();
		this.str = str;
	}
	//��������
	public void setChargeAmount(){
		amount=basicAmount+str.length();
		System.out.println("�������Ϊ��"+amount);
	}
	
	//��ȡ�����ַ���
	public int getAmount() {
		return amount;
	}
	
}

//��ϵͳ2�����������
class Charge{
	//����
	public static final int price=12;
	CheackWord cw;
	public Charge(CheackWord cw) {
		super();
		this.cw = cw;
	}
	
	//����۸�
	public void giveCharge(){
		int charge=cw.getAmount() *price;
		System.out.println("������Ϊ��"+charge+"Ԫ");
	}
}

//��ϵͳ3���Ű�
class Type{
	//����
	String str;

	public Type(String str) {
		super();
		this.str = str;
	}
	
//�Ű�
public void typeSetting(){
	System.out.println("����Ű��ʽ��");
	System.out.println("===========");
	System.out.println(str);
	System.out.println("===========");
	}
}

//���
class Facade{
	private CheackWord cw;
	private Charge ch;
	private Type type;
	String str;
	public Facade(String str) {
		super();
		this.str = str;
		cw = new CheackWord(str);
		ch = new Charge(cw);
		type = new Type(str);
	}
	
	public void  Method(){
		//��������
		cw.setChargeAmount();
		//�������
		ch.giveCharge();
		//�Ű�
		type.typeSetting();
	}
}