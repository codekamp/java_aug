package codekamp.entities;

import codekamp.Resources;

/**
 * Created by cerebro on 25/09/17.
 */
public class Block extends Entity {

    public Block(int x, int y) {
        super();

        this.x = x;
        this.y = y;
        this.xVel = -5;
        this.image = Resources.blockImage;
    }
}
