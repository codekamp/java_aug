package codekamp;

/**
 * Created by cerebro on 14/08/17.
 */
public class Demo {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.climbTree();

        Animal a1 = new Animal();
        a1.walk();

        d1.walk();
        c1.walk();
    }
}
