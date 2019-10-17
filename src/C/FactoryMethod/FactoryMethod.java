package C.FactoryMethod;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午3:01:10 
* 类说明 
*/
public class FactoryMethod {

	public static void main(String[] args) {
		RedBallPen redBallPen = new RedBallPen();
		PenCore penCore = redBallPen.getPenCore();
		penCore.writeWord("快放假了！");
		new BluePenCore().writeWord("好嗨哟！");
	}

}

//抽象产品
abstract class PenCore{
	String color;
	public abstract void writeWord(String s);
}

//具体产品1
class RedPenCore extends PenCore{

	RedPenCore(){
		color="红色";
	}
	
	@Override
	public void writeWord(String s) {
	System.out.println("写出了"+color+"的"+s);	
		
	}	
}

//具体产品2
class BluePenCore extends PenCore{

	BluePenCore(){
		color="蓝色";
	}
	
	@Override
	public void writeWord(String s) {
	System.out.println("写出了"+color+"的"+s);	
		
	}	
}

//具体产品3
class BlackPenCore extends PenCore{

	BlackPenCore(){
		color="黑色";
	}
	
	@Override
	public void writeWord(String s) {
	System.out.println("写出了"+color+"的"+s);	
		
	}
}

//抽象工厂
abstract class BallPen{
	BallPen(){
		System.out.println("生产了一只装有"+getPenCore().color+"笔芯的圆珠笔！");
	}
	public abstract PenCore getPenCore();
}

//具体工厂1
class RedBallPen extends BallPen{
	
	@Override
	public PenCore getPenCore() {
		return new RedPenCore();
	}
}

//具体工厂2
class BlueBallPen extends BallPen{
	
	@Override
	public PenCore getPenCore() {
		return new BluePenCore();
	}
}

//具体工厂3
class BlackBallPen extends BallPen{
	
	@Override
	public PenCore getPenCore() {
		return new BlackPenCore();
	}
}