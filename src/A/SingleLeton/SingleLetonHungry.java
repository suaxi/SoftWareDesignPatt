package A.SingleLeton;

public class SingleLetonHungry {

	public static void main(String[] args) {
		Presdent pre1 = Presdent.getInstance();
		pre1.getName();
		Presdent pre2 = Presdent.getInstance();
		pre2.getName();
		if(pre1==pre2) {
			System.out.println("��ͬһ����ͳ��");
		}
	}
}

class Presdent{
	//1.����һ����̬�Ķ���ϵͳʹ��
	private static final Presdent pre=new Presdent();
	//2.˽�й��췽��
	private Presdent() {
		System.out.println("��ͳ�������ˣ�");		
	};
	public static Presdent getInstance() {
		return pre;
	}
	
	public void getName() {
		System.out.println("��ͳ�������������գ�");
	}
	
}
