package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����4:44:38 
* ��˵�� 
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
