import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {

        setBounds(30, 20, 1100, 580);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/results.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 120, 800, 180);
        add(image);

        JLabel heading = new JLabel(" Thankyou " + name + " for playing Simple Minds. You can check your score gained");
        heading.setBounds(120, 48, 880, 38);
        heading.setFont(new Font("Times new Roman", Font.ITALIC, 26));
        add(heading);

        javax.swing.JLabel results = new JLabel("Your Score Points are " + score + "/100");
        results.setBounds(390, 200, 880, 338);
        results.setFont(new Font("Dialog", Font.BOLD, 24));
        add(results);

        JButton submit = new JButton("Play Again");
        submit.setBounds(460, 400, 180, 35);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 225));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new quiz();
    }

    public static void main(String[] args) {
        new Score("user", 0);
    }

}
