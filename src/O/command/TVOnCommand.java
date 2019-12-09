package O.com.sw.command;

public class TVOnCommand implements LightCommand{
    protected TVRecever rec;

    public TVOnCommand(TVRecever rec) {
        this.rec = rec;
    }

    @Override
    public void excute() {
    rec.TVOn();
    }
}
