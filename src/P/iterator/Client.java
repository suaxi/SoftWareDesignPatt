package P.com.sw.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //用一个集合保存学院
        List<College> collegeList=new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InforCollege());
        //遍历学院
        Iterator<College> iterator=collegeList.iterator();
        while (iterator.hasNext()){
            College college=iterator.next();
            Iterator iterator1=college.createIterator();
            System.out.println("++++++++"+college.getName()+"++++++++");
            getDepartment(iterator1);
    }
}

//遍历学院的专业
public static void getDepartment(Iterator ite){
    while (ite.hasNext()){
        Department department=(Department)ite.next();
        System.out.println(department.getName());
    }
}
}