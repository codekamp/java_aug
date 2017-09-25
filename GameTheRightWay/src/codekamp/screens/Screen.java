package codekamp.screens;

import codekamp.entities.Entity;

import java.awt.*;
import java.util.*;

/**
 * Created by cerebro on 20/09/17.
 */
abstract public class Screen {

    public java.util.List<Entity> entities = new ArrayList<>();

    public void update() {
        for (Entity e : entities) {
            e.update();
        }
    }

    public void render(Graphics g) {
        for (Entity e : entities) {
            g.drawImage(e.image, e.x, e.y, null);
        }
    }


    public void onKeyPress(int keyCode) {

    }

    public void onKeyRelease(int keyCode) {

    }

}