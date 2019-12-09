package com.sw.mediator;

public class HotelManager {
    public static void main(String[] args) {
        ConcreateMediator cm=new ConcreateMediator();
        cm.notice("boss");
        cm.notice("client");
    }
}

//中介者
interface Mediator{
    public void notice(String content);
}

//具体中介者
class ConcreateMediator implements Mediator{
    CollagueA a;
    CollagueB b;

    public ConcreateMediator() {
        a=new CollagueA();
        b=new CollagueB();
    }

    @Override
    public void notice(String content) {
        if("boss".equals(content)){
            a.action();
        }
        if("client".equals(content)){
            b.action();
        }
    }
}

//同事接口
interface Colleague{
    public void action();
}

//同事A：普通员工
class CollagueA implements Colleague {

    @Override
    public void action() {
        System.out.println("老板来了，普通员工努力工作！");
    }
}

//同事B：普通员工
class CollagueB implements Colleague {

    @Override
    public void action() {
        System.out.println("客户来了，前台接待！");
    }
}