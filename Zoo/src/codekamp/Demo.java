package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 14/08/17.
 */
public class Demo {


    public static Animal a1;

    public static void main(String[] args) {


//        Animal a1 = new Animal();
//        Animal a2 = new Animal();
//        a1.name = "Bush";
//        a2.name = "Laiden";
//        a1.hit(a2);


        Animal a1 = new Dog();

        a1.moveLeft();

//        // In a variable of class XYZ we can store objects of XYZ and it's subclasses
//
//        Random r = new Random();
//        int animalNumber = r.nextInt(3);
//
//        if(animalNumber == 0) {
//            Demo.a1 = new Animal();
//            System.out.println("Animal object created");
//        } else if(animalNumber == 1) {
//            Demo.a1 = new Dog();
//            System.out.println("Dog object created");
//        } else {
//            Demo.a1 = new Cat();
//            System.out.println("Cat object created");
//        }
//
//        // At run time method search starts from class of Object
//        // But at compile time search starts from class of Variable
//        // But in case of super keyword, search starts from parent class of the class...
//        // ... in which super is used.
//
//
//        Demo.moveLeftButtonClicked();
//        Demo.moveRightButtonClicked();

    }

    public static void moveRightButtonClicked() {
        Demo.a1.moveRight();
    }

    public static void moveLeftButtonClicked() {
        Demo.a1.moveLeft();
    }


}
