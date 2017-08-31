package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 25/08/17.
 */
public class Demo implements ActionListener {

    private JLabel label;
    private JButton cc;
    private JButton nw;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == this.nw) {
            Demo.createWindow();
        } else {
            if (this.label.getForeground() == Color.green) {
                this.label.setForeground(Color.red);
            } else {
                this.label.setForeground(Color.green);
            }
        }
    }

    public static void createWindow() {
        Demo d1 = new Demo();

        JFrame frame = new JFrame();
        frame.setSize(400, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        d1.label = new JLabel("Welcome to CodeKamp.");
        d1.label.setForeground(Color.red);

        d1.cc = new JButton("Change Color");
        d1.cc.addActionListener(d1);

        d1.nw = new JButton("New Window");
        d1.nw.addActionListener(d1);

        panel.add(d1.label);
        panel.add(d1.cc);
        panel.add(d1.nw);

        frame.setVisible(true);
    }
}
