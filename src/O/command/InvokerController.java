package O.com.sw.command;

public class InvokerController {
    protected LightCommand command;

    public InvokerController(LightCommand command) {
        this.command = command;
    }


    public void excute(){
        command.excute();
    }

}
