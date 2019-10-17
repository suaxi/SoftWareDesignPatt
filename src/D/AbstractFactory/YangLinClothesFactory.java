package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����4:57:13 
* ��˵�� 
*/
public class YangLinClothesFactory implements AbstractFactory {

	@Override
	public UpperClothes createUpperClothes(int chestSize, int height, String name) {
		return new CowBoyUpperClothes(chestSize, height, name);
	}

	@Override
	public Trousers createTrousers(int waistSize, int height, String name) {
		return new CowBoyTrousers(waistSize, height, name);
	}

}
