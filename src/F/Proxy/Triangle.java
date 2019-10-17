package F.Proxy;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����4:49:45 
* ��˵�� 
*/
public class Triangle implements GEO {
	double sideA,sideB,sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double getArea() {
		double p=(sideA+sideB+sideC)/2;
		return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}

}
