package E.Builder;

/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����3:13:48 
* ������ģʽ-����������
*/
public interface Builder {
	//������ť
	public abstract void bulidButton();
	//������ǩ
	public abstract void buildLabel();
	//�����ı���
	public abstract void buildTextField();
	//���ز�Ʒ
	public abstract PanelProduct getResult();
}
