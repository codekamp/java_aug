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
       //draw non entities
        g.drawImage(Resources.welcomeImage, 0, 0, null);


        //draw entities
        super.render(g);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            GamePanel.currentScreen = new StageOneScreen();
        }
    }
}
