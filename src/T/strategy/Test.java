package T.com.sw.Strategy;

public class Test {
    public static void main(String[] args) {
        WildDuck wildDuck=new WildDuck("野鸭");
        System.out.println("==="+wildDuck.getName()+"的飞翔策略：===");
        wildDuck.fly();
        YellowDuck yellowDuck = new YellowDuck("小黄鸭");
        System.out.println("==="+yellowDuck.getName()+"的飞翔策略：===");
        yellowDuck.fly();
        yellowDuck.setFlyAction(new GoodFly());
        yellowDuck.fly();
    }
}
