package R.com.sw.state;

import java.util.Random;

public class CanRaffleState implements State{
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("积分已扣除，不能继续扣积分!");
    }

    @Override
    public boolean raffle() {
        System.out.println("开始抽奖！");
        Random random=new Random();
        int i=random.nextInt(10);
        System.out.println("i为："+i);
        if(i==5){
            System.out.println("恭喜你中奖了！");
            //改变状态为颁奖
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾，没有中奖！");
            //改变状态为不能抽奖
            activity.setState(activity.getCanRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("还未抽奖，不能发放奖品！");
    }
}
