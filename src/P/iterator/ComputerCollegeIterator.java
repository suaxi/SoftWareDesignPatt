package P.com.sw.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //这里我们需要Department是以怎样的方式存放数组
    Department[] departments;
    //数组的下标
    int index=0;
    //构造方法

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断数组中是否有下一个元素
    @Override
    public boolean hasNext() {
        if (index>=departments.length){//下标最大只能取到数组的长度-1
            return false;
        }else{
            return true;
        }
    }

    //去一个元素，并且下标后移
    @Override
    public Object next() {
        Department department=departments[index];
        index++;//移动数组大的下标
        return department;
    }

    @Override
    public void remove() {

    }
}
