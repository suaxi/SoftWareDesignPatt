package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����4:41:37 
* ��˵�� 
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
