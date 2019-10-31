package I.Decorator;
/** 
* @author 作�??: Suaxi
* @version 创建时间�?2019�?10�?28�? 下午3:02:43 
* 类说�? 
*/
public class DecorateTest {

	public static void main(String[] args) {
		Component p = new ConcreteComponent();
		p.opration();
		System.out.println("----------------");
		Component d = new ConcreteDecorator(p);
		d.opration();
	}

}

//抽象构件角色
interface Component{
	public void opration();
}

//具体构建角色
class ConcreteComponent implements Component{
	public ConcreteComponent(){
		System.out.println("创建了一个具体构建角色！");
	}
	@Override
	public void opration() {
		System.out.println("调用了具体构建角色操作方法！");
	}
	
}

//抽象装饰角色
class Decorator implements Component{
	//包含具体构建的实�?
	private Component com;

	public Decorator(Component com) {
		super();
		this.com = com;
	}

	@Override
	public void opration() {
		com.opration();
	}
	
}

//具体装饰角色
class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component com) {
		super(com);
	}
	
	public void operation(){
		super.opration();
		addedFunction();
	}
	
	public void addedFunction(){
		System.out.println("为具体构建角色增加额外的功能addedFunction()");
	}
}