package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午4:45:48 
* 类说明 
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
