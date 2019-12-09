package P.com.sw.iterator;

import java.util.Iterator;

public interface College {
    //获取学院的名字
    public String getName();
    //返回该学院对的迭代器
    public Iterator createIterator();
    //怎加专业的方法
    public void addDepartment(Department department);
}
