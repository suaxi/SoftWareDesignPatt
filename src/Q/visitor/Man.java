package Q.com.sw.visitor;

public class Man implements Person{
    private String name;

    public String getName() {
        return name;
    }

    public Man(String name) {
        this.name = name;
    }

    //男人给歌手打分
    @Override
    public void accept(Action action) {
    action.getManResult(this);
    }
}
