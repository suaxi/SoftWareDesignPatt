package I.Decorator;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��28�� ����4:27:12 
* װ��ģʽ-��ȸ���ӳ��ʵ��
*/
public class BirdTest {

	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		int distance1 = sparrow.fly();
		System.out.println("��ȸ�ܹ���"+distance1+"�ף�");
		ConccreatDeractor1 con = new ConccreatDeractor1(sparrow);
		int distance2 = con.fly();
		System.out.println("װ�˵��ӳ�����ȸ�ܷ�"+distance2+"�ף�");
	}

}

//�������
interface Bird{
	public int fly();
}

//��������ɫ
class Sparrow implements Bird{
	//��̬���������о���
	private static final int distance=100;
	@Override
	public int fly() {
		return distance;
	}
	
}

//����װ��
abstract class Deractor1 implements Bird{
	protected Bird bird;
	
	public Deractor1(Bird bird) {
		super();
		this.bird = bird;
	}
	
}

//����װ��
class ConccreatDeractor1 extends Deractor1{
	public static final int distance=50;
	public ConccreatDeractor1(Bird bird) {
		super(bird);
		
	}

	@Override
	public int fly() {
		
		return bird.fly()+eleFly();
	}
	
	//��ӵ��ӳ�򷽷�
	public int eleFly(){
		return distance;
	}
}