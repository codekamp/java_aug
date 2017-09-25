package codekamp.entities;

import codekamp.Resources;

/**
 * Created by cerebro on 25/09/17.
 */
public class Cloud extends Entity {

    public Cloud(int x, int y) {
        super();

        this.x = x;
        this.y = y;
        this.xVel = -3;
        this.image = Resources.cloudImage;
    }
}
