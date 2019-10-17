package H.Bridge;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月14日 下午4:48:59 
* 桥接
*/
public class BridgeTest {

	public static void main(String[] args) {
		HoseDesign design = new HoseDesign(50, 20, 3);
		BuildingCostimpl costimpl = new BuildingCostimpl(design, 6000);
		double cost=costimpl.getCost();
		System.out.print("总价为："+cost);
	}

}

//实现者
interface BuildingDesign{
	//计算面积的方法
	public double getArea();
}

//抽象
abstract class BuildingCost{
	//持有一个实现者
	BuildingDesign design;
	//单价
	double unitPrice;
	//计算建造成本的方法
	public abstract double getCost();
	//父类的构造方法
	public BuildingCost(BuildingDesign design, double unitPrice) {
		super();
		this.design = design;
		this.unitPrice = unitPrice;
	}
	
}

//具体实现
class HoseDesign implements BuildingDesign{
	double length,width;//房间长宽
	int floorNumber;//楼层
	
	public HoseDesign(double length, double width, int floorNumber) {
		super();
		this.length = length;
		this.width = width;
		this.floorNumber = floorNumber;
	}

	@Override
	public double getArea() {
		return length*width*floorNumber;
	}
	
}

//具体抽象
class BuildingCostimpl extends BuildingCost{
	
	//调用父类的构造方法
	public BuildingCostimpl(BuildingDesign design, double unitPrice) {
		super(design, unitPrice);
		
	}

	@Override
	public double getCost() {
		double area=design.getArea();
		return area*unitPrice;
	}
	
}