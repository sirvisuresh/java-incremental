public class CycleDemo {

       public static void main(String[] args)
       {
           Unicycle unicycle = new Unicycle();
           Bicycle bicycle = new Bicycle();
           Tricycle tricycle = new Tricycle();

           Cycle[] cycles = new Cycle[3];

           cycles[0] = (Cycle) unicycle;
           cycles[1] = (Cycle) bicycle;
           cycles[2] = (Cycle) tricycle;

           System.out.println();
           cycles[0].balance();
           cycles[1].balance();
           cycles[2].balance();

           unicycle = (Unicycle) cycles[0];
           bicycle = (Bicycle) cycles[1];
           tricycle = (Tricycle) cycles[2];

           System.out.println();
           unicycle.balance();
           bicycle.balance();
           tricycle.balance();

       }
}
