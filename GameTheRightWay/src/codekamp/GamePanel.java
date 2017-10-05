package codekamp;

import codekamp.screens.Screen;
import codekamp.screens.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;


/**
 * Created by cerebro on 20/09/17.
 */
public class GamePanel extends JPanel implements KeyListener, Runnable {


    public static Screen currentScreen;

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 450;


    public GamePanel() {
        this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        Resources.load();

        GamePanel.currentScreen = new WelcomeScreen();

        Thread t = new Thread(this);
        t.start();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        GamePanel.currentScreen.onKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        GamePanel.currentScreen.onKeyRelease(e.getKeyCode());
    }

    @Override
    public void run() {
        BufferedImage bigImg = new BufferedImage(GAME_WIDTH, GAME_HEIGHT, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            GamePanel.currentScreen.update();

            Graphics panelGraphics = this.getGraphics();
            Graphics imageGraphics = bigImg.getGraphics();



            GamePanel.currentScreen.render(imageGraphics);
            panelGraphics.drawImage(bigImg, 0, 0, null);


            imageGraphics.dispose();
            panelGraphics.dispose();
        }
    }
}
