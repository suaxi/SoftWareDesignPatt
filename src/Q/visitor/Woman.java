package Q.com.sw.visitor;

public class Woman implements Person{
    private String name;

    public String getName() {
        return name;
    }

    public Woman(String name) {
        this.name = name;
    }

    //女人给歌手打分
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
