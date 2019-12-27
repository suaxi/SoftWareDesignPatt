package B.ProtoType;

public class ProtoTypeCitation {

	public static void main(String[] args) throws CloneNotSupportedException {
		Citation stu1 = new Citation("二狗", "同学：在2019学年第一学期中表现优秀，被评为三好学生。", "滇池学院");		
		stu1.display();
		Citation stu2 = (Citation)stu1.clone();
		stu2.setName("老王");
		stu2.display();
	}

}

class Citation implements Cloneable{
	private String name;
	private String info;
	private String college;
	
	public Citation(String name, String info, String college) {
		super();
		this.name = name;
		this.info = info;
		this.college = college;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Citation)super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(name+info+college);
	}
	
	
}