public class HandlingClass {

    public void throwException(int n) throws Exception3, Exception2, Exception1 {
        if(n==0)
        throw new Exception1();
        else if(n>0)
        throw new Exception2();
        else
        throw new Exception3();
    }

}
