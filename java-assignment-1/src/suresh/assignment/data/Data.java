package suresh.assignment.data;

public class Data {

    int member1;
    char member2;

    public void printMembers()
    {
        System.out.println(member1);
        System.out.println(member2);
    }

    /**
     * local variable a and b in this method will not be initilized automatically
     * by java because java does not initilize local variables by default

    public void localMethod()
    {
        int a;
        char b;
        System.out.println(a);
        System.out.println(b);
    }
    */
}
