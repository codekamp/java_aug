package codekamp.screens;

import codekamp.Resources;

import java.awt.*;

/**
 * Created by cerebro on 20/09/17.
 */
public class StageOneScreen extends Screen {
    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.playerImage, 100, 100, null);
    }
}
