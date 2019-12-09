package Q.com.sw.visitor;

public class Fail implements Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("名字为："+man.getName()+"的男人让歌手淘汰！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("名字为："+woman.getName()+"的女人让歌手淘汰！");
    }
}
