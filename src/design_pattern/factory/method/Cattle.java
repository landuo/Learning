package design_pattern.factory.method;

public class Cattle implements Animal {
    public Cattle() {

    }

    @Override
    public void bray() {
        System.out.println("牛叫");
    }
}
