
public class Main {

    public static void rideCycle(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.info();
    }
    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
