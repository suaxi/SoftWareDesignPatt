package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午5:10:34 
* 类说明 
*/
public class Client {

	public static void main(String[] args) {
		DianChiClothesFactory dianChiClothesFactory = new DianChiClothesFactory();
		Shop shop = new Shop();
		shop.giveSuit(80, 60, 180, "滇池牌西服","滇池牌西裤",dianChiClothesFactory);
		YangLinClothesFactory yangLinClothesFactory = new YangLinClothesFactory();
		shop.giveSuit(99, 75, 179, "杨林牌牛仔夹克", "杨林牌牛仔裤", yangLinClothesFactory);
	}

}
