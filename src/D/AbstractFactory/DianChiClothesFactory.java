package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����4:53:25 
* ��˵�� 
*/
public class DianChiClothesFactory implements AbstractFactory {

	@Override
	public UpperClothes createUpperClothes(int chestSize, int height, String name) {
		return new WestrUpperClothes(chestSize, height, name);
	}

	@Override
	public Trousers createTrousers(int waistSize, int height, String name) {
		return new WestTrousers(waistSize, height, name);
	}

}
