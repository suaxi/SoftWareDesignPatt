package R.com.sw.state;

public class DispenseState implements State{
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("发放奖品中，不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("恭喜中奖，奖品已发放！");
        //颁奖后将奖品数量减一
        activity.setCount(activity.getCount()-1);
        //改变状态为不可抽奖
        if(activity.getCount()>0){
            activity.setState(new NoPaffleState(activity));
        }else {
            System.out.println("奖品发放完毕，抽奖结束！");
            System.exit(0);
        }
    }
}
