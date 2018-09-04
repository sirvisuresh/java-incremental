public class AnotherOuterClass {

    public void anotherOuterMethod()
    {
        System.out.println("This is AnotherOuterClass method");
    }

    class AnotherInnerClass extends OuterClass.InnerClass
    {

        public AnotherInnerClass(String str) {
            new OuterClass().super(str);
        }

        @Override
        public void innerMethod() {
            super.innerMethod();
            System.out.println("Here innerMethod is overriden by new innerclass");
        }
    }
}
