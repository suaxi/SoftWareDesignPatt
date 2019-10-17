package H.Bridge;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��14�� ����5:21:07 
* ��˵�� 
*/
public class BagSelectTest {

	public static void main(String[] args) {
		Red red = new Red();
		Wallet wallet = new Wallet();
		wallet.setColor(red);
		String getName = wallet.getName();
		System.out.println(getName);
		show(getName);
	}

public static void show(String name) {
	JFrame jf = new JFrame("�Ž�ģʽ����");
	Container contentPane = jf.getContentPane();
	JPanel p = new JPanel();
	JLabel l = new JLabel(new ImageIcon("src/" + name + ".jpg"));
	p.setLayout(new GridLayout(1, 1));
	p.setBorder(BorderFactory.createTitledBorder("ŮʿƤ��"));
	p.add(l);
	contentPane.add(p, BorderLayout.CENTER);
	jf.pack();
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//ʵ���ࣺ��ʾ��ɫ
interface Color{
	public String getColor();
}

//����ʵ��1����ɫ
class Yellow implements Color{

	@Override
	public String getColor() {
		
		return "yellow";
	}
	
}

//����ʵ��2����ɫ
class  Red implements Color{

	@Override
	public String getColor() {
		
		return "red";
	}
	
}

//���󣺱�ʾ��������
abstract class BagType{
	//����һ��ʵ��
	Color color;

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract String getName();
}

//�������1��Ǯ��
class Wallet extends BagType{

	@Override
	public String getName() {
		
		return color.getColor()+"Wallet";
	}
	
}

//�������2�����
class HandBag extends BagType{

	@Override
	public String getName() {
		
		return color.getColor()+"HandBag";
	}
	
}