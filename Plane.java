package Animals;

public class Plane implements Flyable, Vehicle {
    private int velocity;

    @Override
    public void fly() {
        System.out.println("Plane flying using jet machine");
    }

    @Override
    public void move() {
        System.out.println("velocity = " + velocity);
    }

    @Override
    public void brake() {
        if (velocity>0) velocity--;
        System.out.println("velocity="+velocity);
    }

}
