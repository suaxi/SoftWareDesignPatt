package B.ProtoType;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


 //访问测试类
public class ProtoTypeWuKong{
	public static void main(String[] args) throws CloneNotSupportedException {
		JFrame jFrame = new JFrame("原型模式测试");
		jFrame.setLayout(new GridLayout(1,2));
		//初始化一个容器
		Container contentPane = jFrame.getContentPane();		
		SunWuKong obj1 = new SunWuKong();
		//在容器中添加控件
		contentPane.add(obj1);
		SunWuKong obj2 = (SunWuKong)obj1.clone();
		contentPane.add(obj2);
//		根据内容的大小自动调节JFrame的最佳大小
		jFrame.pack();
		jFrame.setVisible(true);
		//设置点击关闭进行的操作
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//具体的原型类
class SunWuKong extends JPanel implements Cloneable{
	private static final long serialVersionUID = -4299862230959781874L;
	
	public SunWuKong () {
		JLabel jLabel = new JLabel(new ImageIcon("src/WuKong.jpg"));
		this.add(jLabel);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("原型复制成功！");
		return (SunWuKong)super.clone();
	}
}
