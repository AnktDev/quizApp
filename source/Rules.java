import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Quiz Rules");
        heading.setBounds(150, 20, 600, 45);
        heading.setFont(new FontUIResource("Viber Hand ITC", Font.ITALIC, 30));
        heading.setForeground(new ColorUIResource(40, 124, 204));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 60, 600, 350);
        rules.setFont(new FontUIResource("Tahoma", Font.PLAIN, 15));
        rules.setText(
                "<html>" +
                        "1. This is multiple choice questions with only one correct answer." + "<br><br>" +
                        "2. You have only 30 seconds to attempt each question." + "<br><br>" +
                        "3. After completion of 30 seconds you will be directed to next question." + "<br><br>" +
                        "4. Each Question carries 10 Points." + "<br><br>" +
                        "5. Correct answer provides 10 points and zero marks for wrong answer." + "<br><br>" +
                        "6. After attempting all questions click on the Submit Button to get the Result."
                        + "<br><br>" +
                        "</html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 400, 100, 30);
        back.setBackground(Color.pink);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        start = new JButton("start");
        start.setBounds(400, 400, 100, 30);
        start.setBackground(Color.pink);
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);

        setSize(800, 500);
        setLocation(350, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Play(name);
        } else {
            setVisible(false);
            new quiz();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
