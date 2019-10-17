package E.Builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����3:22:10 
* ��˵�� 
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
		//��BuildOne�����˳��һ��
		panelProduct.add(jTextField);
		panelProduct.add(jButton);
		panelProduct.add(jLabel);
		return panelProduct;
	}

}
