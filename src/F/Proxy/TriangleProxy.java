package F.Proxy;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����4:57:03 
* ��˵�� 
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
		//�ж��Ƿ���������
		if(a+b>c&&b+c>a&&c+a>b){
			double area = triangle.getArea();
			return area;
		}else{
			return -1;
		}
		
	}

}
