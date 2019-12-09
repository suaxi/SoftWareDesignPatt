package R.com.sw.state;

public class DispenseOutState implements State{
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能颁奖！");
    }
}
