import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource;

public class quiz extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;

    quiz() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quizImg.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("simple Minds");
        heading.setBounds(650, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new ColorUIResource(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter your Name");
        name.setBounds(710, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new ColorUIResource(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(635, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(635, 270, 120, 25);
        rules.setBackground(Color.pink);
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(835, 270, 120, 25);
        back.setBackground(Color.pink);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setLocation(100, 150);
        setVisible(true);
        setSize(1100, 500);

    }

    // @overide
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new quiz();
    }

}