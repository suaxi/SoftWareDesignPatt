package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午4:57:13 
* 类说明 
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
