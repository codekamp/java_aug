package codekamp;

/**
 * Created by cerebro on 14/08/17.
 */
public class Ship {
    public String name;
    public int bombCount = 10;
    public int fuel = 100;


    public void fire(int x, int y) {
        System.out.println(this.name + " is firing at " + x + ", " + y);
        this.decreaseBombCount();
    }

    private void decreaseBombCount() {
        this.bombCount--;
    }
}
