package F.Proxy;

import java.util.Scanner;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����5:06:20 
* ��˵�� 
*/
public class Application {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		double side[]=new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("�������"+(i+1)+"���ߵĳ��ȣ�");
			side[i]=sca.nextDouble();
		}
		TriangleProxy proxy = new TriangleProxy(side[0], side[1], side[2]);
		double area = proxy.getArea();
		if(area<0){
			System.out.println("������������Σ�");
		}else{
			System.out.print("�����ε����Ϊ��"+area);
		}
	}

}
