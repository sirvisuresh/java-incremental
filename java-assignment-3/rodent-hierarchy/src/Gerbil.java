
public class Gerbil extends Rodent {

    public Gerbil() { System.out.println("This is gerbil");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    public void jump() {
        System.out.println("Gerbil is jumping");
    }

    @Override
    public void run() {
        System.out.println("Gerbil is running");
    }

}

