package university.management.system;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.*;


public class stuframe  extends JFrame implements ActionListener, MouseListener {
    JMenu parstu,update,report,at,ls;
    String sid;

    examination e=new examination();
    //Login l=new Login();


    public stuframe(String stid){
        sid=stid;

        setExtendedState(JFrame.MAXIMIZED_BOTH);


        setTitle("Student");

        setSize(1024, 600);
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image a1 = a.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel al1 = new JLabel(a2);

        add(al1);


        JMenuBar ms=new JMenuBar();

        {
            parstu = new JMenu("Details");
            parstu.setForeground(Color.BLUE);
            ms.add(parstu);
            parstu.addMouseListener(this);
            parstu.setMnemonic(KeyEvent.VK_D);
        }//view your details

        {
            update =new JMenu("Update");
            update.setForeground(Color.RED);
            ms.add(update);
            //update.addActionListener(this);
            update.addMouseListener(this);
            update.setMnemonic(KeyEvent.VK_U);

        }//update your details

        {
            report = new JMenu("Examination");
            report.setForeground(Color.BLUE);
            ms.add(report);
            //report.addActionListener(this);
            report.addMouseListener(this);
            report.setMnemonic(KeyEvent.VK_R);
        }//view your report"

        {
            at = new JMenu("Attendance");
            at.setForeground(Color.RED);

            ms.add(at);
            //at.addActionListener(this);
            at.addMouseListener(this);
            at.setMnemonic(KeyEvent.VK_N);
        }//view your attendance

        {
            JMenu fee = new JMenu("Fee Details");
            JMenuItem s1 = new JMenuItem("Fee Structure");
            JMenuItem s2 = new JMenuItem("Your Fees");
            fee.setForeground(Color.BLUE);

            s1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.png"));
            Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
            s1.setIcon(new ImageIcon(image15));
            s1.setMnemonic('G');
            s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
            s1.setBackground(Color.WHITE);


            s2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon8.png"));
            Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
            s2.setIcon(new ImageIcon(image17));
            s2.setMnemonic('H');
            s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            s2.setBackground(Color.WHITE);

            fee.add(s1);
            fee.add(s2);

            s2.addActionListener(this);
            s1.addActionListener(this);

            ms.add(fee);
        }//view your fee status and fee structur

        {
            ls= new JMenu("Book Status");
            ls.setForeground(Color.RED);
            ms.add(ls);
            //ls.addActionListener(this);
            ls.addMouseListener(this);

        }//view your bookstatus

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
            ms.add(exit);
        }//to logout


        setJMenuBar(ms);
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        //setVisible(false);


    }

    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();//this sees what menuitems is clicked and returns the string in that
        //menuitems

        switch (msg){
            /*
            case "Examination":
               //e.finalreport(sid);
                break;

            case "Details":
               // new view().parstu(l.u);
                break;

            case "Attendance":
               // new Attendance().studentattendencedetails();
                break;

            case "Update":
                //new updatestu().updatestudent(l.u);
                break;

            case "Book Status":
                break;

             */
            case "Fee Structure":
                new fees().feestructure();
                break;

            case "Your Fees":
                new fees().stufees();
                break;

            case "Exit":
                System.exit(0);
                break;
        }



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== parstu){
            new view().parstu(sid);

        }

        else if(e.getSource() == update){
            new updatestu().updatestudent(sid);

        }

        else if (e.getSource() ==report){
            new examination().finalreport(sid);

        }
        else if (e.getSource()==at){
            new Attendance().studentattendencedetails();
        }

        else if(e.getSource() == ls){
            new view().parstu(sid);

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public static void main(String[] args){

        //new stuframe(String) ("1");
    }


}