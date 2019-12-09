package R.com.sw.state;

//状态的接口
public interface State {
    //扣积分
    public void deduceMoney();
    //抽奖
    public boolean raffle();
    //颁奖
    public void  dispensePrize();
}
