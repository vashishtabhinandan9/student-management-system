package university.management.system;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class fees  implements ActionListener{

    JLabel l1,l2,l3,l4,l10,l11,l12,l13,l14;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb13,bb17;

    JButton bf;
    JFrame f2;


    JPanel contentPane;
    JTextField search;

    void viewfee() {
        JFrame f1= new JFrame();

        f1.setBounds(50, 50, 930, 300);//size and location of jpanel
        contentPane = new JPanel();//is simialr to jframe except jframe rreprsents a window where as jpanel is an
        //empty space
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        f1.setContentPane(contentPane);//adds content pane to frame



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


        JLabel l1 = new JLabel("Check Attendance");
        l1.setForeground(Color.green);
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);


        JLabel l3 = new JLabel("Back ");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                f1.setVisible(false);
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

        f1.setVisible(true);


    }//take is in the id of student who fees you wish to view

    void feestructure(){
        f2=new JFrame();
        f2.setSize(1200,900);
        f2.setLocation(10,10);

        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f2.setLayout(null);
        f2.setExtendedState(JFrame.MAXIMIZED_BOTH);

        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(600,10,400,70);
        f2.add(i1);

        l1 = new JLabel("Class");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l1);

        l2 = new JLabel("Yearly");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l2);

        l3 = new JLabel("Quatrely");
        l3.setBounds(480,100,150,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l3);

        l4 = new JLabel("Half yearly");
        l4.setBounds(680,100,150,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l4);

        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(680,170,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb5);

        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(680,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb6);

        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(680,310,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb7);

        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(680,380,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb8);

        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(680,450,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb13);


        l10 = new JLabel("1st-3rd");
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l10);

        l11 = new JLabel("3rd-5th");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l11);

        l12 = new JLabel("5th-8th");
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l12);

        l13 = new JLabel("8th-10");
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l13);

        l14 = new JLabel("10th-12th");
        l14.setBounds(80,450,150,40);
        l14.setFont(new Font("serif",Font.BOLD,26));
        f2.add(l14);


        b1 = new JLabel("Rs 43000");
        b1.setBounds(280,170,150,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(b1);

        b2 = new JLabel("Rs 43000");
        b2.setBounds(280,240,150,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(b2);

        b3 = new JLabel("Rs 43000");
        b3.setBounds(280,310,150,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(b3);

        b4 = new JLabel("Rs 43000");
        b4.setBounds(280,380,150,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(b4);

        b5 = new JLabel("Rs 43000");
        b5.setBounds(280,450,150,40);
        b5.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(b5);







        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(480,170,150,40);
        bb1.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb1);

        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(480,240,150,40);
        bb2.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb2);

        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(480,310,150,40);
        bb3.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb3);

        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(480,380,150,40);
        bb4.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb4);

        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(480,450,150,40);
        bb17.setFont(new Font("serif",Font.PLAIN,26));
        f2.add(bb17);



        f2.getContentPane().setBackground(Color.WHITE);
        f2.setVisible(true);
    }//give the fee tructure

    void stufees(){

        JFrame f3= new JFrame("Student not given fees");

        String y[][]=new String[20][3];
        String x[]={"ID","Name","Fee Status"};

//        t1 = new JTextArea(50,15);;


        JTable t1=new JTable(y,x);
        JScrollPane jsp = new JScrollPane(t1);
        jsp.setBounds(10,10, 460, 400);
        f3.add(jsp);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));

        t1.setRowHeight(20);//t1.setRowHeight(row number,height of the row);
//        p1 = new JPanel();

        //      add(p1,BorderLayout.NORTH);//add(p1,"North");
        //    add(jsp,"Center");



        f3.setLocation(450,100);
        f3.setSize(500,500);
        f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f3.setLayout(null);

        f3.setVisible(true);

        f3.getContentPane().setBackground(Color.WHITE);
        try{
            conn c = new conn();

            //      t1.setText("\t Students not paid fees\n\n");

            //    t1.append("\n\t"+"ID"+"   ||   "+"Name"+"   ||   "+"Feestatus");
            int i=0,j=0;
            ResultSet rs1 = c.s.executeQuery("select * from student where feestatus='"+"paid"+"'");


            while(rs1.next()){
                y[i][j++]=rs1.getString(1);
                y[i][j++]=rs1.getString(2);
                y[i][j++]=rs1.getString(6);

                // t1.append("\n\t"+rs1.getString(1)+"   ||   "+rs1.getString(2)+" || "+rs1.getString(6));
                i++;
                j=0;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }//gives the list of student not given fees

    public static void main(String[] args){

        fees f= new fees();
        //f.feestructure();
        f.stufees();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bf) {
            stufees();
        }

    }
}
