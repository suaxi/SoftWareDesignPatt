package P.com.sw.iterator;

import java.util.Iterator;
import java.util.List;

public class InforCollegeIterator implements Iterator {
    //使用集合保存信息工程学院的专业
    List<Department> departmentList;
    //集合的下标
    int index=0;

    public InforCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        return index<departmentList.size();
    }

    @Override
    public Object next() {
        Department department=departmentList.get(index);
        index++;
        return department;
    }

    @Override
    public void remove() {

    }
}
