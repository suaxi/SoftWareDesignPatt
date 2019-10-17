package E.Builder;

/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月12日 下午3:13:48 
* 建造者模式-抽象生成器
*/
public interface Builder {
	//创建按钮
	public abstract void bulidButton();
	//创建标签
	public abstract void buildLabel();
	//创建文本框
	public abstract void buildTextField();
	//返回产品
	public abstract PanelProduct getResult();
}
