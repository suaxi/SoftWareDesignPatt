package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午4:41:37 
* 类说明 
*/
public class WestrUpperClothes implements UpperClothes {
	private int chestSize;
	private int height;
	private String name;
	
	
	public WestrUpperClothes(int chestSize, int height, String name) {
		super();
		this.chestSize = chestSize;
		this.height = height;
		this.name = name;
	}

	@Override
	public int getChestSize() {
		return chestSize;
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
