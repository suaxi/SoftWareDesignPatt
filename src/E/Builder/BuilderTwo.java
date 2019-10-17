package E.Builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午3:22:10 
* 类说明 
*/
public class BuilderTwo implements Builder{
	PanelProduct panelProduct;
	JButton jButton;
	JLabel jLabel;
	JTextField jTextField;
	public BuilderTwo(){
		panelProduct = new PanelProduct();
	}
	
	@Override
	public void bulidButton() {
		jButton=new JButton("Button");
		
	}

	@Override
	public void buildLabel() {
		jLabel = new JLabel("Label");
		
	}

	@Override
	public void buildTextField() {
		jTextField = new JTextField("TextField");
		
	}

	@Override
	public PanelProduct getResult() {
		//和BuildOne的添加顺序不一样
		panelProduct.add(jTextField);
		panelProduct.add(jButton);
		panelProduct.add(jLabel);
		return panelProduct;
	}

}
