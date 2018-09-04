
public class SList<E> {

    private Link<E> start = new Link<E>(null,null);

    SListIterator<E> iterator()
    {
        return new SListIterator<E>(start);
    }

    public String toString()
    {
        if(start.next == null)
            return "SList = []";

        System.out.print("SList =  [");
        SListIterator<E> it = this.iterator();
        StringBuffer s = new StringBuffer();
        while(it.hasNext())
        {
            s.append(it.next().data);
            if(it.hasNext())
            s.append(", ");
        }
        return s + "]";

    }
}
