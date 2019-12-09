package R.com.sw.state;

public class RaffleActivity {
    //保存状态
    State state=null;
    //奖品数量
    int count=0;
    NoPaffleState noPaffleState=new NoPaffleState(this);
    CanRaffleState canRaffleState=new CanRaffleState(this);
    DispenseState dispenseState=new DispenseState(this);
    DispenseOutState dispenseOutState=new DispenseOutState(this);
    //创建对象的时候指定奖品数量
    public RaffleActivity(int count){
        //所有参与活动的人初始状态都不能为抽奖状态
        this.state=noPaffleState;
        this.count=count;
    }

    //扣积分
    public void deduceMoney(){
        state.deduceMoney();
    }

    //抽奖
    public void raffle() {
        if (state.raffle()) {//如果抽中了，则颁奖
            state.dispensePrize();
        }
    }

    public State getState(){
        return state;
    }

    //每领奖一次，则奖品数量减一
    public int getCount(){
        int curCount=count;
        return curCount;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public NoPaffleState getNoPaffleState() {
        return noPaffleState;
    }

    public void setNoPaffleState(NoPaffleState noPaffleState) {
        this.noPaffleState = noPaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(CanRaffleState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(DispenseOutState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
