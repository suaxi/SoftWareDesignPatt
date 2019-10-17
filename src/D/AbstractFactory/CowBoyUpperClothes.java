package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午4:44:38 
* 类说明 
*/
public class CowBoyUpperClothes implements UpperClothes {
	private int chestSize;
	private int height;
	private String name;
	
	
	public CowBoyUpperClothes(int chestSize, int height, String name) {
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
