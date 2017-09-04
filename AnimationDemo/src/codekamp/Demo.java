package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by cerebro on 30/08/17.
 */
public class Demo implements MouseListener, KeyListener {

    private static boolean paused = false;
    private static int xVel = 3;
    private static int yVel = 3;

    public static void main(String[] args) {

        Demo d1 = new Demo();

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();

        Dimension d = new Dimension(500, 400);
        panel.setPreferredSize(d);

        panel.addMouseListener(d1);
        panel.setFocusable(true);
        panel.addKeyListener(d1);
        frame.add(panel);

        frame.pack();

        frame.setResizable(false);
        frame.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        panel.requestFocus();

        int x = 0;
        int y = 0;

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (Demo.paused) {
                continue;
            }


            x = x + Demo.xVel;
            y = y + Demo.yVel;

            if (x > 400 || x < 0 || y < 0 || y > 300) {
                Graphics g = panel.getGraphics();
                g.setColor(Color.red);
                g.setFont(new Font("Arial", Font.BOLD, 30));
                g.drawString("Game Over", 100, 100);
                g.dispose();
                Demo.paused = true;
                continue;
            }

            if (x >= 400) {
                x = 400;
                Demo.xVel = -3;
            }


            if (y >= 300) {
                y = 300;
                Demo.yVel = -3;
            }

            if (x <= 0) {
                x = 0;
                Demo.xVel = 3;
            }


            if (y <= 0) {
                y = 0;
                yVel = 3;
            }

            Graphics g = panel.getGraphics();
            g.setColor(Color.green);
            g.clearRect(0, 0, 500, 400);
            g.fillOval(x, y, 100, 100);
            g.fillRect(10, 10, 50, 50);
            g.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getX() > 10 && e.getX() < 60 && e.getY() > 10 && e.getY() < 60) {
            Demo.paused = !Demo.paused;

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Demo.xVel = 3;
            Demo.yVel = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Demo.xVel = -3;
            Demo.yVel = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.xVel = 0;
            Demo.yVel = 3;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            Demo.xVel = 0;
            Demo.yVel = -3;
        } else {
            System.out.println("Key pressed was not an arrow key");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }
}
