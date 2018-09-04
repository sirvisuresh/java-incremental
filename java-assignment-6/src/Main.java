public class Main {

      public static void main(String[] args)
      {
            SList<String> list = new SList<String>();
            SListIterator<String> itr = list.iterator();

            itr.insert("Suresh");
            itr.insert("Saransh");
            itr.insert("Ravi");
            itr.insert("Sunil");
            itr.insert("Vinamra");

            System.out.println(list);
            System.out.println();

            SListIterator<String> it = list.iterator();

            it.remove();
            it.remove();
            it.remove();

            System.out.println(list);
            System.out.println();

      }

}
