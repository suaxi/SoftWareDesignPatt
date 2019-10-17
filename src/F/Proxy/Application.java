package F.Proxy;

import java.util.Scanner;

/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午5:06:20 
* 类说明 
*/
public class Application {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		double side[]=new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("请如入第"+(i+1)+"条边的长度：");
			side[i]=sca.nextDouble();
		}
		TriangleProxy proxy = new TriangleProxy(side[0], side[1], side[2]);
		double area = proxy.getArea();
		if(area<0){
			System.out.println("不能组成三角形！");
		}else{
			System.out.print("三角形的面积为："+area);
		}
	}

}
