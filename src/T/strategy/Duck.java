package T.com.sw.Strategy;

public class Duck {
    private String name;
    private FlyAction flyAction;
    public String getName() {
        return name;
    }

    public FlyAction getFlyAction() {
        return flyAction;
    }

    public void setFlyAction(FlyAction flyAction) {
        this.flyAction = flyAction;
    }

    public Duck(FlyAction flyAction) {
        this.flyAction = flyAction;
    }

    public Duck(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println(name+"嘎嘎叫！");
    }
    public void fly(){
        if (flyAction!=null){
            flyAction.fly();
        }
    }
    public void swim(){
        System.out.println(name+"会游泳！");
    }
}
