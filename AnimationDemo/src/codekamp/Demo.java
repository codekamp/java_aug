package codekamp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 30/08/17.
 */
public class Demo {
    public static void main(String[] args) {

                JFrame frame = new JFrame();
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        frame.setResizable(false);
        frame.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int x = 0;
        int y = 0;
        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x = x + 3;
            y = y + 3;

            Graphics g = panel.getGraphics();
            g.setColor(Color.green);
            g.clearRect(0, 0, 500, 400);
            g.fillOval(x, y, 100, 100);
            g.dispose();
        }
    }
}
