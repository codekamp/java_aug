package codekamp;

/**
 * Created by cerebro on 14/08/17.
 */
public class Animal {

    public String name;

    public void moveLeft() {
        System.out.println("animal moving left");
        this.stop();
    }

    public void moveRight() {
        System.out.println("animal moving right");
        this.stop();
    }

    public void stop() {
        System.out.println("Animal wala Stop");
    }

    public void hit(Animal eneymy) {
        System.out.println(this.name + " hits " + eneymy.name);
        this.laugh();
        eneymy.cry();
    }

    public void laugh() {
        System.out.println(this.name + " laughing");
    }

    public void cry() {
        System.out.println(this.name + " crying");
    }
}
