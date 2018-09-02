import java.util.Scanner;

public class Main {

          public static void main(String[] args)
          {
              Scanner sc = new Scanner(System.in);

              while (true)
              {
                  System.out.println("Enter an String or 0 to abort");
                  String str = sc.nextLine();
                  if(str.equals("0"))
                      break;
                  System.out.println(Regex.test(str));
              }

          }
}
