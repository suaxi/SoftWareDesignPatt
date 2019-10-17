package A.SingleLeton;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��17�� ����10:43:14 
* ��˵�� 
*/
public class SingletonEager {

	public static void main(String[] args) {
		JFrame jf = new JFrame("��������ģʽ����");
		jf.setLayout(new GridLayout(1,2));
		Container contentPane = jf.getContentPane();
		Bajie obj1 = Bajie.getInstance();
		contentPane.add(obj1);
		Bajie obj2 = Bajie.getInstance();
		contentPane.add(obj2);
		if(obj1==obj2){
			System.out.println("������ͬһ�ˣ�");
		}else{
			System.out.println("���ǲ���ͬһ�ˣ�");
		}
		jf.pack();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Bajie extends JPanel{
	private static Bajie instance=new Bajie();
	private Bajie(){
		JLabel ll = new JLabel(new ImageIcon("src/Bajie.jpg"));
		this.add(ll);
	}
	
	public static Bajie getInstance(){
		return instance;
	}
}