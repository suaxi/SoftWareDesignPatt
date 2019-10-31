package J.Facade;
/** 
* @author 作者: Suaxi
* @version 创建时间：2019年10月28日 下午5:23:35 
* 外观模式 
*/
public class FacadeTest {

	public static void main(String[] args) {
		String str="今年过节不收礼，收礼只收脑白金！";
		Facade facade = new Facade(str);
		facade.Method();
	}

}

//子系统1：计算统计字数
class CheackWord{
	//起步字数
	public static final int basicAmount=85;
	//输入的字符串
	String str;
	//字符串的字数
	int amount;
	public CheackWord(String str) {
		super();
		this.str = str;
	}
	//计算字数
	public void setChargeAmount(){
		amount=basicAmount+str.length();
		System.out.println("广告字数为："+amount);
	}
	
	//获取最后的字符数
	public int getAmount() {
		return amount;
	}
	
}

//子系统2：计算广告费用
class Charge{
	//单价
	public static final int price=12;
	CheackWord cw;
	public Charge(CheackWord cw) {
		super();
		this.cw = cw;
	}
	
	//计算价格
	public void giveCharge(){
		int charge=cw.getAmount() *price;
		System.out.println("广告费用为："+charge+"元");
	}
}

//子系统3：排版
class Type{
	//广告词
	String str;

	public Type(String str) {
		super();
		this.str = str;
	}
	
//排版
public void typeSetting(){
	System.out.println("广告排版格式：");
	System.out.println("===========");
	System.out.println(str);
	System.out.println("===========");
	}
}

//外观
class Facade{
	private CheackWord cw;
	private Charge ch;
	private Type type;
	String str;
	public Facade(String str) {
		super();
		this.str = str;
		cw = new CheackWord(str);
		ch = new Charge(cw);
		type = new Type(str);
	}
	
	public void  Method(){
		//计算字数
		cw.setChargeAmount();
		//计算费用
		ch.giveCharge();
		//排版
		type.typeSetting();
	}
}