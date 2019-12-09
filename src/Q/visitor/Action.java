package Q.com.sw.visitor;

public interface Action {
    //获取男人的打分
    public void getManResult(Man man);
    //获取女人的打分
    public void getWomanResult(Woman woman);
}
