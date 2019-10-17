package B.ProtoType;

/**
 * @author 作者: Suaxi
 * @version 创建时间：2019年9月23日 下午4:50:28 类说明
 */
public class ProtoTypeShape {
	public static void main(String[] args) {

	}
}

interface shape extends Cloneable {
	public Object clone();// 克隆
	public void countArea();// 计算面积
}