package E.Builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午3:22:10 
* 类说明 
*/
public class BuilderOne implements Builder{
	PanelProduct panelProduct;
	JButton jButton;
	JLabel jLabel;
	JTextField jTextField;
	public BuilderOne(){
		panelProduct = new PanelProduct();
	}
	
	@Override
	public void bulidButton() {
		jButton=new JButton("按钮");
		
	}

	@Override
	public void buildLabel() {
		jLabel = new JLabel("标签");
		
	}

	@Override
	public void buildTextField() {
		jTextField = new JTextField("文本框");
		
	}

	@Override
	public PanelProduct getResult() {
		panelProduct.add(jButton);
		panelProduct.add(jLabel);
		panelProduct.add(jTextField);
		return panelProduct;
	}

}
