package B.ProtoType;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ProtoTypeWuKong extends JPanel implements Cloneable{

	private static final long serialVersionUID=555221654115521154L;
	
	public ProtoTypeWuKong(){
		JLabel l1 = new JLabel(new ImageIcon("src/WuKong.jpg"));
		this.add(l1);
	}
	
	public Object clone(){
		ProtoTypeWuKong w=null;
		try {
			w=(ProtoTypeWuKong)super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("øΩ±¥ŒÚø’ ß∞‹£°");
		}
		return w;
	}
}

class ProtoTypeWukong{
	public static void main(String[] args) {
		JFrame jf = new JFrame("‘≠–Õƒ£ Ω≤‚ ‘");
		jf.setLayout(new GridLayout(1,2));
		Container contentPane = jf.getContentPane();
		ProtoTypeWuKong obj1 = new ProtoTypeWuKong();
		contentPane.add(obj1);
		ProtoTypeWuKong obj2 = (ProtoTypeWuKong)obj1.clone();
		contentPane.add(obj2);
		jf.pack();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
