package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 25/08/17.
 */
public class Demo implements ActionListener {

    private static JLabel label;
    private static JButton changeColorButton;
    private static JButton newWindowButton;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Demo.newWindowButton) {
            Demo.createWindow();
        } else {

            if (Demo.label.getForeground() == Color.green) {
                Demo.label.setForeground(Color.red);
            } else {
                Demo.label.setForeground(Color.green);
            }
        }
    }

    public static void createWindow() {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        Demo.label = new JLabel("Welcome to CodeKamp.");
        Demo.label.setForeground(Color.red);

        Demo.changeColorButton = new JButton("Change Color");
        Demo d1 = new Demo();
        Demo.changeColorButton.addActionListener(d1);

        Demo.newWindowButton = new JButton("New Window");
        Demo.newWindowButton.addActionListener(d1);

        panel.add(Demo.label);
        panel.add(Demo.changeColorButton);
        panel.add(Demo.newWindowButton);

        frame.setVisible(true);
    }
}
