package A.SingleLeton;

public class SingleTonLazy {

	public static void main(String[] args) {
		Presdent1 instance = Presdent1.getInstance();
		instance.getName();
		
		Presdent1 instance2 = Presdent1.getInstance();
		instance2.getName();
	}

}

class  Presdent1{
	
	private static Presdent1 instance=null;
	private Presdent1() {
		System.out.println("����һ��������ͳ��");
	};
	
	public void getName() {
		System.out.println("����������ͳ���գ�");
	}

	
	public static Presdent1 getInstance() {
		if(instance==null) {
			instance=new Presdent1();
		}else {
			System.out.println("�Ѿ���һ����ͳ�ˣ����ܲ��������ͳ��");
		}
		return instance;
	}
}
