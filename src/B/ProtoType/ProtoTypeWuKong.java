package B.ProtoType;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


 //���ʲ�����
public class ProtoTypeWuKong{
	public static void main(String[] args) throws CloneNotSupportedException {
		JFrame jFrame = new JFrame("ԭ��ģʽ����");
		jFrame.setLayout(new GridLayout(1,2));
		//��ʼ��һ������
		Container contentPane = jFrame.getContentPane();		
		SunWuKong obj1 = new SunWuKong();
		//����������ӿؼ�
		contentPane.add(obj1);
		SunWuKong obj2 = (SunWuKong)obj1.clone();
		contentPane.add(obj2);
//		�������ݵĴ�С�Զ�����JFrame����Ѵ�С
		jFrame.pack();
		jFrame.setVisible(true);
		//���õ���رս��еĲ���
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//�����ԭ����
class SunWuKong extends JPanel implements Cloneable{
	private static final long serialVersionUID = -4299862230959781874L;
	
	public SunWuKong () {
		JLabel jLabel = new JLabel(new ImageIcon("src/WuKong.jpg"));
		this.add(jLabel);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("ԭ�͸��Ƴɹ���");
		return (SunWuKong)super.clone();
	}
}
