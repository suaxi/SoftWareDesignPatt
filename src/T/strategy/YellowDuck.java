package T.com.sw.Strategy;

public class YellowDuck extends Duck {
    public YellowDuck(String name) {
        super(name);
        setFlyAction(new BadFly());
    }

//    @Override
//    public void fly() {
//        System.out.println(getName()+"不会飞翔！");
//    }
}
