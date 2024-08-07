package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(list.size(), 30);

//        list.forEach(item -> System.out.println(item));

        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++) {
            al.add((int)(Math.random()*100));
        }
        list.addAll(al);
        list.forEach(item -> System.out.println(item));

//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        LinkedList li = new LinkedList();
        for (int i = 0; i < 10; i++) {
            li.add((int)(Math.random()*100));
        }
        li.forEach(item -> System.out.println(item));

        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.add((int)(Math.random()*100));
        }

    }
}
