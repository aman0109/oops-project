import javax.swing.*;  
public class Simple extends JFrame{//inheriting JFrame  
JFrame f;  
Simple(){  
JButton b=new JButton("click");//create button  
b.setBounds(130,100,100, 40);  
          
add(b);//adding button on frame  
setSize(2000,2000);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new Simple();  
}}  