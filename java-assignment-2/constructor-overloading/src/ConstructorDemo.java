
public class ConstructorDemo {

    public ConstructorDemo(String str)
    {
        System.out.println("This is first constructor and given string is " + str);
    }

    public ConstructorDemo(String str,int i)
    {   this(str);
        System.out.println("This is second construct and given integer value is "+ i);
    }
}
