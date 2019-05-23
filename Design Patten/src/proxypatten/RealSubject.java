package proxypatten;

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一支Mac");
    }
}
