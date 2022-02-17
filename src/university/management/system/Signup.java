package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    JButton b2,b;
    JPasswordField p;
    add a=new add();
    JFrame f2;

    public  void  sign(){
       //        super("Sign Up As Administrator"); //this cann only be used with constructors
        //but here we have a method so inside method we cant use it
        setVisible(true);

        setTitle("Sign Up As Administrator");
        setSize(1024, 600);
        setLayout(new FlowLayout());
        setLocation(100,50);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image a1 = i.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon i2= new ImageIcon(a1);
        JLabel l=new JLabel(i2);
        add(l);

        setVisible(true);

        l.setLayout(null);



        b2=new JButton("Add Administrator");
        b2.setBounds(800,300,300,40);
        b2.setFont(new Font("serif",Font.BOLD,30));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        l.add(b2);
        b2.addActionListener(this);

    }//fraem after which you can add  admistrator


    public void enteruniversalpassword(){
        f2=new JFrame("Password");
        f2.setBackground(Color.lightGray);
        f2.setLocation(540,250);
        f2.setSize(500,200);
        f2.setLayout(null);
        JLabel l =new JLabel("Enter password");
         p=new JPasswordField();
        l.setBounds(100,40,100,30);
        p.setBounds(230,40,150,30);
        f2.add(l);
        f2.add(p);
        b =new JButton("Submit");
        b.setBounds(180,90,100,40);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("serif",Font.BOLD,15));
        f2.add(b);
        b.addActionListener(this);
        f2.setVisible(true);

    }//frmae at which you need to enter password
    // after whichyou can add administrator


    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==b2){
            try{

                this.setVisible(false);
                a.addtal("administrator");

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        else if (ae.getSource()==b){

            try{

                String  v = p.getText();

                if ("agrasen".equals(v)){
                    f2.setVisible(false);

                    Signup si=new Signup();

                    si.sign();
                }
                else{
                    JFrame z=new JFrame();
                    JOptionPane.showMessageDialog(z,"Wrong password . Try again");

                }

            }
            catch (Exception e){
                e.printStackTrace();
            }

             }

    }

    public static void main(String[] arg){



    }
}
