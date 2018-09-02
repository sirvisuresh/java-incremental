package suresh.assignment.singleton;

public class Singleton {

       String str;

    /**
     * this method is static method so you cannot reference non-static variable
     * from a static context

    public static Singleton staticMethod(String a)
       {
           str = a;
           return new Singleton();
       }
    */

       public void printString()
       {
           System.out.println(str);
       }
}
