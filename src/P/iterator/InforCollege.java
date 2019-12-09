package P.com.sw.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InforCollege implements College{
    //保存专业的集合
    List<Department> departmentList;

    public InforCollege(){
        departmentList=new ArrayList<>();
        addDepartment(new Department("信息安全专业","信息安全"));
        addDepartment(new Department("物联网专业","物联网"));
    }
    @Override
    public String getName() {
        return "信息工程学院";
    }

    //返回迭代器
    @Override
    public Iterator createIterator() {
        return new InforCollegeIterator(departmentList);
    }

    @Override
    public void addDepartment(Department department) {
        departmentList.add(department);
    }
}
