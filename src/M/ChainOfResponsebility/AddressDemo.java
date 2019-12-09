package com.sw.chain;
import java.util.ArrayList;

public class AddressDemo {
    public static void main(String[] args) {
       TianJin tianJin=new TianJin();
       ShangHai shangHai=new ShangHai(tianJin);
       BeiJing beiJing=new BeiJing(shangHai);
       beiJing.handlerRequest("111");
       beiJing.handlerRequest("000");
    }
}

//处理者
interface AddHandler{
    //处理请求
    public void handlerRequest(String num);
//    //将请求传给后继者
//    public void setNextHandler(AddHandler hr);
}

//具体处理者1：北京
class BeiJing implements AddHandler{
    private AddHandler hr;
    private ArrayList<String> numberList;

    public BeiJing(AddHandler hr) {
        numberList=new ArrayList<String>();
        numberList.add("111");
        numberList.add("222");
        numberList.add("333");
        this.hr = hr;
    }

    @Override
    public void handlerRequest(String num) {
            if(numberList.contains(num)){//如果北京的号码集合中包含传入的号码
                System.out.println("该人住在北京！");
            }else{//该人不居住在北京，将号码传给后继者
                System.out.println("该人不居住在北京，将号码传给后继者！");
                hr.handlerRequest(num);
            }
    }
}

//具体处理者2：上海
class ShangHai implements AddHandler{
    private AddHandler hr;
    private ArrayList<String> numberList;

    public ShangHai(AddHandler hr) {
        numberList=new ArrayList<String>();
        numberList.add("444");
        numberList.add("555");
        numberList.add("666");
        this.hr = hr;
    }

    @Override
    public void handlerRequest(String num) {

            if(numberList.contains(num)){//如果上海的号码集合中包含传入的号码
                System.out.println("该人住在上海！");
            }else{//该人不居住在上海，将号码传给后继者
                System.out.println("该人不居住在上海，将号码传给后继者！");
                hr.handlerRequest(num);
            }
    }
}

//具体处理者3：天津
class TianJin implements AddHandler{
    private AddHandler hr;
    private ArrayList<String> numberList;

    public TianJin() {
        numberList=new ArrayList<String>();
        numberList.add("777");
        numberList.add("888");
        numberList.add("999");
    }

    @Override
    public void handlerRequest(String num) {

        if(numberList.contains(num)){//如果天津的号码集合中包含传入的号码
            System.out.println("该人住在天津！");
        }else{//该人不居住在天津，将号码传给后继者
            System.out.println("该人不居住在天津，将号码传给后继者！");
        }
    }
}