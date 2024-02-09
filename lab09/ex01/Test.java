package ex01;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        VectorGeneric<String> names = new VectorGeneric<>();
        names.addElem("Luis");
        names.addElem("Pedro");
        names.addElem("Ricardo");
        names.addElem("Simao");

        Iterator<String> iter = names.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        ListIterator<String> list = names.listiterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }

        while(list.hasPrevious()){
            System.out.println(list.previous());
        }

        ListIterator<String> list2 = names.listiterator(2);
        if (list2.hasNext()){
            System.out.println(list2.nextIndex());
        }
        if (list2.hasPrevious()){
            System.out.println(list2.previousIndex());
        }

    }
}
