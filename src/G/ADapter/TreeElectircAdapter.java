package G.ADapter;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月14日 下午3:37:58 
* 类说明 
*/
public class TreeElectircAdapter implements ThreeElectircOutlet{
	TwoEOutlet outlet;
	
	public TreeElectircAdapter(TwoEOutlet outlet) {
		super();
		this.outlet = outlet;
	}

	@Override
	public void connectEC() {
		outlet.connectEC();
	}

}
