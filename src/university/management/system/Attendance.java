package university.management.system;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;



public class Attendance extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l, la;
    JTextField t1, t2, t3, t4, t5, t6, t7, days;
    JButton b1, b2;
    Choice c2, fh, sh;

    JPanel contentPane;
    JTable table;
    JTextField search;
    JFrame f1,f2;

    JTable j1;
    String h[] = {"ID", "Name", "Attendence", "Attendence%"};//1 d array to create colomn names of table
    String d[][] = new String[30][4];//to create rows for respective cloumns


/*
    void viewattendance() {

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


        b2 = new JButton("Submit");
        b2.addActionListener(this);
        b2.setBorder(new LineBorder(Color.magenta, 2, true));
        b2.setForeground(Color.RED);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b2.setBounds(600, 89, 90, 33);
        contentPane.add(b2);


        JLabel l1 = new JLabel("Check Attendance");
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
        panel.setBorder(new TitledBorder(new LineBorder(Color.RED, 3, true), "View Attendance",
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        panel.setBounds(70, 70, 800, 100);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        //Book();

        setVisible(true);


    }//take is in the id of student who attendnce you wish to view
//extra bn gyi hai

*/

    void studentattendencedetails() {
        f1=new JFrame();
        f1.setSize(800, 300);
        f1.setLocation(250, 200);

        try {

            String q = "select * from student";
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery(q);
            int i = 0, j = 0;
            while (rs.next()) {
                d[i][j++] = rs.getString("ID");
                d[i][j++] = rs.getString("username");
                d[i][j++] = rs.getString("attendence");
                d[i][j++] = rs.getString("attendenceper");
                i++;
                j = 0;
            }






        }
        catch (Exception e) {
            e.printStackTrace();
        }

        j1 = new JTable(d, h);
        JScrollPane s1 = new JScrollPane(j1);
        f1.add(s1);

        f1.setVisible(true);

    }//view all the studentsattendence details


    void updateattendance(){
        f2=new JFrame();
        f2.setBounds(50, 50, 930, 400);//size and location of jpanel
        contentPane = new JPanel();//is simialr to jframe except jframe rreprsents a window where as jpanel is an
        //empty space
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        f2.setContentPane(contentPane);//adds content pane to frame

        JLabel l = new JLabel("Enter ID :");
        l.setForeground(Color.GRAY);
        l.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l.setBounds(90, 89, 150, 33);
        contentPane.add(l);

        JLabel la = new JLabel("Enter Attendence:");
        la.setForeground(Color.GRAY);
        la.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        la.setBounds(90, 150, 210, 33);
        contentPane.add(la);

        days = new JTextField();
        days.setBackground(Color.WHITE);
        days.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        days.setForeground(new Color(47, 79, 79));
        days.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        days.setBounds(250, 150, 250, 33);
        contentPane.add(days);
        days.setColumns(10);




        search = new JTextField();
        search.setBackground(Color.WHITE);
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(250, 89, 250, 33);
        contentPane.add(search);
        search.setColumns(10);


        b1 = new JButton("Submit");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(Color.magenta, 2, true));
        b1.setForeground(Color.RED);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(600, 89, 90, 33);
        contentPane.add(b1);


        JLabel l1 = new JLabel("Update Attendance");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);



        JLabel l3 = new JLabel("Back ");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                f2.setVisible(false);
            }
        });
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(730, 89, 80, 33);
        contentPane.add(l3);


        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(Color.RED, 3, true), "Attendance",
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        panel.setBounds(70, 70, 800, 150);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        //Book();

        f2.setVisible(true);



    }//update attendance//take in id and the attendence of the student




    public static void main(String[] args){
        Attendance a =new Attendance();
        a.updateattendance();
        //a.studentattendencedetails();
        //a.viewattendance();

        //to view the attendance use the same function as view particular student
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource()==b1){
            String s= search.getText();
            String d=days.getText();
            int r= Integer.valueOf(d);
            float attpr= (float)(r/2.2);

            try{
                conn c1 = new conn();

                String s1 = "update student set attendence=? , attendenceper=?  where ID=?";

                PreparedStatement pstmt = c1.c.prepareStatement(s1);
                pstmt.setInt(1,r);
                pstmt.setFloat(2,attpr);
                pstmt.setString(3,s);
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(null,"updated Successfully");
                f2.setVisible(false);


            }catch(Exception e){
                e.printStackTrace();
            }

        }

    }
}