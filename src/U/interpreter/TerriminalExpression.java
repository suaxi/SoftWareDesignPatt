package U.com.sw.interpreter;

import java.util.HashSet;

public class TerriminalExpression implements Expression{
    private HashSet<String> set=new HashSet<>();

    //判断传入的字符串是否是set中nei内置的免费终结表达式
 @Override
    public boolean interpret(String info) {
     if(set.contains(info)){
         return true;
     }
        return false;
    }

    public TerriminalExpression(String[] data){
        //将数组中的元素遍历后存进set中
        for (int i=0;i<data.length;i++){
            set.add(data[i]);
        }
    }
}
