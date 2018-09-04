
public class Mouse extends Rodent {

    public Mouse() { System.out.println("This is mouse");
    }

    @Override
    public void eat() {
         System.out.println("Mouse is eating");
    }

    @Override
    public void jump() {
        System.out.println("Mouse is jumping");
    }

    @Override
    public void run() {
        System.out.println("Mouse is running");
    }
}
