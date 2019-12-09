package O.com.sw.command;

public class LightOnCommand implements LightCommand{
    protected LightRecever rec;

    public LightOnCommand(LightRecever rec) {
        this.rec = rec;
    }

    @Override
    public void excute() {
    rec.lightOn();
    }
}
