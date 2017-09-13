package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

/**
 * Created by cerebro on 04/09/17.
 */
public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static AudioClip jumpAudio;
    private static Random random = new Random();
    private static boolean playerDucked = false;

    private static final int FALL_BACK = 50;


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
        Image blockImage;
        Image p1;
        Image p2;
        Image p3;
        Image p4;
        Image p5;
        Image playerJump;
        Image playerDuck;
        Image playerImage;
        Demo.jumpAudio = Applet.newAudioClip(Demo.class.getResource("images/onjump.wav"));
        AudioClip hitAudio = Applet.newAudioClip(Demo.class.getResource("images/hit.wav"));

        try {
            grassImage = ImageIO.read(Demo.class.getResource("images/grass.png"));
            blockImage = ImageIO.read(Demo.class.getResource("images/block.png"));
            p1 = ImageIO.read(Demo.class.getResource("images/run_anim1.png"));
            p2 = ImageIO.read(Demo.class.getResource("images/run_anim2.png"));
            p3 = ImageIO.read(Demo.class.getResource("images/run_anim3.png"));
            p4 = ImageIO.read(Demo.class.getResource("images/run_anim4.png"));
            p5 = ImageIO.read(Demo.class.getResource("images/run_anim5.png"));
            playerJump = ImageIO.read(Demo.class.getResource("images/jump.png"));
            playerDuck = ImageIO.read(Demo.class.getResource("images/duck.png"));
        } catch (Exception e) {
            e.printStackTrace();
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

        int block1XCord = 900;
        int block2XCord = 1100;
        int block3XCord = 1300;
        int block4XCord = 1500;
        int block5XCord = 1700;

        int block1YCord = 355;
        int block2YCord = 355;
        int block3YCord = 355;
        int block4YCord = 355;
        int block5YCord = 355;

        Rectangle playerRect = new Rectangle();
        Rectangle block1Rect = new Rectangle(20, 50);
        Rectangle block2Rect = new Rectangle(20, 50);
        Rectangle block3Rect = new Rectangle(20, 50);
        Rectangle block4Rect = new Rectangle(20, 50);
        Rectangle block5Rect = new Rectangle(20, 50);


        boolean block1Visible = true;
        boolean block2Visible = true;
        boolean block3Visible = true;
        boolean block4Visible = true;
        boolean block5Visible = true;

        int playerXCord = 400;

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(playerXCord <= -72) {
                Graphics g = panel.getGraphics();
                g.setColor(Color.red);
                g.setFont(new Font("Arial", Font.BOLD, 30));
                g.drawString("Game Over", 100, 100);
                g.dispose();
                return;
            }

            counter++;
            counter = counter % 2;

            if (counter == 0) {
                currentIndex++;
                currentIndex = currentIndex % 8;
            }

            if(Demo.playerDucked) {
                playerImage = playerDuck;
            } else {
                playerImage = playerImages[currentIndex];
            }

//            Demo.playerYCord += Demo.playerYVel;
            Demo.playerYVel = Demo.playerYVel + Demo.playerYAcc;
            Demo.playerYCord = Demo.playerYCord + Demo.playerYVel;

            if (Demo.playerYCord > 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }

            if (Demo.playerYCord < 315) {
                playerImage = playerJump;
            }

            block1XCord -= 5;
            block2XCord -= 5;
            block3XCord -= 5;
            block4XCord -= 5;
            block5XCord -= 5;


            if (block1XCord <= -20) {
                block1XCord = 980;
                block1YCord = Demo.getRandomYCord();
                block1Visible = true;
            }

            if (block2XCord <= -20) {
                block2XCord = 980;
                block2YCord = Demo.getRandomYCord();
                block2Visible = true;
            }

            if (block3XCord <= -20) {
                block3XCord = 980;
                block3YCord = Demo.getRandomYCord();
                block3Visible = true;
            }

            if (block4XCord <= -20) {
                block4XCord = 980;
                block4YCord = Demo.getRandomYCord();
                block4Visible = true;
            }

            if (block5XCord <= -20) {
                block5XCord = 980;
                block5YCord = Demo.getRandomYCord();
                block5Visible = true;
            }


            if(Demo.playerDucked) {
                playerRect.setBounds(playerXCord, playerYCord + 30, 72, 60);
            } else {
                playerRect.setBounds(playerXCord, playerYCord, 72, 90);
            }
            block1Rect.setLocation(block1XCord, block1YCord);
            block2Rect.setLocation(block2XCord, block2YCord);
            block3Rect.setLocation(block3XCord, block3YCord);
            block4Rect.setLocation(block4XCord, block4YCord);
            block5Rect.setLocation(block5XCord, block5YCord);



            if(block1Visible && playerRect.intersects(block1Rect)) {
                hitAudio.play();
                playerXCord -= FALL_BACK;
                block1Visible = false;
            }

            if(block2Visible && playerRect.intersects(block2Rect)) {
                hitAudio.play();
                playerXCord -= FALL_BACK;
                block2Visible = false;
            }

            if(block3Visible && playerRect.intersects(block3Rect)) {
                hitAudio.play();
                playerXCord -= FALL_BACK;
                block3Visible = false;
            }

            if(block4Visible && playerRect.intersects(block4Rect)) {
                hitAudio.play();
                playerXCord -= FALL_BACK;
                block4Visible = false;
            }

            if(block5Visible && playerRect.intersects(block5Rect)) {
                hitAudio.play();
                playerXCord -= FALL_BACK;
                block5Visible = false;
            }



            Graphics g = panel.getGraphics();
            g.setColor(skyColor);
            g.fillRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);

            g.drawImage(playerImage, playerXCord, Demo.playerYCord, null);

            if(block1Visible) {
                g.drawImage(blockImage, block1XCord, block1YCord, null);
            }

            if(block2Visible) {
                g.drawImage(blockImage, block2XCord, block2YCord, null);
            }

            if(block3Visible) {
                g.drawImage(blockImage, block3XCord, block3YCord, null);
            }

            if(block4Visible) {
                g.drawImage(blockImage, block4XCord, block4YCord, null);
            }

            if(block5Visible) {
                g.drawImage(blockImage, block5XCord, block5YCord, null);
            }

            g.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.playerYVel = -16;
            Demo.playerYAcc = 1;
            Demo.jumpAudio.play();
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.playerDucked = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.playerDucked = false;
        }
    }

    public static int getRandomYCord() {
        if (Demo.random.nextInt(2) == 0) {
            return 355;
        } else {
            return 275;
        }
    }

    // libgdx
}
