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
		System.out.println("创建一个美国总统！");
	};
	
	public void getName() {
		System.out.println("我是美国总统川普！");
	}

	
	public static Presdent1 getInstance() {
		if(instance==null) {
			instance=new Presdent1();
		}else {
			System.out.println("已经有一个总统了，不能产生多个总统！");
		}
		return instance;
	}
}
