package codekamp;

/**
 * Created by cerebro on 14/08/17.
 */
public class Dog extends Animal {

    public void bark() {
        System.out.println("Wuff Wuff");
    }

    public void bark(String a, int b) {
        System.out.println("Wuff " + a);
    }

    //method overloading
    public void bark(int x, String y) {
        System.out.println("Wuff " + y);
    }


    // this is method overriding

    public void walk() {
        System.out.println("fire fire");
    }





}
