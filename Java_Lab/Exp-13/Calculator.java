import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    JTextField t1, t2, t3;
    Label l1, l2, l3;
    String a="", b="", o="";
    Calculator(){
        t1 = new JTextField();
        t1.setBounds(210, 40, 100, 20);
        t2 = new JTextField();
        t2.setBounds(210, 80, 100, 20);
        t3 = new JTextField();
        t3.setBounds(210, 120, 100, 20);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("X");
        b14 = new JButton("/");
        b15 = new JButton("%");
        b16 = new JButton("=");
        b18 = new JButton(".");
        b17 = new JButton("CL");

        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        setLayout(new GridLayout(7, 3));
        setSize(500, 700);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String arg = e.getActionCommand();

        if(arg.charAt(0)>='0'&&arg.charAt(0)<='9'||arg.charAt(0)=='.')
        {
            if(!o.equals(""))
            {
                b=b+arg;
                t2.setText(b);
            }
            else
            {
                a=a+arg;

                t1.setText(a);
                t2.setText("");
                t3.setText("");
            }
        }
        else if(arg.equals("=")){
            double ans = performCalc(arg, a, b, o);
            t3.setText(Double.toString(ans));
        }
        else if(arg.equals("CL")){
            a="";
            b="";
            o="";
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
        else{
            if(o.equals("")||b.equals(""))
	{
		o=arg;
		t1.setText(a+o);
		t2.setText("");
		t3.setText("");
	}
	else
	{
		double ans=performCalc(arg,a,b,o);
		a=Double.toString(ans);
		o=arg;
		b="";
		t3.setText(Double.toString(ans));
	}
        }

        
    }

    public static double performCalc(String str, String a, String b, String o){
        double ans=0.0;
        if(o.equals("+")){
            ans = (Double.parseDouble(a)+Double.parseDouble(b));
        }
        else if(o.equals("-")){
            ans=(Double.parseDouble(a)-Double.parseDouble(b));
        }
        else if(o.equals("*")){
            ans=(Double.parseDouble(a)*Double.parseDouble(b));
        }
        else if(o.equals("%")){
            ans=(Double.parseDouble(a) % Double.parseDouble(b));
        }
        else{
            ans=(Double.parseDouble(a) / Double.parseDouble(b));
        }
        return ans;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
