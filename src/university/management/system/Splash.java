package university.management.system;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class Splash{
    public static void main(String[] args){
        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        //int sx=f.getWidth();//gives width of frame
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            f.setLocation((500-((i+x)/2) ),300-(i/2));
            f.setSize(i+3*x,i+x/2);
            try{
                Thread.sleep(10);
            }catch(Exception e) {
                e.printStackTrace();
            }

        }
    }
}
class Frame extends JFrame implements ActionListener{
    JButton b1,b2;

    add a=new add();//object of add class
    Frame(){

        super("Maharaja Agrasen institute of technology");//this is constructor
       //this calls the constructor of jframe class
        //which takes in the title and settitle



        setLayout(new FlowLayout());

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/first.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700,Image.SCALE_SMOOTH);//this is to
        //change the size of images
        ImageIcon i2 = new ImageIcon(i1);//this is to conver the image into icon because we can anly add icons and not images

        JLabel m1 = new JLabel(i2);
        add(m1);//to add on the frame

        m1.setLayout(null);

        b1=new JButton("Login");
        b1.setBounds(270,400,150,50);
        b1.setFont(new Font("serif",Font.BOLD,30));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);

        b2=new JButton("Sign Up");
        b2.setBounds(580,400,150,50);
        b2.setFont(new Font("serif",Font.BOLD,30));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);

        m1.add(b1);

        m1.add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==b1){
            this.setVisible(false);
            new Login();
        }

        if(ae.getSource()==b2){
            this.setVisible(false);
            new Signup().enteruniversalpassword();
        }
     }
}