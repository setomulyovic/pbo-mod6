package Animals;

public class Main {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Animal a = new Bird();
        a.breath();
        a.eat();
        
        Flyable f = (Flyable) a;
        f.fly();
        
        Vehicle v = new Plane();
        v.move();
        
        f = (Flyable) v;
        f.fly();
    }
}
