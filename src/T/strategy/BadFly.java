package T.com.sw.Strategy;

public class BadFly implements FlyAction{
    @Override
    public void fly() {
        System.out.println("飞得不好！");
    }
}
