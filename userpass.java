import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class userpass extends JFrame
{   
    JLabel u,p;
    JTextField username;
    JPasswordField password;
    JButton b;
    userpass()
    {    
        super("Quiz Generator");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel background=new JLabel(new ImageIcon("1.jpg"));
        add(background);
        background.setLayout(null);
        u=new JLabel("Username:");
        u.setBounds(40,100,100,30);
        u.setFont(new Font("Serif", Font.PLAIN, 18));
        
        username= new JTextField(30);
        username.setBounds(125,105,100,20);
        
        p=new JLabel("Password:");
        p.setBounds(40,140,100,30);
        p.setFont(new Font("Serif", Font.PLAIN, 18));
        
        password=new JPasswordField(30);
        password.setBounds(125,145,100,20);
        
        
        background.add(u);
        background.add(username);
        background.add(p);
        background.add(password);
        setVisible(true);    
    }    
    public static void main(String[] args)
    {
        new userpass(); 
    }
}