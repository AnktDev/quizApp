import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
//import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class Play extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answer[][] = new String[10][2];
    String userans[][] = new String[10][1];
    JLabel qno, QUESTION;
    JRadioButton opt1, opt2, opt3, opt4;
    JButton next, lifeline, submit;
    ButtonGroup optgrp;
    // int score;
    String name;

    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    Play(String name) {

        this.name = name;
        setBounds(80, 30, 1100, 610);
        getContentPane().setBackground(Color.pink);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/img2.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(10, 0, 760, 350);
        add(image);

        qno = new JLabel("1");
        qno.setBounds(50, 350, 80, 25);
        qno.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(qno);

        QUESTION = new JLabel("This is a question");
        QUESTION.setBounds(80, 350, 1500, 25);
        QUESTION.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(QUESTION);

        questions[0][0] = "What is the most common method of entering text and numerical data into a computer system ?";
        questions[0][1] = "A. Plotter";
        questions[0][2] = "B. Scanner";
        questions[0][3] = "C. Printer";
        questions[0][4] = "D. Keyboard";

        questions[1][0] = ".Which of the following devices provide a means of communication between a computer and outer world?";
        questions[1][1] = "A. Input/Output";
        questions[1][2] = "B. Storage";
        questions[1][3] = "C. Compact";
        questions[1][4] = "D. Drivers";

        questions[2][0] = "When a person turn on your computer, which of the following computer memory is the first to activate?";
        questions[2][1] = "A. RAM";
        questions[2][2] = "B.ROM";
        questions[2][3] = "C. BIOS";
        questions[2][4] = "D. All of the e Above";

        questions[3][0] = "Which of the following define the meaning of RAM?";
        questions[3][1] = "A. It is a memory which only be read.";
        questions[3][2] = "B. It is a memory which both read and written.";
        questions[3][3] = "C. It is a memory which is used for permanent storage.";
        questions[3][4] = "D. It is a memory which can only be written.";

        questions[4][0] = "What is the name given to a person who designs the programs in a software package?";
        questions[4][1] = "A. User";
        questions[4][2] = "B. Software Instructor";
        questions[4][3] = "C. Software Designer";
        questions[4][4] = "D. System Programmer";

        questions[5][0] = "Name the network that is connected to the Internet, but uses encryption to scramble all the data sent through the Internet ";
        questions[5][1] = "A. My network";
        questions[5][2] = "B. Virtual Private Network";
        questions[5][3] = "C. Social Network";
        questions[5][4] = "D. None of the above";

        questions[6][0] = " one kilobyte has __?";
        questions[6][1] = "A. 1000 bytes";
        questions[6][2] = "B. 128 bytes";
        questions[6][3] = "C. 1024 bytes";
        questions[6][4] = "D. 1036 bytes";

        questions[7][0] = "which of the following feature used in internet banking sites to reduce the risk of keystroke logging for the password entry?";
        questions[7][1] = "A. Virtual keyboard";
        questions[7][2] = "B. Finger Touching";
        questions[7][3] = "C. Touch screen";
        questions[7][4] = "D. ShapeWriter";

        questions[8][0] = "Which of these softwares is necessary to view web pages on the internet?";
        questions[8][1] = "A. Web mail";
        questions[8][2] = "B. Web Browser";
        questions[8][3] = "C. MS Office";
        questions[8][4] = "D. Flash Player";

        questions[9][0] = "What do we call the files sent in an email?";
        questions[9][1] = "A. Packet";
        questions[9][2] = "B. Parcel";
        questions[9][3] = "C. Attachments";
        questions[9][4] = "D. None of the above";

        answer[0][1] = "D. Keyboard";
        answer[1][1] = "A. Input/Output";
        answer[2][1] = "C. BIOS";
        answer[3][1] = "B. It is a memory which both read and written.";
        answer[4][1] = "D. System Programmer";
        answer[5][1] = "B. Virtual Private Network ";
        answer[6][1] = "C. 1024 bytes";
        answer[7][1] = "A. Virtual keyboard";
        answer[8][1] = "B. Web Browser";
        answer[9][1] = "C. Attachments";

        opt1 = new JRadioButton("This is a question option to check 1");
        opt1.setBounds(100, 400, 600, 25);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton("option 1");
        opt2.setBounds(100, 440, 600, 25);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton("option 1");
        opt3.setBounds(100, 480, 600, 25);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton("option 1");
        opt4.setBounds(100, 520, 600, 25);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        optgrp = new ButtonGroup();
        optgrp.add(opt1);
        optgrp.add(opt2);
        optgrp.add(opt3);
        optgrp.add(opt4);

        next = new JButton("Next");
        next.setBounds(850, 420, 180, 30);
        next.setFont(new FontUIResource("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 225));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 lifeline");
        lifeline.setBounds(850, 470, 180, 30);
        lifeline.setFont(new FontUIResource("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 225));
        lifeline.setForeground(Color.white);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("submit");
        submit.setBounds(850, 520, 180, 30);
        submit.setFont(new FontUIResource("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 225));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);
    }

    public Play() {
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (optgrp.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = optgrp.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (optgrp.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = optgrp.getSelection().getActionCommand();
            }

            for (int i = 0; i < userans.length; i++) {
                if (userans[i][0].equals(answer[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
            // score

        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds";
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 22));

        if (timer > 0) {
            g.drawString(time, 850, 300);
        } else {
            g.drawString("Times up !!", 850, 300);
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) {// submit button
                if (optgrp.getSelection() == null) {
                    userans[count][0] = "";
                } else {
                    userans[count][0] = optgrp.getSelection().getActionCommand();
                }

                for (int i = 0; i < userans.length; i++) {
                    if (userans[i][0].equals(answer[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }

                }
                setVisible(false);
                new Score(name, score);
                // score

            } else { // next button
                if (optgrp.getSelection() == null) {
                    userans[count][0] = "";
                } else {
                    userans[count][0] = optgrp.getSelection().getActionCommand();
                }

                count++;
                start(count);
            }

        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        QUESTION.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        optgrp.clearSelection();
    }

    public static void main(String[] args) {
        new Play("user");
    }
}
