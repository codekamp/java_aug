package codekamp;

/**
 * Created by cerebro on 21/08/17.
 */
public class Dog extends Animal {

    private static int coin = 100;

//    non static global is called instance variable
//    static global is called class variable


//    1. non static
//    2. same name as Class name
//    3. no return type
//    such method is called Constructor


    public static int getCoin() {
        return Dog.coin;
    }

//    Parameter vaale constructors never get inhertied
//    only Parameterless constructors can be inherited
//    and that too if child class has no constructor

//    First line in every constructor should be call to parent constructor
//    directly or inderectly

    public Dog(String name) {
        this("Bulldog", 99);
        System.out.println("hello world!");
        this.name = name;
    }

    public Dog(String breed, int xyz) {
        super(5);
    }
}
