package codekamp.screens;

import codekamp.GamePanel;
import codekamp.Resources;

import java.awt.*;

/**
 * Created by cerebro on 04/10/17.
 */
public class StageTwoScreen extends Screen {

    @Override
    public void render(Graphics g) {
        g.setColor(Resources.skyColor);
        g.fillRect(0, 0, GamePanel.GAME_WIDTH, GamePanel.GAME_HEIGHT);
        g.setColor(Color.red);
        g.drawString("This is stage 2", 100, 100);

        super.render(g);
    }
}
