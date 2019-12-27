package A.SingleLeton;

public class SingleLetonHungry {

	public static void main(String[] args) {
		Presdent pre1 = Presdent.getInstance();
		pre1.getName();
		Presdent pre2 = Presdent.getInstance();
		pre2.getName();
		if(pre1==pre2) {
			System.out.println("是同一个总统！");
		}
	}
}

class Presdent{
	//1.创建一个静态的对象供系统使用
	private static final Presdent pre=new Presdent();
	//2.私有构造方法
	private Presdent() {
		System.out.println("总统被创建了！");		
	};
	public static Presdent getInstance() {
		return pre;
	}
	
	public void getName() {
		System.out.println("总统的名字是特朗普！");
	}
	
}
