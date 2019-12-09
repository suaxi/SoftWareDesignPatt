package U.com.sw.interpreter;

//非终结符表达式
public class AndExpression implements Expression{
    private Expression city=null;
    private Expression person=null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s=info.split("的");
        //将传入的字符串构成city和person，
        //通过终结符表达式中的解释器子方法判断是否免费
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
