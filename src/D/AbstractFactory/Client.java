package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����5:10:34 
* ��˵�� 
*/
public class Client {

	public static void main(String[] args) {
		DianChiClothesFactory dianChiClothesFactory = new DianChiClothesFactory();
		Shop shop = new Shop();
		shop.giveSuit(80, 60, 180, "���������","���������",dianChiClothesFactory);
		YangLinClothesFactory yangLinClothesFactory = new YangLinClothesFactory();
		shop.giveSuit(99, 75, 179, "������ţ�мп�", "������ţ�п�", yangLinClothesFactory);
	}

}
