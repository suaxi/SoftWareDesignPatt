package D.AbstractFactory;
/** 
* @author ����: Suaxi
* @version ����ʱ�䣺2019��9��30�� ����4:24:48 
* ��˵�� 
*/
public interface AbstractFactory {
public abstract UpperClothes createUpperClothes(int chestSize,int height,String name);
public abstract Trousers createTrousers(int waistSize,int height,String name);
}
