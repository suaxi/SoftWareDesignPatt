package F.Proxy;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午4:57:03 
* 类说明 
*/
public class TriangleProxy implements GEO{
	double a,b,c;
	Triangle triangle;
	public TriangleProxy(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		triangle = new Triangle(a,b,c);
		//判断是否是三角形
		if(a+b>c&&b+c>a&&c+a>b){
			double area = triangle.getArea();
			return area;
		}else{
			return -1;
		}
		
	}

}
