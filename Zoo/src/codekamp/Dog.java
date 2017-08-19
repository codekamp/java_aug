package codekamp;

/**
 * Created by cerebro on 14/08/17.
 */
public class Dog extends Animal {

    public void stop() {
        System.out.println("Dog vala stop");
    }

    public void moveLeft() {
        System.out.println("Dog moving left");
        super.stop();
    }
}
