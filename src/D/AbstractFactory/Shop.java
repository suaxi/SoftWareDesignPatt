package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����5:02:04 
* ��˵�� 
*/
public class Shop {
	UpperClothes upperClothes;
	Trousers trousers;
	public void giveSuit(int chestSize,int waistSize,int height,String name1,String name2,
			AbstractFactory factory){
		upperClothes = factory.createUpperClothes(chestSize, height, name1);
		trousers = factory.createTrousers(waistSize, height, name2);
		showMes();
	}
	
	private void showMes(){
		System.out.println("��װ��Ϣ��");
		System.out.println(upperClothes.getName());
		System.out.println("��Χ��"+upperClothes.getChestSize());
		System.out.println("��ߣ�"+upperClothes.getHeight());
		System.out.println(trousers.getName());
		System.out.println("��Χ��"+trousers.getWaisetSize());
		System.out.println("��ߣ�"+trousers.getHeight());
	}
}
