package E.Builder;

import javax.swing.JFrame;

/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午3:40:43 
* 类说明 
*/
public class Appliacation {

	public static void main(String[] args) {
		BuilderOne builderOne = new BuilderOne();
		Directer directer = new Directer(builderOne);
		PanelProduct builderProduct = directer.BuilderProduct();
		JFrame jFrame1 = new JFrame();
		jFrame1.add(builderProduct);
		//设置jFrame的位置
		jFrame1.pack();
		jFrame1.setBounds(20,20,200,120);
		jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame1.setVisible(true);
		
		BuilderTwo builderTwo = new BuilderTwo();
		Directer directer2 = new Directer(builderTwo);
		JFrame jFrame2 = new JFrame();
		PanelProduct builderProduct2 = directer2.BuilderProduct();
		jFrame2.add(builderProduct2);
		//设置jFrame的位置
		jFrame2.pack();
		jFrame2.setBounds(220,20,200,120);
		jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame2.setVisible(true);
	}
}