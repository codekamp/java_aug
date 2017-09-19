package codekamp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by cerebro on 18/09/17.
 */
public class Demo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();

        names.add("suresh");
        names.add("ramesh");
        names.add("jignesh");

        System.out.println(names);

        names.add(1, "Dharmesh");

        System.out.println(names);

        names.remove(2);

        System.out.println(names);

        System.out.println(names.size());

        LinkedList<String> moreNames = new LinkedList<String>();
        moreNames.add("amit");
        moreNames.add("sumit");

        System.out.println(moreNames);

        names.addAll(moreNames);

        System.out.println(names);
        System.out.println(moreNames);
    }

}
