package T.com.sw.Strategy;

public class PekiDuck extends Duck{
    public PekiDuck(String name) {
        super(name);
        setFlyAction(new NoFly());
    }
}
