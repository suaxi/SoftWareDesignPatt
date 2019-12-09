package Q.com.sw.visitor;

public class Success implements Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("名字为："+man.getName()+"的男人让歌手晋级！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("名字为："+woman.getName()+"的女人让歌手晋级！");
    }
}
