package university.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class examination extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1,b2,b3;
    JPanel contentPane;
    JTable table;
    JTextField search;


    void viewreport(){

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


        b3 = new JButton("Result");
        b3.addActionListener(this);
        b3.setBorder(new LineBorder(Color.magenta, 2, true));
        b3.setForeground(Color.RED);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b3.setBounds(600, 89, 90, 33);
        contentPane.add(b3);


        JLabel l1 = new JLabel("Check Result");
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
        panel.setBorder(new TitledBorder(new LineBorder(Color.RED, 3, true), "View Report Card",
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        panel.setBounds(70, 70, 800, 100);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        //Book();

        setVisible(true);

    }//put in the ID of student to check resuolt

    void generatereport(){

        setSize(500,550);
        setLocation(400,200);
        setLayout(null);

        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("serif", Font.BOLD, 30));
        l1.setBounds(50,0,500,80);
        add(l1);

        l2 = new JLabel("Enter ID");
        l2.setBounds(50,70,200,40);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(180,80,200,20);
        add(t1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(50,150,200,40);
        add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(250,150,200,40);
        add(l4);

        t2 = new JTextField();
        t2.setText("English");
        t2.setBounds(50,200,200,20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        add(t3);

        t4 = new JTextField();

        t4.setText("maths");
        t4.setBounds(50,230,200,20);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        add(t5);

        t6 = new JTextField();

        t6.setText("Science");
        t6.setBounds(50,260,200,20);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        add(t7);

        t8 = new JTextField();

        t8.setText("Computer");
        t8.setBounds(50,290,200,20);
        add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        add(t9);

        t10 = new JTextField();

        t10.setText("SST");
        t10.setBounds(50,320,200,20);
        add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        add(t11);

        b1 = new JButton("Submit");
        b1.setBounds(50,360,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b1.addActionListener(this);


        setVisible(true);
        setSize(600,500);
        setLocation(400,150);

        getContentPane().setBackground(Color.WHITE);
    }//put in teh marks of student

    void finalreport(String str){
        JTextArea t1;
        JPanel p1;

        setSize(500,600);
        setLayout(new BorderLayout());
        setVisible(true);

        p1 = new JPanel();

        t1 = new JTextArea(50,15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));

        add(p1,"North");

        add(jsp,"Center");

        setLocation(450,200);
        setVisible(true);


        try{
            conn c = new conn();

            t1.setText("\tResult of Examination\n\nSubject\n");




                t1.append("\n\t"+"English");
                t1.append("\n\t"+"Maths");
                t1.append("\n\t"+"Science");
                t1.append("\n\t"+"Computer");
                t1.append("\n\t"+"SST");
                t1.append("\n-----------------------------------------");
                t1.append("\n");

            ResultSet rs1 = c.s.executeQuery("select * from student where ID="+str);

            if(rs1.next()){
                t1.append("\nMarks\n\n\t"+rs1.getInt("eng"));
                t1.append("\n\t"+rs1.getInt("maths"));
                t1.append("\n\t"+rs1.getInt("science"));
                t1.append("\n\t"+rs1.getInt("computer"));
                t1.append("\n\t"+rs1.getInt("sst"));

                t1.append("\n-----------------------------------------");
                t1.append("\n");

                t1.append("\n\t"+"TotalMarks="+rs1.getInt("total"));
                t1.append("\n\t"+"Grade = "+rs1.getString("grade"));
                t1.append("\n\t"+rs1.getString("examstatus"));

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }//maakes the frame for report card



    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                conn c1 = new conn();

                String grade;
                String gstatus;

                String id=t1.getText();
                String en=t3.getText();

                int e= Integer.valueOf(t3.getText());
                int m= Integer.valueOf(t5.getText());
                int s= Integer.valueOf(t7.getText());
                int c= Integer.valueOf(t9.getText());
                int ss= Integer.valueOf(t11.getText());

                int totalmarks=e+m+s+c+ss;

                float per = (float) (totalmarks/5.0);

                if(per>=80)
                    grade="A";
                else if(per>=65)
                    grade="B";
                else if(per>=40)
                    grade="C";
                else
                    grade="F";

                if (grade =="F"){
                    gstatus="fail";
                }
                else {
                    gstatus = "pass";
                }



                String s1 = "update student set eng=? , maths=? , science=? , computer=? , sst=? ,total=? ,percentage=? , grade=?,examstatus=? where ID=?";

                PreparedStatement pstmt = c1.c.prepareStatement(s1);
                pstmt.setInt(1,e);
                pstmt.setInt(2,m);
                pstmt.setInt(3,s);
                pstmt.setInt(4,c);
                pstmt.setInt(5,ss);
                pstmt.setInt(6,totalmarks);
                pstmt.setFloat(7,per);
                pstmt.setString(8,grade);
                pstmt.setString(9,gstatus);
                pstmt.setString(10,id);
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);

            }

            else if(ae.getSource()==b3){
                String s= search.getText();
                finalreport(s);


            }
        }catch(Exception e){
            e.printStackTrace();
        }



    }

    public static void main(String[] args){
        //examination e= new examination();
        //e.generatereport();
        //e.viewreport();
        //e.finalreport("1");
    }
}