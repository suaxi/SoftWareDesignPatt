package T.com.sw.Strategy;

public class WildDuck extends Duck{
    public WildDuck(String name) {
        super(name);
        setFlyAction(new GoodFly());
    }

//    @Override
//    public void fly() {
//        System.out.println(getName()+"飞得很好！");
//    }
}
