package O.com.sw.command;
//命令者模式
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        IncreateCommand increateCommand = new IncreateCommand(receiver);
        Invoker invoker = new Invoker(increateCommand);
        invoker.excute();
    }
}

//命令接口
interface Command{
    public void  excute();
}

//具体命令
class IncreateCommand implements Command{
    protected Receiver rec;

    public IncreateCommand(Receiver rec) {
        this.rec = rec;
    }

    @Override
    public void excute() {
    rec.request();
    }
}

//接受者
class Receiver{
    public void request(){
        System.out.println("接受者执行操作！");
    }
}

//请求者
class Invoker{
    protected Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void excute(){
        command.excute();
    }
}