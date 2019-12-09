package Q.com.sw.visitor;

import java.util.ArrayList;

//对象结构
public class ObjectStructure {
    ArrayList<Person> persons;

    public ObjectStructure() {
        persons=new ArrayList<Person>();
    }
    //添加元素
    public void add(Person p){
        persons.add(p);
    }

    //移除元素
    public void del(Person p){
        persons.remove(p);
    }

    //显示打分情况
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
