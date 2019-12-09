package U.com.sw.interpreter;

public class Contex {
    private String[] citys={"昆明","安宁"};
    private String[] person={"老人","妇女","小孩"};
    private Expression cityPerson;

    //通过构造方法对终结符表达式进行初始化

    public  Contex(){
        TerriminalExpression city=new TerriminalExpression(citys);
        TerriminalExpression person1=new TerriminalExpression(person);
        //对非终结符表达式做初始化
        cityPerson=new AndExpression(city,person1);
        //根据传入信息判断是否免费
    }
    public void freeRide(String info){
        boolean interpret=cityPerson.interpret(info);
        if(interpret){
            System.out.println("老人和小孩免费乘坐公交车！");
        }else{
            System.out.println("请支付两元车费！");
        }
    }
}
