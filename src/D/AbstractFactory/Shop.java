package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午5:02:04 
* 类说明 
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
		System.out.println("套装信息：");
		System.out.println(upperClothes.getName());
		System.out.println("胸围："+upperClothes.getChestSize());
		System.out.println("身高："+upperClothes.getHeight());
		System.out.println(trousers.getName());
		System.out.println("腰围："+trousers.getWaisetSize());
		System.out.println("身高："+trousers.getHeight());
	}
}
