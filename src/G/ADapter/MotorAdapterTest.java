package G.ADapter;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月14日 下午3:10:50 
* 类说明 
*/
public class MotorAdapterTest {

	public static void main(String[] args) {
		OpticalMotor oMotor = new OpticalMotor();
		OpticalAdapter opticalAdapter = new OpticalAdapter(oMotor);
		opticalAdapter.driver();
	}
	
}

//目标：motor
interface Motor{
		public void driver();
	}

//被适配者1：电能驱动发动机
class ElectircMotor{
		public void electircDriver(){
			System.out.println("电能发动机驱动汽车！");
	}
}

//被适配者2：光能驱动发动机
class OpticalMotor{
	public void OpticalDriver(){
		System.out.println("光能发动机驱动汽车！");
	}
}

//电能适配器
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

//光能适配器
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