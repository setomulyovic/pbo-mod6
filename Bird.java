package Animals;

public class Bird extends Animal implements Flyable{

    @Override
    public void breath() {
        System.out.println("Burung bernafas menggunakan paru-paru");
    }

    @Override
    public void eat() {
        System.out.println("Burung memakan makanan");
    }

    @Override
    public void fly() {
        System.out.println("Burung terbang menggunakan sayap");
    }

}
