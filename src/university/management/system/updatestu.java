package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import  java.sql.*;

public class updatestu extends JFrame implements ActionListener {

    JFrame f;
    JLabel a, al, a1, a2, a3, a4, a5, a6, fee;
    JTextField i, i1, i2, i3, i4, i5, i6;

    JLabel s, sl, s1, s2, s3, s4, s5, s6;
    JTextField t, t1, t2, t3, t4, t5, t6;
    JButton b1, b2;
    JComboBox c1, c2;

    public void updatestudent() {

        f = new JFrame("Update student");//this is similar to super("add student") but here you are using object
        //of jframe .earlier you have extended the class form jframe so you were using super

        f.setBackground(Color.WHITE);

        f.setLayout(null);




        sl = new JLabel("Update Student Details");
        sl.setBounds(320, 30, 500, 50);
        sl.setFont(new Font("serif", Font.ITALIC, 25));
        sl.setForeground(Color.black);

        f.add(sl);

        a = new JLabel("Enter the ID of student you want to update ");
        a.setBounds(50, 100, 500, 30);
        a.setFont(new Font("serif", Font.ITALIC, 20));
        f.add(a);

        i = new JTextField();
        i.setBounds(400, 100, 200, 30);
        f.add(i);


        s1 = new JLabel("Name");
        s1.setBounds(50, 150, 100, 30);
        s1.setFont(new Font("serif", Font.BOLD, 20));
        f.add(s1);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        f.add(t1);


        s3 = new JLabel("Father's Name");
        s3.setBounds(50, 200, 100, 30);
        s3.setFont(new Font("serif", Font.BOLD, 20));
        f.add(s3);

        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        f.add(t3);

        s4 = new JLabel("Mother'Name");
        s4.setBounds(400, 200, 200, 30);
        s4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(s4);

        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        f.add(t4);


        s6 = new JLabel("Password");
        s6.setBounds(400, 250, 100, 30);
        s6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(s6);

        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        f.add(t6);


        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250, 350, 150, 40);

        f.add(b1);

        b1.addActionListener(this);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450, 350, 150, 40);

        f.add(b2);

        fee = new JLabel("Fee status");
        fee.setBounds(50, 250, 100, 30);
        fee.setFont(new Font("serif", Font.BOLD, 20));
        f.add(fee);

        String ff[] = {"paid", "unpaid"};
        c1 = new JComboBox(ff);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 250, 150, 30);
        f.add(c1);



        b2.addActionListener(this);


        f.setVisible(true);
        f.setSize(900, 600);
        f.setLocation(200, 50);


    }


    public static void main(String args[]) {

        updatestu u = new updatestu();
        u.updatestudent();

    }

    public void actionPerformed(ActionEvent ae) {


        if(ae.getSource() == b1){
            String name = t1.getText();
            String id = i.getText();
            String fname = t3.getText();
            String mname = t4.getText();
            String pass = t6.getText();
            String fee = (String)c1.getSelectedItem();
            try {
                conn con = new conn();
                String q="update login set username=? , password=? , role=?  where ID=?";
                String str="update student set username=? ,password=?, fathername=? , mothername=?,feestatus=? where ID=?";

                PreparedStatement  pstmt = con.c.prepareStatement(q);
                pstmt.setString(1,name);
                pstmt.setString(2,pass);
                pstmt.setString(3,"student");
                pstmt.setString(4,id);
                pstmt.executeUpdate();

                PreparedStatement  stmt = con.c.prepareStatement(str);
                stmt.setString(1,name);
                stmt.setString(2,pass);
                stmt.setString(3,fname);
                stmt.setString(4,mname);
                stmt.setString(5,fee);
                stmt.setString(6,id);
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Student Details updated Successfully");
                f.setVisible(false);
            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }

        }

        else if (ae.getSource() == b2) {
            f.setVisible(false);


        }



    }
}