package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class teacherframe extends JFrame implements ActionListener {

    examination ee=new examination();
    view v =new view();
    Attendance at = new Attendance();


    teacherframe(){

        super("Teacher");

        setSize(1024, 600);
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image a1 = a.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel al1 = new JLabel(a2);

        add(al1);


        JMenuBar mt=new JMenuBar();

        {
            JMenu te= new JMenu("Examination");
            JMenuItem te1 =new JMenuItem("Generate Report");
            JMenuItem te2 =new JMenuItem("View Report");

            te.setForeground(Color.RED);

            te1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon30= new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.png"));
            Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            te1.setIcon(new ImageIcon(image31));
            te1.setMnemonic('Q');
            te1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
            te1.setBackground(Color.WHITE);


            te2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon17.png"));
            Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            te2.setIcon(new ImageIcon(image33));
            te2.setMnemonic('R');
            te2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            te2.setBackground(Color.WHITE);

            te.add(te1);
            te.add(te2);
            mt.add(te);

            te1.addActionListener(this);
            te2.addActionListener(this);



        }//examination input and view report

        {
            JMenu attendance = new JMenu("Attendance");
            JMenuItem te3 = new JMenuItem("Update Attendance");
            JMenuItem te4 = new JMenuItem("View Attendance");
            attendance.setForeground(Color.BLUE);

            te3.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
            Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            te3.setIcon(new ImageIcon(image24));
            te3.setMnemonic('M');
            te3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
            te3.setBackground(Color.WHITE);
            attendance.add(te3);

            te4.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
            Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            te4.setIcon(new ImageIcon(image26));
            te4.setMnemonic('N');
            te4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            te4.setBackground(Color.WHITE);
            attendance.add(te4);

            mt.add(attendance);

            te3.addActionListener(this);
            te4.addActionListener(this);


        }//input and veiw attedance

        {
            JMenu user = new JMenu("View");
            JMenuItem u1 = new JMenuItem("Student");

            user.setForeground(Color.RED);

            u1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u1.setIcon(new ImageIcon(image4));
            u1.setMnemonic('S');
            u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
            u1.setBackground(Color.WHITE);


            user.add(u1);

            mt.add(user);

            u1.addActionListener(this);

        }//view the list of all students

        {
            JMenu parstu = new JMenu("Student");

            JMenuItem st = new JMenuItem("Particular Student");

            parstu.setForeground(Color.BLUE);

            st.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            st.setIcon(new ImageIcon(image4));
            st.setMnemonic('A');
            st.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
            st.setBackground(Color.WHITE);

            parstu.add(st);
            mt.add(parstu);

            st.addActionListener(this);

        }//view a particular student

        {
            JMenu exit = new JMenu("Exit");
            JMenuItem ex = new JMenuItem("Exit");
            exit.setForeground(Color.RED);
            ex.setFont(new Font("monospaced",Font.BOLD,16));

            ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon12.png"));
            Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ex.setIcon(new ImageIcon(image11));
            ex.setMnemonic('Z');
            ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
            ex.setBackground(Color.WHITE);

            ex.addActionListener(this);

            exit.add(ex);
            mt.add(exit);
        }//to logout


        setJMenuBar(mt);//puts the menubar on frame
        /*
         * so you understad
         * menuitem -> menu->menubar->frame
         * menubar goes on frame by setJmenuBar
         */

        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);

    }


    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();//this sees what menuitems is clicked and returns the string in that
        //menuitems

        switch (msg){


            case "Generate Report":
                ee.generatereport();
                break;

            case "View Report":
                ee.viewreport();
                break;

            case "Update Attendance":
                at.updateattendance();

                break;

            case "View Attendance":
                at.studentattendencedetails();
                break;

            case "Student":

                v.viewstu();
                break;

            case "Particular Student":
                v.viewfee();
                break;

            case "Exit":
                System.exit(0);
                break;


        }



    }

    public static void main(String[] args){

        new teacherframe().setVisible(true);
    }





}
