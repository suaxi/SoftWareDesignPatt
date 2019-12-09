package S.com.sw.memento;

import java.util.ArrayList;

public class CareTaker {
    //使用集合管理多个备份对象
    private ArrayList<Memento> mementos=new ArrayList<>();

    //往集合中添加角色的状态
    public void add(Memento memento){
        mementos.add(memento);
    }

    //从集合中拿出备份对象
    public Memento getMemento(int index){
        return mementos.get(index);
    }
}
