package T.com.sw.Strategy;

public class GoodFly implements FlyAction {
    @Override
    public void fly() {
        System.out.println("飞得很好！");
    }
}
