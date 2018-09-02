package suresh.assignment.main;

import suresh.assignment.data.Data;
import suresh.assignment.singleton.Singleton;

public class Main {

    public static void main(String[] args)
    {
         Data data = new Data();
         data.printMembers();
        // data.localMethod();

         /* Getting error because staticMethod which is static referencing an non-static variable
         Singleton singleton;
         singleton = Singleton.staticMethod("suresh");
         singleton.printString();
         */
    }

}
