package I.Decorator;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author 作者: Suaxi
 * @version 创建时间：2019年10月28日 下午3:40:22 类说明
 */
public class MorriganAensland {
	public static void main(String[] args) {
		Morrigan m0 = new original();
		m0.display();
		Morrigan m1 = new Succubus(m0);
		m1.display();
		Morrigan m2 = new Girl(m0);
		m2.display();
	}
}

// 抽象构件角色：莫莉卡
interface Morrigan {
	public void display();
}

// 具体构件角色：原身
class original extends JFrame implements Morrigan {
	private static final long serialVersionUID = 1L;
	private String t = "src/Morrigan0.jpg";

	public original() {
		super("《恶魔战士》中的莫莉卡•安斯兰");
	}

	public void setImage(String t) {
		this.t = t;
	}

	public void display() {
		this.setLayout(new FlowLayout());
		JLabel l1 = new JLabel(new ImageIcon(t));
		this.add(l1);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

// 抽象装饰角色：变形
class Changer implements Morrigan {
	Morrigan m;

	public Changer(Morrigan m) {
		this.m = m;
	}

	public void display() {
		m.display();
	}
}

// 具体装饰角色：女妖
class Succubus extends Changer {
	public Succubus(Morrigan m) {
		super(m);
	}

	public void display() {
		setChanger();
		super.display();
	}

	public void setChanger() {
		((original) super.m).setImage("src/Morrigan1.jpg");
	}
}

// 具体装饰角色：少女
class Girl extends Changer {
	public Girl(Morrigan m) {
		super(m);
	}

	public void display() {
		setChanger();
		super.display();
	}

	public void setChanger() {
		((original) super.m).setImage("src/Morrigan2.jpg");
	}
}