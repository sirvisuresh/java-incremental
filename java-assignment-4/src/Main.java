import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        HandlingClass handle = new HandlingClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to throw null pointer exeption also then type 1 else type something else");
        int a = sc.nextInt();
        try {
            if(a==1)
                throw new NullPointerException();
            handle.throwException(a);
        }
        catch(Exception1|Exception2|Exception3 e)
        {
            System.out.println(e);
        }
        finally
        {
           System.out.println("finally block get executed");
        }
    }
}
