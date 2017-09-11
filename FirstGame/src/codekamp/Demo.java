package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/**
 * Created by cerebro on 04/09/17.
 */
public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static AudioClip jumpAudio;


    public static void main(String[] args) {

        Demo d1 = new Demo();

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Dimension d = new Dimension(800, 450);
        panel.setPreferredSize(d);

        panel.setFocusable(true);
        panel.addKeyListener(d1);
        frame.add(panel);

        frame.pack();

        frame.setResizable(false);
        frame.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.exit(0);
        }

        panel.requestFocus();

        Color skyColor = new Color(22, 237, 255);


        Image grassImage;
        Image p1;
        Image p2;
        Image p3;
        Image p4;
        Image p5;
        Image playerJump;
        Image playerImage;
        Demo.jumpAudio = Applet.newAudioClip(Demo.class.getResource("images/onjump.wav"));

        try {
            grassImage = ImageIO.read(Demo.class.getResource("images/grass.png"));
            p1 = ImageIO.read(Demo.class.getResource("images/run_anim1.png"));
            p2 = ImageIO.read(Demo.class.getResource("images/run_anim2.png"));
            p3 = ImageIO.read(Demo.class.getResource("images/run_anim3.png"));
            p4 = ImageIO.read(Demo.class.getResource("images/run_anim4.png"));
            p5 = ImageIO.read(Demo.class.getResource("images/run_anim5.png"));
            playerJump = ImageIO.read(Demo.class.getResource("images/jump.png"));
        } catch (Exception e) {
            Graphics g = panel.getGraphics();
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Seems game is corrput", 100, 100);
            g.dispose();
            return;
        }

        // 1 2 3 4 5 4 3 2       1 2 3 4 5 4 3 2

        Image[] playerImages = {p1, p2, p3, p4, p5, p4, p3, p2};

        int currentIndex = 0;
        int counter = 0;

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter++;
            counter = counter % 2;

            if (counter == 0) {
                currentIndex++;
                currentIndex = currentIndex % 8;
            }

            playerImage = playerImages[currentIndex];

//            Demo.playerYCord += Demo.playerYVel;
            Demo.playerYVel = Demo.playerYVel + Demo.playerYAcc;
            Demo.playerYCord = Demo.playerYCord + Demo.playerYVel;

            if(Demo.playerYCord > 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }

            if(Demo.playerYCord < 315) {
                playerImage = playerJump;
            }

            Graphics g = panel.getGraphics();
            g.setColor(skyColor);
            g.fillRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImage, 400, Demo.playerYCord, null);
            g.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.playerYVel = -16;
            Demo.playerYAcc = 1;
            Demo.jumpAudio.play();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
