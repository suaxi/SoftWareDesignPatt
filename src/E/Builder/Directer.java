package E.Builder;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��12�� ����3:34:45 
* ��˵�� 
*/
public class Directer {
private Builder builder;

public Directer(Builder builder) {
	super();
	this.builder = builder;
}

public PanelProduct BuilderProduct(){
	builder.bulidButton();
	builder.buildLabel();
	builder.buildTextField();
	PanelProduct product = builder.getResult();
	return product;
}
}
