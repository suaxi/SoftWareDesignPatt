package O.com.sw.command;

public class TVOffCommand implements LightCommand{
    protected TVRecever rec;

    public TVOffCommand(TVRecever rec) {
        this.rec = rec;
    }

    @Override
    public void excute() {
    rec.TVOff();
    }
}
