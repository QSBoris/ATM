package bank.management.system;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, M1, M2, M3;
    JButton next;
    JTextField textName, textSname, textEmail, textADD, textCity, textPin, textState;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelSName = new JLabel("Surname:");
        labelSName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelSName.setBounds(100, 240, 200, 30);
        add(labelSName);

        textSname = new JTextField();
        textSname.setFont(new Font("Raleway", Font.BOLD, 14));
        textSname.setBounds(300, 240, 400, 30);
        add(textSname);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel label6 = new JLabel("Gender:");
        label6.setFont(new Font("Raleway", Font.BOLD, 20));
        label6.setBounds(100, 290, 200, 30);
        add(label6);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(225, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(225, 255, 228));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(225, 255, 228));
        r3.setBounds(600, 290, 110, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email adress");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status:");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100, 440, 200, 30);
        add(labelMS);

        M1 = new JRadioButton("Married");
        M1.setBounds(300, 440, 100, 30);
        M1.setBackground(new Color(222, 255, 228));
        M1.setFont(new Font("Rallewa", Font.BOLD, 14));
        add(M1);

        M2 = new JRadioButton("Unmarried");
        M2.setBounds(450, 440, 100, 30);
        M2.setBackground(new Color(222, 255, 228));
        M2.setFont(new Font("Rallewa", Font.BOLD, 14));
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setBounds(635, 440, 100, 30);
        M3.setBackground(new Color(222, 255, 228));
        M3.setFont(new Font("Rallewa", Font.BOLD, 14));
        add(M3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(M1);
        buttonGroup2.add(M2);
        buttonGroup2.add(M3);

        JLabel labelADD = new JLabel("Address:");
        labelADD.setFont(new Font("Raleway", Font.BOLD, 20));
        labelADD.setBounds(100, 490, 200, 30);
        add(labelADD);

        textADD = new JTextField();
        textADD.setFont(new Font("Ralleway", Font.BOLD, 14));
        textADD.setBounds(300, 490, 400, 30);
        add(textADD);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin code:");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Ralleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Ralleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Ralleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String sname = textSname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if (M1.isSelected()) {
            marital = "Married";
        } else if (M2.isSelected()) {
            marital = "Unmarried";
        } else if (M3.isSelected()) {
            marital = "Other";
        }
        String adress = textADD.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                DB db1 = new DB();
                String q = "insert into signup values('" + formno + "', '" + name + "','" + sname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "', '" + adress + "', '" + city + "','" + pincode + "','" + state + "' )";
                db1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    //textName, textSname, textEmail, textADD, textCity, textPin, textState
    public static void main(String[] args) {
        new Signup();
    }
}
