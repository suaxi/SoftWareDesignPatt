package S.com.sw.memento;

public class Client {
    public static void main(String[] args) {
        //创建对象并备份
        Originator originator=new Originator("血量为100！");
        System.out.println("战斗前的属性为：");
        System.out.println(originator.getState());
        Memento memento=originator.createMemento();
        CareTaker careTaker=new CareTaker();
        careTaker.add(memento);

        System.out.println("战斗后的属性为：");
        originator.setState("血量为50！");
        System.out.println(originator.getState());
        Memento memento1=originator.createMemento();
        careTaker.add(memento1);

        //根据备份恢复对象的状态
        Memento memento2=careTaker.getMemento(0);
        originator.recoverState(memento2);

        System.out.println("恢复后的角色属性为：");
        System.out.println(originator.getState());
    }
}
