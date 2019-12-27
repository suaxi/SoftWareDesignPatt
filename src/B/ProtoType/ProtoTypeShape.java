package B.ProtoType;

import java.util.HashMap;
import java.util.Scanner;

public class ProtoTypeShape {

	public static void main(String[] args) {
		ProtoTypeMannager pm = new ProtoTypeMannager();
		Shape shape = pm.getShape("cir");
//		shape.countArea();
		Shape shape2 = pm.getShape("squ");
//		shape2.countArea();
		pm.addShape("tri", new Triangle());
		Shape shape3 = pm.getShape("tri");
		shape3.countArea();
	}	
}

interface Shape extends Cloneable {
	public Object clone();// 克隆

	public void countArea();// 计算面积
}

//三角形
class Triangle implements Shape{
	@Override
	public void countArea() {
		Scanner sca = new Scanner(System.in);
		System.out.println("这是一个三角形，请输入底：");
		double base = sca.nextDouble();
		System.out.println("请输入高：");
		double heigth = sca.nextDouble();
		
		System.out.println("三角形的面积为：" + base * heigth /2);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		Triangle t = null;
		try {
			t = (Triangle) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("克隆失败！");
			e.printStackTrace();
		}
		return t;
	}
}

// 圆形
class Cir implements Shape {

	@Override
	public void countArea() {
		Scanner sca = new Scanner(System.in);
		System.out.println("这是一个圆形，请输入半径：");
		double r = sca.nextDouble();
		double pi = Math.PI;
		System.out.println("圆形的面积为：" + pi * r * r);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		Cir c = null;
		try {
			c = (Cir) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("克隆失败！");
			e.printStackTrace();
		}
		return c;
	}
}

// 正方形
class Squ implements Shape {

	@Override
	public void countArea() {
		Scanner sca = new Scanner(System.in);
		System.out.println("这是一个正方形，请输入边长：");
		double l = sca.nextDouble();
		System.out.println("正方形的面积为：" + l * l);
	}

	@Override
	public Object clone() {
		Squ s = null;
		try {
			s = (Squ) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("拷贝正方形失败！");
			e.printStackTrace();
		}
		return s;
	}

}

class ProtoTypeMannager{
	private HashMap<String,Shape> hm=new HashMap<String,Shape>();

	public ProtoTypeMannager() {
		hm.put("cir", new Cir());
		hm.put("squ", new Squ());
	}
	
	public void addShape(String key,Shape shape) {
		hm.put(key, shape);				
	}
	
	public Shape getShape(String key) {
		Shape shape = hm.get(key);
		Shape s =(Shape) shape.clone();
		return s;
		
	}
	
	
	
}


