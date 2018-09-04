public class MainClass {

     public static void main(String[] args)
     {
          AnotherOuterClass.AnotherInnerClass anotherInnerClass = new AnotherOuterClass().new AnotherInnerClass("Suresh");

          System.out.println();
          anotherInnerClass.innerMethod();
     }
}
