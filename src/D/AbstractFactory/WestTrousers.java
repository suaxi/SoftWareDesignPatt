package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����4:45:48 
* ��˵�� 
*/
public class WestTrousers implements Trousers {
	private int waistSize;
	private int height;
	private String name;
	
	public WestTrousers(int waistSize, int height, String name) {
		super();
		this.waistSize = waistSize;
		this.height = height;
		this.name = name;
	}

	@Override
	public int getWaisetSize() {
		return waistSize;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String getName() {
		return name;
	}

}
