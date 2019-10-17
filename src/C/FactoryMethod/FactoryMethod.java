package C.FactoryMethod;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����3:01:10 
* ��˵�� 
*/
public class FactoryMethod {

	public static void main(String[] args) {
		RedBallPen redBallPen = new RedBallPen();
		PenCore penCore = redBallPen.getPenCore();
		penCore.writeWord("��ż��ˣ�");
		new BluePenCore().writeWord("����Ӵ��");
	}

}

//�����Ʒ
abstract class PenCore{
	String color;
	public abstract void writeWord(String s);
}

//�����Ʒ1
class RedPenCore extends PenCore{

	RedPenCore(){
		color="��ɫ";
	}
	
	@Override
	public void writeWord(String s) {
	System.out.println("д����"+color+"��"+s);	
		
	}	
}

//�����Ʒ2
class BluePenCore extends PenCore{

	BluePenCore(){
		color="��ɫ";
	}
	
	@Override
	public void writeWord(String s) {
	System.out.println("д����"+color+"��"+s);	
		
	}	
}

//�����Ʒ3
class BlackPenCore extends PenCore{

	BlackPenCore(){
		color="��ɫ";
	}
	
	@Override
	public void writeWord(String s) {
	System.out.println("д����"+color+"��"+s);	
		
	}
}

//���󹤳�
abstract class BallPen{
	BallPen(){
		System.out.println("������һֻװ��"+getPenCore().color+"��о��Բ��ʣ�");
	}
	public abstract PenCore getPenCore();
}

//���幤��1
class RedBallPen extends BallPen{
	
	@Override
	public PenCore getPenCore() {
		return new RedPenCore();
	}
}

//���幤��2
class BlueBallPen extends BallPen{
	
	@Override
	public PenCore getPenCore() {
		return new BluePenCore();
	}
}

//���幤��3
class BlackBallPen extends BallPen{
	
	@Override
	public PenCore getPenCore() {
		return new BlackPenCore();
	}
}