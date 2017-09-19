package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 18/09/17.
 */
public class Demo {

    private static Animal a;

    public static void main(String[] args) {

        Random r = new Random();
        int randomInt = r.nextInt(2);

        System.out.println("random number is " + randomInt);


        if(randomInt == 0) {
           Demo.a  = new Dog();
        } else {
           Demo.a = new Cat();
        }


        Demo.onUserStopSpeaking();
    }

    public static void onLeftSwipe() {
        a.moveLeft();
    }

    public static void onRightSwipe() {
        a.moveRight();
    }

    public static void onUserStopSpeaking() {
        a.talk();
    }
}

