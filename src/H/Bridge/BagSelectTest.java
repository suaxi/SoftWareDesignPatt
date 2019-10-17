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
* @author 作者: Suaxi
* @version 创建时间：2019年10月14日 下午5:21:07 
* 类说明 
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
	JFrame jf = new JFrame("桥接模式测试");
	Container contentPane = jf.getContentPane();
	JPanel p = new JPanel();
	JLabel l = new JLabel(new ImageIcon("src/" + name + ".jpg"));
	p.setLayout(new GridLayout(1, 1));
	p.setBorder(BorderFactory.createTitledBorder("女士皮包"));
	p.add(l);
	contentPane.add(p, BorderLayout.CENTER);
	jf.pack();
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//实现类：表示颜色
interface Color{
	public String getColor();
}

//具体实现1：黄色
class Yellow implements Color{

	@Override
	public String getColor() {
		
		return "yellow";
	}
	
}

//具体实现2：红色
class  Red implements Color{

	@Override
	public String getColor() {
		
		return "red";
	}
	
}

//抽象：表示包的类型
abstract class BagType{
	//持有一个实现
	Color color;

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract String getName();
}

//具体抽象1：钱包
class Wallet extends BagType{

	@Override
	public String getName() {
		
		return color.getColor()+"Wallet";
	}
	
}

//具体抽象2：挎包
class HandBag extends BagType{

	@Override
	public String getName() {
		
		return color.getColor()+"HandBag";
	}
	
}