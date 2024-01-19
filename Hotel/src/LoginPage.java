import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setTitle("Sign up/Sign in");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(750,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        Intro();
    }
    public static void Intro(){

        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.white);
        jPanel.setLayout(new GridLayout(4,1,0,0));
        JLabel label = new JLabel("Welcome to the Hotel :)");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("",Font.ITALIC, 30));
        label.setForeground(Color.BLUE);
        jPanel.add(label);

        JButton button1=new JButton("1.Sign Up");
        button1.setBackground(Color.white);
        button1.setFont(new Font("",Font.LAYOUT_NO_START_CONTEXT,25));
        button1.setForeground(Color.blue);
        jPanel.add(button1);


        JButton button2=new JButton("2.Login");
        button2.setBackground(Color.white);
        button2.setFont(new Font("",Font.LAYOUT_NO_START_CONTEXT,25));
        button2.setForeground(Color.blue);
        jPanel.add(button2);

        JButton button3=new JButton("2.Login as an admin");
        button3.setBackground(Color.white);
        button3.setFont(new Font("",Font.LAYOUT_NO_START_CONTEXT,25));
        button3.setForeground(Color.blue);
        jPanel.add(button3);

        frame.add(jPanel);
        frame.setVisible(true);
    }
}
