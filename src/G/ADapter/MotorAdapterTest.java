package G.ADapter;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��14�� ����3:10:50 
* ��˵�� 
*/
public class MotorAdapterTest {

	public static void main(String[] args) {
		OpticalMotor oMotor = new OpticalMotor();
		OpticalAdapter opticalAdapter = new OpticalAdapter(oMotor);
		opticalAdapter.driver();
	}
	
}

//Ŀ�꣺motor
interface Motor{
		public void driver();
	}

//��������1����������������
class ElectircMotor{
		public void electircDriver(){
			System.out.println("���ܷ���������������");
	}
}

//��������2����������������
class OpticalMotor{
	public void OpticalDriver(){
		System.out.println("���ܷ���������������");
	}
}

//����������
class ElectircAdapter implements Motor{
	private ElectircMotor emotor;
	
	public ElectircAdapter(ElectircMotor emotor) {
		super();
		this.emotor = emotor;
	}

	@Override
	public void driver() {
		emotor.electircDriver();
	}
}

//����������
class OpticalAdapter implements Motor{
	private OpticalMotor omotor;
	
	public OpticalAdapter(OpticalMotor omotor) {
		super();
		this.omotor = omotor;
	}

	@Override
	public void driver() {
		omotor.OpticalDriver();
	}
	
}