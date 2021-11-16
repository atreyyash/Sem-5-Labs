import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Simple2 extends JFrame implements ActionListener {// inheriting JFrame

    JButton b1, b2;
    JTextField tf1, tf2;

    Simple2() {

        b1 = new JButton("click");// create button
        b2 = new JButton("Hello");// create button

        tf1 = new JTextField();
        tf2 = new JTextField();

        // b1.setBounds(130,100,100, 40);
        // b2.setBounds(250,100,100, 40);

        // tf1.setBounds(50,50, 150,20);
        // tf2.setBounds(220,50, 150,20);

        add(b1);// adding button on frame
        add(tf1);

        add(b2);
        add(tf2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        tf1.addActionListener(this);
        tf2.addActionListener(this);

        setSize(200, 200);
        setLayout(new GridLayout(2, 2));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String msg = "You selected ";
        String arg = ae.getActionCommand();
        if (arg.equals("click"))
            tf1.setText("Welcome to Javatpoint.");
        /*
         * String s1=tf1.getText(); String s2=tf2.getText(); int a=Integer.parseInt(s1);
         * int b=Integer.parseInt(s2);
         */

    }

    public static void main(String[] args) {
        new Simple2();
    }
}