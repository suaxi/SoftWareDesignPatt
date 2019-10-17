package E.Builder;

import javax.swing.JFrame;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����3:40:43 
* ��˵�� 
*/
public class Appliacation {

	public static void main(String[] args) {
		BuilderOne builderOne = new BuilderOne();
		Directer directer = new Directer(builderOne);
		PanelProduct builderProduct = directer.BuilderProduct();
		JFrame jFrame1 = new JFrame();
		jFrame1.add(builderProduct);
		//����jFrame��λ��
		jFrame1.pack();
		jFrame1.setBounds(20,20,200,120);
		jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame1.setVisible(true);
		
		BuilderTwo builderTwo = new BuilderTwo();
		Directer directer2 = new Directer(builderTwo);
		JFrame jFrame2 = new JFrame();
		PanelProduct builderProduct2 = directer2.BuilderProduct();
		jFrame2.add(builderProduct2);
		//����jFrame��λ��
		jFrame2.pack();
		jFrame2.setBounds(220,20,200,120);
		jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame2.setVisible(true);
	}
}