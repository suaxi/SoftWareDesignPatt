package R.com.sw.state;

public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(2);
        for (int i=0;i<30;i++){
            System.out.println("===开始第"+(i+1)+"次抽奖===");
            activity.deduceMoney();
            activity.raffle();
        }
    }
}
