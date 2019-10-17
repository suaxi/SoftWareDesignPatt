package E.Builder;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午3:34:45 
* 类说明 
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
