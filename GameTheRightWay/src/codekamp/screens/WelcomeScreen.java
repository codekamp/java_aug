package codekamp.screens;

import codekamp.GamePanel;
import codekamp.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 20/09/17.
 */
public class WelcomeScreen extends Screen {

    @Override
     public void render(Graphics g) {
        g.drawImage(Resources.grassImage, 0, 405, null);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            GamePanel.currentScreen = new StageOneScreen();
        }
    }
}
