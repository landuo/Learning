package factory.method;

public class Horse implements Animal {
    public Horse() {

    }

    @Override
    public void bray() {
        System.out.println("马叫");
    }
}
