package S.com.sw.memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //将该对象的状态备份到另一个对象中
    public Memento createMemento(){
        return new Memento(state);
    }

    //通过备份角色，恢复到原来状态的方法
    public void recoverState(Memento memento){
        state=memento.getState();
    }
}
