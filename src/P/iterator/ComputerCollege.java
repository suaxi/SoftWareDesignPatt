package P.com.sw.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    //保存专业的数组
    Department[] departments;
    int index=0;

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment(new Department("Java专业","Java"));
        addDepartment(new Department("Python专业","Python"));
        addDepartment(new Department("大数据专业","大数据"));
        addDepartment(new Department("Php专业","Php"));
        addDepartment(new Department("Python专业","Python"));
    }
    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

    @Override
    public void addDepartment(Department department) {
    departments[index]=department;
    index++;
    }
}
