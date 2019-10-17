package H.Bridge;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��14�� ����4:48:59 
* �Ž�
*/
public class BridgeTest {

	public static void main(String[] args) {
		HoseDesign design = new HoseDesign(50, 20, 3);
		BuildingCostimpl costimpl = new BuildingCostimpl(design, 6000);
		double cost=costimpl.getCost();
		System.out.print("�ܼ�Ϊ��"+cost);
	}

}

//ʵ����
interface BuildingDesign{
	//��������ķ���
	public double getArea();
}

//����
abstract class BuildingCost{
	//����һ��ʵ����
	BuildingDesign design;
	//����
	double unitPrice;
	//���㽨��ɱ��ķ���
	public abstract double getCost();
	//����Ĺ��췽��
	public BuildingCost(BuildingDesign design, double unitPrice) {
		super();
		this.design = design;
		this.unitPrice = unitPrice;
	}
	
}

//����ʵ��
class HoseDesign implements BuildingDesign{
	double length,width;//���䳤��
	int floorNumber;//¥��
	
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

//�������
class BuildingCostimpl extends BuildingCost{
	
	//���ø���Ĺ��췽��
	public BuildingCostimpl(BuildingDesign design, double unitPrice) {
		super(design, unitPrice);
		
	}

	@Override
	public double getCost() {
		double area=design.getArea();
		return area*unitPrice;
	}
	
}