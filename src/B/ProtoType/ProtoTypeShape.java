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
	public Object clone();// ��¡

	public void countArea();// �������
}

//������
class Triangle implements Shape{
	@Override
	public void countArea() {
		Scanner sca = new Scanner(System.in);
		System.out.println("����һ�������Σ�������ף�");
		double base = sca.nextDouble();
		System.out.println("������ߣ�");
		double heigth = sca.nextDouble();
		
		System.out.println("�����ε����Ϊ��" + base * heigth /2);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		Triangle t = null;
		try {
			t = (Triangle) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("��¡ʧ�ܣ�");
			e.printStackTrace();
		}
		return t;
	}
}

// Բ��
class Cir implements Shape {

	@Override
	public void countArea() {
		Scanner sca = new Scanner(System.in);
		System.out.println("����һ��Բ�Σ�������뾶��");
		double r = sca.nextDouble();
		double pi = Math.PI;
		System.out.println("Բ�ε����Ϊ��" + pi * r * r);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		Cir c = null;
		try {
			c = (Cir) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("��¡ʧ�ܣ�");
			e.printStackTrace();
		}
		return c;
	}
}

// ������
class Squ implements Shape {

	@Override
	public void countArea() {
		Scanner sca = new Scanner(System.in);
		System.out.println("����һ�������Σ�������߳���");
		double l = sca.nextDouble();
		System.out.println("�����ε����Ϊ��" + l * l);
	}

	@Override
	public Object clone() {
		Squ s = null;
		try {
			s = (Squ) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("����������ʧ�ܣ�");
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


