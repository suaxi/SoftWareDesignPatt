package E.Builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����3:22:10 
* ��˵�� 
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
		jButton=new JButton("��ť");
		
	}

	@Override
	public void buildLabel() {
		jLabel = new JLabel("��ǩ");
		
	}

	@Override
	public void buildTextField() {
		jTextField = new JTextField("�ı���");
		
	}

	@Override
	public PanelProduct getResult() {
		panelProduct.add(jButton);
		panelProduct.add(jLabel);
		panelProduct.add(jTextField);
		return panelProduct;
	}

}
