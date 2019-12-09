package T.com.sw.Strategy;

public class NoFly implements FlyAction{
    @Override
    public void fly() {
        System.out.println("不会飞！");
    }
}
