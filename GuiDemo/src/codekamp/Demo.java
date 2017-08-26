package codekamp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 21/08/17.
 */
public class Demo implements Xyz {

    private static JTextField usernameField;
    private static JTextField passwordField;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setTitle("I love Java");

        JPanel panel = new JPanel();
        frame.add(panel);

        Demo.usernameField = new JTextField();
        Demo.passwordField = new JTextField();

        Demo.usernameField.setText("enter username");
        Demo.passwordField.setText("enter password");


        Dog d1 = new Dog();
        Cat c1 = new Cat();

        JButton button = new JButton();
        button.setText("Login");
        button.setForeground(Color.red);
        button.addActionListener(d1);

        JButton button1 = new JButton();
        button1.setText("cancel");
        button1.setForeground(Color.green);
        button1.addActionListener(c1);

        // actionPerformed(ActionEvent xyz);

        panel.add(Demo.usernameField);
        panel.add(Demo.passwordField);
        panel.add(button);
        panel.add(button1);

        frame.setVisible(true);

        Xyz myVar = new Demo();


        Xyz v1 = new Xyz();
    }

    private void signin(String username, String password) {

        System.out.println("username entered is " + username);
        System.out.println("passwored entered is " + password);
    }

    public void addActionListner(Object listner) {

    }
}
