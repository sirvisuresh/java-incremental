public class OuterClass {

    public void outerMethod()
    {
        System.out.println("This is outerclass method");
    }

    class InnerClass
    {
        private String str;

        public  InnerClass(String str)
        {
            this.str = str;
            System.out.println("Constructor argument value for InnerClass is " + str);
        }

        public void innerMethod()
        {
            System.out.println("This is innerclass method");
        }
    }
}
