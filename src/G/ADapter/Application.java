package G.ADapter;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月14日 下午3:38:30 
* 类说明 
*/
public class Application {

	public static void main(String[] args) {
		ThreeElectircOutlet outlet;
		Wash wash = new Wash();
		outlet=wash;
		System.out.println("使用三相插座接通电流：");
		outlet.connectEC();
		TV tv = new TV();
		TreeElectircAdapter adapter = new TreeElectircAdapter(tv);
		outlet=adapter;
		System.out.println("使用三相插座接通电流：");
		outlet.connectEC();
	}

}
class Wash implements ThreeElectircOutlet{
	String name;
	Wash(){
		name="黄河洗衣机";
	}
	
	Wash(String s){
		name=s;
	}
	

	@Override
	public void connectEC() {
		turnOn();
	}
	
	public void turnOn(){
	System.out.println(name+"开始洗衣物！");	
	}

}

class TV implements TwoEOutlet{
	String name;
	TV(){
		name="长江电视";
	}
	
	TV(String s){
	name=s;	
	}
	
	@Override
	public void connectEC() {
		turnOn();
	}
	
	public void turnOn(){
		System.out.println(name+"开始播放节目！");
	}
}
