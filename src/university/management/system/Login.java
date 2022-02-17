package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{


    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;


    Login(){

        super("Login");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("ID");
        l1.setBounds(40,20,100,30);
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);

        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);//getcontentpane is to apply soemthing to the whole frame
        //here we are making background white white. we have done the same above

        setVisible(true);
        setSize(600,300);
        setLocation(300,100);

    }//login frame

    public void actionPerformed(ActionEvent ae){

       if (ae.getSource()==b1) {
            try {
                conn c1 = new conn();
                String u = t1.getText();
                String v = t2.getText();
                String role;

               // String q = "select * from login where usern='" + u + "' and password='" + v + "'";
                String r="select * from login where ID ='" + u + "' and password='" + v + "'";
                ResultSet rs = c1.s.executeQuery(r);
                if(rs.next());
                {
                     role = rs.getString(4);
                }


                switch (role) {
                    case "teacher" -> new teacherframe().setVisible(true);
                    case "administrator" -> {
                        new adminframe().setVisible(true);
                        setVisible(false);
                    }
                    case "student" -> {
                        new stuframe().setVisible(true);
                        setVisible(false);
                    }
                    case "librarian" -> {
                        new librarianframe().setVisible(true);
                        setVisible(false);
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Invalid login");//joption pane is

                        //to pop a message on the frame
                        setVisible(false);
                    }
                }


            }

            catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if(ae.getSource()==b2){
            System.exit(0);
        }


    }
    public static void main(String[] arg){
        new Login();

    }
}