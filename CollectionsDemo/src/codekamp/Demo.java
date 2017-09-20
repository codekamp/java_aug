package codekamp;

import java.util.*;

/**
 * Created by cerebro on 18/09/17.
 */
public class Demo {

    public static void main(String[] args) {
        List<String> names = Student.getNames();

        System.out.println(names);


        HashMap<String, Integer> populations = new HashMap<>();

        populations.put("india", 10000000);
        populations.put("china", 999999999);

        System.out.println(populations.get("china"));


        Collections.shuffle(names);

        Collections.replaceAll(names, "suresh", "Bill");

        System.out.println(names);
    }

}
