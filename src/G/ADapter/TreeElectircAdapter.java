package G.ADapter;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��10��14�� ����3:37:58 
* ��˵�� 
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
