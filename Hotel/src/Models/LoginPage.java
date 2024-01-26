package Models;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.sql.Connection;
import Data.JBCDemo;
import Services.GeustServices;

public class LoginPage extends JFrame {
    private static JFrame frame;


    public static void main(String[] args) {
        frame = new JFrame();
        frame.setTitle("Sign up/Sign in");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(750, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        Intro();
    }

    public static void Intro() {

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.white);
        jPanel.setLayout(new GridLayout(4, 1, 0, 0));
        JLabel label = new JLabel("Welcome to the Hotel :)");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("", Font.ITALIC, 30));
        label.setForeground(Color.BLUE);
        jPanel.add(label);

        JButton button1 = new JButton("1.Sign Up");
        button1.setBackground(Color.white);
        button1.setFont(new Font("", Font.LAYOUT_NO_START_CONTEXT, 25));
        button1.setForeground(Color.blue);
        jPanel.add(button1);


        JButton button2 = new JButton("2.Login");
        button2.setBackground(Color.white);
        button2.setFont(new Font("", Font.LAYOUT_NO_START_CONTEXT, 25));
        button2.setForeground(Color.blue);
        jPanel.add(button2);

        JButton button3 = new JButton("2.Login as an admin");
        button3.setBackground(Color.white);
        button3.setFont(new Font("", Font.LAYOUT_NO_START_CONTEXT, 25));
        button3.setForeground(Color.blue);
        jPanel.add(button3);


        button1.addActionListener(e -> {
           signUp();
           frame.remove(jPanel);
        });

        button2.addActionListener(e -> {

        });

        button3.addActionListener(e -> {

        });

        frame.add(jPanel);
        frame.setVisible(true);
    }

    public static void signUp() {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.white);
        jPanel.setLayout(null);

        JTextField name = new JTextField("Name:");
        name.setFont(new Font("", Font.PLAIN, 23));
        name.setBorder(new LineBorder(Color.blue));
        name.setForeground(Color.blue);
        name.setHorizontalAlignment(JTextField.CENTER);
        name.setBounds(200, 100, 340, 40);
        jPanel.add(name);

        JTextField LastName = new JTextField("LastName");
        LastName.setBorder(BorderFactory.createLineBorder(Color.blue));
        LastName.setHorizontalAlignment(JTextField.CENTER);
        LastName.setForeground(Color.blue);
        LastName.setFont(new Font("", Font.PLAIN, 22));
        LastName.setBounds(200, 150, 340, 40);
        jPanel.add(LastName);


        JTextField Id = new JTextField("ID");
        Id.setBorder(BorderFactory.createLineBorder(Color.blue));
        Id.setHorizontalAlignment(JTextField.CENTER);
        Id.setForeground(Color.blue);
        Id.setFont(new Font("", Font.PLAIN, 22));
        Id.setBounds(200, 200, 340, 40);
        jPanel.add(Id);

        JTextField email = new JTextField("Email");
        email.setBorder(BorderFactory.createLineBorder(Color.blue));
        email.setHorizontalAlignment(JTextField.CENTER);
        email.setForeground(Color.blue);
        email.setFont(new Font("", Font.PLAIN, 22));
        email.setBounds(200, 250, 340, 40);
        jPanel.add(email);

        JTextField pass = new JTextField("Password");
        pass.setBorder(BorderFactory.createLineBorder(Color.blue));
        pass.setHorizontalAlignment(JTextField.CENTER);
        pass.setForeground(Color.blue);
        pass.setFont(new Font("", Font.PLAIN, 22));
        pass.setBounds(200, 300, 340, 40);
        jPanel.add(pass);


        JButton button1 = new JButton("Submit");
        button1.setFont(new Font("", Font.PLAIN, 25));
        button1.setHorizontalAlignment(SwingConstants.CENTER);
        button1.setBackground(Color.blue);
        button1.setForeground(Color.white);
        button1.setBounds(200, 360, 340, 45);
        jPanel.add(button1);

        button1.addActionListener(e -> {
           EmailValidator emailValidator=new EmailValidator();
            String Email = email.getText();
            String Name=name.getText();
            String lastname=LastName.getText();
            String id=Id.getText();
            boolean emailCheck=emailValidator.CheckEmail(Email);
            if (!emailCheck) {
                JOptionPane.showMessageDialog(null, "Invalid Email!", "Error", JOptionPane.ERROR_MESSAGE);}
                HashTHePass hashThePass = new HashTHePass();
                String password = pass.getText();
                int security = hashThePass.rconizeLevel(password);
                if (security <3) {
                    JOptionPane.showMessageDialog(null, "Your pass doesn't have the security that wee need\n" + "Security of your pass:" + security, "Error", JOptionPane.ERROR_MESSAGE);}
                if (emailCheck && security>=3){
                    Connection  connection = JBCDemo.getConnection();
                    GeustServices geustServices=new GeustServices(connection);
                    boolean add= geustServices.Add(Name,lastname,Email,id,password);
                    if(add)
                        JOptionPane.showMessageDialog(null,"Hope you enjoy :)","Welcome!",JOptionPane.PLAIN_MESSAGE);
                }
             });

        frame.add(jPanel);
        frame.setVisible(true);
    }
}


