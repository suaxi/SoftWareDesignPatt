package G.ADapter;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��14�� ����3:38:30 
* ��˵�� 
*/
public class Application {

	public static void main(String[] args) {
		ThreeElectircOutlet outlet;
		Wash wash = new Wash();
		outlet=wash;
		System.out.println("ʹ�����������ͨ������");
		outlet.connectEC();
		TV tv = new TV();
		TreeElectircAdapter adapter = new TreeElectircAdapter(tv);
		outlet=adapter;
		System.out.println("ʹ�����������ͨ������");
		outlet.connectEC();
	}

}
class Wash implements ThreeElectircOutlet{
	String name;
	Wash(){
		name="�ƺ�ϴ�»�";
	}
	
	Wash(String s){
		name=s;
	}
	

	@Override
	public void connectEC() {
		turnOn();
	}
	
	public void turnOn(){
	System.out.println(name+"��ʼϴ���");	
	}

}

class TV implements TwoEOutlet{
	String name;
	TV(){
		name="��������";
	}
	
	TV(String s){
	name=s;	
	}
	
	@Override
	public void connectEC() {
		turnOn();
	}
	
	public void turnOn(){
		System.out.println(name+"��ʼ���Ž�Ŀ��");
	}
}
