package codekamp.entities;

import java.awt.*;

/**
 * Created by cerebro on 25/09/17.
 */
abstract public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;
    public int height;
    public int width;
    public Image image;
    public boolean visible = true;
    private Rectangle rect = new Rectangle();

    public void update() {
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
        this.x += this.xVel;
        this.y += this.yVel;
    }



    public boolean isCollidingWith(Entity other) {
        this.updateRect();
        other.updateRect();

        return this.visible && other.visible && this.rect.intersects(other.rect);
    }

    private void updateRect() {
        this.rect.setBounds(this.x, this.y, this.width, this.height);
    }
}
