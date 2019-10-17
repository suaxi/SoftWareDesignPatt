package D.AbstractFactory;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年9月30日 下午4:24:48 
* 类说明 
*/
public interface AbstractFactory {
public abstract UpperClothes createUpperClothes(int chestSize,int height,String name);
public abstract Trousers createTrousers(int waistSize,int height,String name);
}
