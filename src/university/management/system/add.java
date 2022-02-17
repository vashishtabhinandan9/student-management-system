package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class add extends JFrame implements ActionListener {

    JFrame f;
    JLabel a,al,a1,a2,a3,a4,fee;


    JLabel s, sl, s1, s2, s3, s4,s6;
    JTextField  t1, t2, t3, t4,t6;
    JButton b1, b2, b3;
    JComboBox c1;

   /*
   *  Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;//you have to take moduolus of that number so that it comes to
    //a number as much sigits you want in the numbeer and add an equal number of digits to it
    //also [we hacve writtten 9000L because the number is in long
    long first = Math.abs(first4);
    * */


    public void addstudent() {


        f = new JFrame("Add student");//this is similar to super("add student") but here you are using object
        //of jframe .earlier you have extended the class form jframe so you were using super
        Random ran = new Random();
        long first4 = (ran.nextLong() % 9000L) + 1000L;//you have to take moduolus of that number so that it comes to
        //a number as much sigits you want in the numbeer and add an equal number of digits to it
        //also [we hacve writtten 9000L because the number is in long
        long first = Math.abs(first4);


        s = new JLabel();

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fourth.jpg"));
        Image i = img.getImage().getScaledInstance(1220, 700, Image.SCALE_DEFAULT);
        ImageIcon si = new ImageIcon(i);
        s.setIcon(si);

        sl = new JLabel("New Student Details");
        sl.setBounds(320, 30, 500, 50);
        sl.setFont(new Font("serif", Font.ITALIC, 25));
        sl.setForeground(Color.black);
        s.add(sl);
        f.add(s);


        s1 = new JLabel("Name");
        s1.setBounds(50, 150, 100, 30);
        s1.setFont(new Font("serif", Font.BOLD, 20));
        s.add(s1);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        s.add(t1);

        s2 = new JLabel("ID");
        s2.setBounds(400, 150, 200, 30);
        s2.setFont(new Font("serif", Font.BOLD, 20));
        s.add(s2);

        t2 = new JTextField();
        t2.setText("stu"+first);
        t2.setBounds(600, 150, 150, 30);
        s.add(t2);

        s3 = new JLabel("Father's Name");
        s3.setBounds(50, 200, 100, 30);
        s3.setFont(new Font("serif", Font.BOLD, 20));
        s.add(s3);

        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        s.add(t3);

        s4 = new JLabel("Mother'Name");
        s4.setBounds(400, 200, 200, 30);
        s4.setFont(new Font("serif", Font.BOLD, 20));
        s.add(s4);

        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        s.add(t4);



        s6 = new JLabel("Password");
        s6.setBounds(400, 250, 100, 30);
        s6.setFont(new Font("serif", Font.BOLD, 20));
        s.add(s6);

        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        s.add(t6);


        b3 = new JButton("Submit");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(250, 550, 150, 40);

        s.add(b3);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450, 550, 150, 40);

        s.add(b2);

        fee=new JLabel("Fee status");
        fee.setBounds(50, 250, 100, 30);
        fee.setFont(new Font("serif",Font.BOLD,20));
        s.add(fee);

        String ff[] =new String[] {"paid","unpaid"};
        c1 = new JComboBox(ff);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 250, 150, 30);
        s.add(c1);


        b3.addActionListener(this);
        b2.addActionListener(this);


        f.setVisible(true);
        f.setSize(1024, 800);
        f.setBackground(Color.RED);

        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(new FlowLayout());



    }//add student

    public void addtal(String s){
        f=new JFrame();
        f.setLayout(new FlowLayout());
        f.setBackground(Color.WHITE);
        f.setTitle("Add"+s);

        a = new JLabel();
        Random ran = new Random();
        long first4 = (ran.nextLong() % 9000L) + 1000L;//you have to take moduolus of that number so that it comes to
        //a number as much sigits you want in the numbeer and add an equal number of digits to it
        //also [we hacve writtten 9000L because the number is in long
        long first = Math.abs(first4);

       // a.setBounds(0,0,900,700);
       // a.setLayout(null);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fifth.jpg"));
        Image i = img.getImage().getScaledInstance(1220, 700,Image.SCALE_DEFAULT);
        ImageIcon ti = new ImageIcon(i);
        a.setIcon(ti);

        al =new JLabel("New "+s+" Details");
        al.setBounds(320,50,500,50);
        al.setFont(new Font("serrif",Font.ITALIC,25));
        al.setForeground(Color.black);
        a.add(al);
        f.add(a);//newteacherdetails(al)-->main label a-->frame f


        a1 = new JLabel("Name");
        a1.setBounds(50,150,100,30);
        a1.setFont(new Font("serif",Font.BOLD,20));
        a.add(a1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        a.add(t1);


        a2=new JLabel("Password");
        a2.setBounds(400,150,100,30);
        a2.setFont(new Font("serrif",Font.BOLD,20));
        a.add(a2);

        t2= new JTextField();
        t2.setBounds(600,150,150,30);
        a.add(t2);

        a3= new JLabel("Role");
        a3.setBounds(50,200,100,30);
        a3.setFont(new Font("serif",Font.BOLD,20));
        a.add(a3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        t3.setText(s);
        a.add(t3);

        a4= new JLabel("ID");
        a4.setBounds(400,200,200,30);
        a4.setFont(new Font("serif",Font.BOLD,20));
        a.add(a4);

        t4=new JTextField();
        t4.setText(s+first);
        t4.setBounds(600,200,150,30);
        a.add(t4);

        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,350,150,40);

        a.add(b1);

        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450,350,150,40);

        a.add(b2);

        b2.addActionListener(this);
        b1.addActionListener(this);



        f.setVisible(true);
        f.setSize(900,700);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.getContentPane().setBackground(Color.WHITE);

    }//add teacehr,librarian,admin


    public static void main(String[] arg) {
        add a = new add();

        a.addstudent();
        //a.addtal("Administrator");//to add teacher,administrator,librarian
    }


    @Override
    public void actionPerformed(ActionEvent ae) {


        if (ae.getSource() == b1) {//for staff
            String name = t1.getText();
            String pass = t2.getText();
            String role = t3.getText();
            String id = t4.getText();

            try {
                conn cc = new conn();

                String q = "insert into login values('"+id+"','"+name+"','"+pass+"','"+role+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Details Inserted Successfully");
                f.setVisible(false);
            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        }

        else if(ae.getSource()== b3){//for students
            try {
            String name = t1.getText();
            String id = t2.getText();
            String fname = t3.getText();
            String mname = t4.getText();
            String pass = t6.getText();
            String fee = (String)c1.getSelectedItem();

                conn cc = new conn();

                String q = "insert into login values('"+id+"','"+name+"','"+pass+"','"+"student"+"')";
                cc.s.executeUpdate(q);
                String str = "insert into student (ID,username,password,fathername,mothername,feestatus) values('"+id+"','"+name+"','"+pass+"','"+fname+"','"+mname+"','"+fee+"')";
                cc.s.executeUpdate(str);

                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");

            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }

        }


        else if (ae.getSource() == b2) {
            f.setVisible(false);
           // new Project().setVisible(true);

        }


    }
}
