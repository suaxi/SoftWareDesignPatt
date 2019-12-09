package O.com.sw.command;

public class Client {
    public static void main(String[] args) {
        InvokerController invokerController = new InvokerController(new LightOnCommand(new LightRecever()));
        invokerController.excute();
        InvokerController invokerController1 = new InvokerController(new LightOffCommand(new LightRecever()));
        invokerController1.excute();

        InvokerController invokerController2 = new InvokerController(new TVOnCommand(new TVRecever()));
        invokerController2.excute();
    }
}
