package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 14/08/17.
 */
public class Demo {

    public static void main(String[] args) {

        // In a variable of class XYZ we can store objects of XYZ and it's subclasses

        Animal a1;

        Random r = new Random();
        int i = r.nextInt(3);

        if(i == 0) {
            a1 = new Animal();
        } else if(i == 0) {
            a1 = new Dog();
        } else {
            a1 = new Cat();
        }

        // At run time method search starts from class of Object
        // But at compile time search starts from class of Variable
        a1.walk();

        System.out.println("hello");
    }

}
