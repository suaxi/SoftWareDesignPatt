package I.Decorator;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月28日 下午4:27:12 
* 装饰模式-麻雀电子翅膀实例
*/
public class BirdTest {

	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		int distance1 = sparrow.fly();
		System.out.println("麻雀能够飞"+distance1+"米！");
		ConccreatDeractor1 con = new ConccreatDeractor1(sparrow);
		int distance2 = con.fly();
		System.out.println("装了电子翅膀的麻雀能飞"+distance2+"米！");
	}

}

//抽象组件
interface Bird{
	public int fly();
}

//具体抽象角色
class Sparrow implements Bird{
	//静态常量：飞行距离
	private static final int distance=100;
	@Override
	public int fly() {
		return distance;
	}
	
}

//抽象装饰
abstract class Deractor1 implements Bird{
	protected Bird bird;
	
	public Deractor1(Bird bird) {
		super();
		this.bird = bird;
	}
	
}

//具体装饰
class ConccreatDeractor1 extends Deractor1{
	public static final int distance=50;
	public ConccreatDeractor1(Bird bird) {
		super(bird);
		
	}

	@Override
	public int fly() {
		
		return bird.fly()+eleFly();
	}
	
	//添加电子翅膀方法
	public int eleFly(){
		return distance;
	}
}