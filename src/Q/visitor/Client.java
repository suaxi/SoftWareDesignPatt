package Q.com.sw.visitor;

public class Client {
    public static void main(String[] args) {
        //打分为晋级
        Success success = new Success();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man("郭敬明"));
        objectStructure.add(new Woman("赵薇"));
        objectStructure.display(success);
    }
}
