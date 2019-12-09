package R.com.sw.state;

import java.sql.SQLOutput;

//不能抽奖的状态
public class NoPaffleState implements State{
    RaffleActivity activity;

    public NoPaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分，可以开始抽奖！");
        //改变状态为可以抽奖
        activity.setState(new CanRaffleState(activity));
    }

    @Override
    public boolean raffle() {
        System.out.println("没扣积分，不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("没扣积分，不能抽奖！");
    }
}
