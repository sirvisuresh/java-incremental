
public class RodentDemo {

        public static void main(String[] args)
        {
            Rodent rodent[] = new Rodent[3];
            rodent[0] = new Mouse();
            rodent[1] = new Gerbil();
            rodent[2] = new Hamster();
            System.out.println();

            rodent[0].eat();
            rodent[0].run();
            rodent[0].jump();
            System.out.println();

            rodent[1].eat();
            rodent[1].run();
            rodent[1].jump();
            System.out.println();

            rodent[2].eat();
            rodent[2].run();
            rodent[2].jump();
        }
}
