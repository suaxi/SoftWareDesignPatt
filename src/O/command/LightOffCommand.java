package O.com.sw.command;

public class LightOffCommand implements LightCommand{
    protected LightRecever rec;

    public LightOffCommand(LightRecever rec) {
        this.rec = rec;
    }

    @Override
    public void excute() {
    rec.lightOff();
    }
}
