import java.awt.*;
import javax.swing.*;

public class Menubar extends JFrame {
    private JPanel panel;

    public Menubar() {
        JFrame f = new JFrame("Experiment 14");
        f.setBackground(Color.decode("#1c0052"));
        JMenuBar bar = new JMenuBar();
        bar.setBackground(Color.decode("#1c0052"));
        JMenu m = new JMenu("File");
        JMenu n = new JMenu("Edit");
        JMenu o = new JMenu("View");
        JMenu p = new JMenu("Setting");
        m.setForeground(Color.WHITE);
        n.setForeground(Color.WHITE);
        o.setForeground(Color.WHITE);
        p.setForeground(Color.WHITE);
        JMenuItem file = new JMenuItem("New File");
        JMenuItem win = new JMenuItem("New Window");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveas = new JMenuItem("Save As");
        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");
        JMenuItem run = new JMenuItem("Run");
        JMenuItem wrap = new JMenuItem("Word Wrap");
        JMenuItem help = new JMenuItem("Help");
        m.add(file);
        m.add(win);
        m.add(save);
        m.add(saveas);
        n.add(undo);
        n.add(redo);
        o.add(run);
        o.add(wrap);
        p.add(help);
        bar.add(m);
        bar.add(n);
        bar.add(o);
        bar.add(p);
        f.setJMenuBar(bar);
        panel = new JPanel();
        JLabel name = new JLabel("Hello Menubar!");
        JLabel hello = new JLabel("I'm ScrollBar");
        JLabel yash = new JLabel("Yash Atrey, 109");
        name.setFont(new Font("Raleway", Font.BOLD, 38));
        name.setForeground(Color.decode("#1c0052"));
        name.setBounds(250, 145, 375, 200);
        hello.setFont(new Font("Raleway", Font.BOLD, 38));
        hello.setForeground(Color.decode("#1c0052"));
        hello.setBounds(250, 145, 375, 400);
        yash.setFont(new Font("Raleway", Font.BOLD, 38));
        yash.setForeground(Color.decode("#1c0052"));
        yash.setBounds(250, 145, 375, 600);
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(1000, 1500));
        panel.add(name);
        panel.add(hello);
        panel.add(yash);

        JScrollPane s = new JScrollPane(panel);
        f.add(s);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Menubar();
    }
}