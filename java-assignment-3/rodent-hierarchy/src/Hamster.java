
public class Hamster extends Rodent {

    public Hamster() { System.out.println("This is Hamster");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    public void jump() {
        System.out.println("Hamster is jumping");
    }

    @Override
    public void run() {
        System.out.println("Hamster is running");
    }

}
