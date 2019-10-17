package F.Proxy;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午4:49:45 
* 类说明 
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
