package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.sql.*;

public class view extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTable t1,t3;
    JButton b1, b2, b3;
    JTextField t2;


    JButton bf;


    //JTable table;
    JPanel contentPane;
    JTextField search;


    String x[] = {"ID","Name", "Father's Name", "Mother's name", "feestatus", "eng", "maths", "science", "computer", "sst", "total", "percentage", "grade", "examstatus","attendance","attendence%","bookstatus"};
    String y[][] = new String[20][17];


    String p[]={"ID","Name"};
    String q[][]=new String[20][2];



    JFrame f;

    public void viewstu() {

        f = new JFrame("view student Details");
        setTitle("view student Details");
        setSize(1260, 650);
        setLocation(100, 50);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        l1 = new JLabel("Enter ID to delete Student : ");
        l1.setBounds(50, 360, 400, 30);
        l1.setFont(new Font("serif", Font.BOLD, 20));
        add(l1);

        t2 = new JTextField();
        t2.setBounds(400, 360, 200, 30);
        add(t2);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100, 30);
        add(b1);

        l2 = new JLabel("Add New Student");
        l2.setBounds(50, 450, 400, 30);
        l2.setFont(new Font("serif", Font.BOLD, 20));
        add(l2);

        b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150, 30);
        add(b2);

        l3 = new JLabel("Update Student Details");
        l3.setBounds(50, 490, 400, 30);
        l3.setFont(new Font("serif", Font.BOLD, 20));
        add(l3);

        b3 = new JButton("Update Student");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 490, 150, 30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        t1 = new JTable(y, x);


        try {
           conn c1  = new conn();
            int i = 0, j = 0;
            String s1 = "select * from student";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString(1);
                y[i][j++]=rs.getString(2);
                y[i][j++]=rs.getString(4);
                y[i][j++]=rs.getString(5);
                y[i][j++]=rs.getString(6);
                y[i][j++]=rs.getString(7);
                y[i][j++]=rs.getString(8);
                y[i][j++]=rs.getString(9);
                y[i][j++]=rs.getString(10);
                y[i][j++]=rs.getString(11);
                y[i][j++]=rs.getString(12);
                y[i][j++]=rs.getString(13);
                y[i][j++]=rs.getString(14);
                y[i][j++]=rs.getString(15);
                y[i][j++]=rs.getString(16);
                y[i][j++]=rs.getString(17);
                y[i][j++]=rs.getString(18);
                i++;
                j=0;
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20, 20, 1200, 330);
        add(sp);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);

    }//viw list of student

    public void viewtal(String rol){
        f = new JFrame("view" +rol + " Details");
        setTitle("view " + rol + " Details");
        setSize(1260, 650);
        setLocation(200, 200);
        setLayout(null);


        try {
            conn c1  = new conn();
            String s1 = "select * from login where role='"+rol+"'";
            int i = 0, j = 0;

            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){

                q[i][j++]=rs.getString(1);
                q[i][j++]=rs.getString(2);
                i++;
                j=0;
            }

            t3 = new JTable(q, p);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t3);
        sp.setBounds(20, 20, 1200, 330);
        add(sp);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void viewfee() {
//        JPanel contentPane;

        setBounds(50, 50, 930, 300);//size and location of jpanel
        contentPane = new JPanel();//is simialr to jframe except jframe rreprsents a window where as jpanel is an
        //empty space
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);//adds content pane to frame
        contentPane.setLayout(null);


        JLabel l = new JLabel("Enter ID :");
        l.setForeground(Color.GRAY);
        l.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l.setBounds(90, 89, 150, 33);
        contentPane.add(l);

        search = new JTextField();
        search.setBackground(Color.WHITE);
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(250, 89, 250, 33);
        contentPane.add(search);
        search.setColumns(10);


        bf = new JButton("Submit");
        bf.addActionListener(this);
        bf.setBorder(new LineBorder(Color.magenta, 2, true));
        bf.setForeground(Color.RED);
        bf.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        bf.setBounds(600, 89, 90, 33);
        contentPane.add(bf);



        JLabel l1 = new JLabel("View Student");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);


        JLabel l3 = new JLabel("Back ");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(730, 89, 80, 33);
        contentPane.add(l3);


        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(Color.RED, 3, true), "Enter student ID",
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        panel.setBounds(70, 70, 800, 100);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        //Book();

        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);




    }//take is in the id of student who you want to view

    public  void parstu(String se){

        f = new JFrame("view student Details");
        setTitle("view student Details");
        setSize(1260, 650);
        setLocation(200, 200);
        setLayout(null);

        l1 = new JLabel("Enter ID to delete Student : ");
        l1.setBounds(50, 360, 400, 30);
        l1.setFont(new Font("serif", Font.BOLD, 20));
        add(l1);

        t2 = new JTextField();
        t2.setBounds(400, 360, 200, 30);
        add(t2);

        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100, 30);
        add(b1);

        l2 = new JLabel("Add New Student");
        l2.setBounds(50, 450, 400, 30);
        l2.setFont(new Font("serif", Font.BOLD, 20));
        add(l2);

        b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150, 30);
        add(b2);

        l3 = new JLabel("Update Student Details");
        l3.setBounds(50, 490, 400, 30);
        l3.setFont(new Font("serif", Font.BOLD, 20));
        add(l3);

        b3 = new JButton("Update Student");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 490, 150, 30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        try {
            conn c1  = new conn();
            int i = 0, j = 0;
            String s1 = "select * from student where ID ='"+se+"'";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString(1);
                y[i][j++]=rs.getString(2);
                y[i][j++]=rs.getString(4);
                y[i][j++]=rs.getString(5);
                y[i][j++]=rs.getString(6);
                y[i][j++]=rs.getString(7);
                y[i][j++]=rs.getString(8);
                y[i][j++]=rs.getString(9);
                y[i][j++]=rs.getString(10);
                y[i][j++]=rs.getString(11);
                y[i][j++]=rs.getString(12);
                y[i][j++]=rs.getString(13);
                y[i][j++]=rs.getString(14);
                y[i][j++]=rs.getString(15);
                y[i][j++]=rs.getString(16);
                y[i][j++]=rs.getString(17);
                y[i][j++]=rs.getString(18);
                i++;
                j=0;
            }

            t1 = new JTable(y, x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20, 20, 1200, 330);
        add(sp);

        getContentPane().setBackground(Color.WHITE);



        setVisible(true);




    }

    public static void main(String args[]) {

        //view v = new view();
        //v.viewstu();
       // v.viewfee();
        //v.viewtal("teacher");
    }


    @Override
    public void actionPerformed(ActionEvent ae) {


        if (ae.getSource() == b1) {
            try {
                conn c1 = new conn();
                String a = t2.getText();
                String q = "delete from student where ID = '"+a+"'";
                c1.s.executeUpdate(q);
                String r ="delete from login where ID = '"+a+"'";
                c1.s.executeUpdate(r);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                new view().viewstu();
                //new StudentDetails().setVisible(true);


            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else if(ae.getSource()==b2){
            try{
               new add().addstudent();
                this.setVisible(false);
             //  JOptionPane.showMessageDialog(f,"New student added");
            // new view().viewstu();

            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        else if(ae.getSource() == bf){

            String se= search.getText();
            new view().parstu(se);
        }
    }
}
