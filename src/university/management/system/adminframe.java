package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class adminframe extends JFrame implements ActionListener {

    add a= new add();
    delete d =new delete();
    view v =new view();
    updatestu u =new updatestu();
    fees fe =new fees();

    adminframe(){
        super("Administrator");

        setSize(1024, 800);//this becomes the size whenyou minimize screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);//thsi make s the frame acquire whole screen

        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image a1 = a.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel al1 = new JLabel(a2);

        add(al1);

        JMenuBar ma  = new JMenuBar();//this is for a menubar

        {
            JMenu add = new JMenu("Add");//this is what appears on menubar(file,edit,etc)

            JMenuItem ma1 = new JMenuItem("New Teacher");//this is what appears when you hover onmenubar things
            //(new,open,openrecent,etc when you go on file)
            JMenuItem ma2 = new JMenuItem("New Student");
            JMenuItem ma3 = new JMenuItem("New Librarian");
            JMenuItem ma4 = new JMenuItem("New Administrator");
            add.setForeground(Color.BLUE);//this is set color of the add's text


            ma1.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
            Image image1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ma1.setIcon(new ImageIcon(image1));//this adds image along with the m1text
            ma1.setMnemonic('A');//this adds the memonic here a is set to be memonis
            ma1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
            ma1.setBackground(Color.WHITE);

            ma2.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
            Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            ma2.setIcon(new ImageIcon(image2));
            ma2.setMnemonic('B');
            ma2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            ma2.setBackground(Color.WHITE);

            ma3.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
            Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            ma3.setIcon(new ImageIcon(image3));
            ma3.setMnemonic('C');
            ma3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
            ma3.setBackground(Color.WHITE);

            ma4.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
            Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            ma4.setIcon(new ImageIcon(image4));
            ma4.setMnemonic('D');
            ma4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            ma4.setBackground(Color.WHITE);


            ma1.addActionListener(this);
            ma2.addActionListener(this);
            ma3.addActionListener(this);
            ma4.addActionListener(this);

            add.add(ma1);//adds menuitems to menuthings
            add.add(ma2);
            add.add(ma3);
            add.add(ma4);

            ma.add(add);
        }//for adding student,teachers,librarian,admin


        {
            JMenu delete =new JMenu("Delete");
            JMenuItem d1= new JMenuItem("Delete Student");
            JMenuItem d2=new JMenuItem("Delete Teacher");
            JMenuItem d3 =new JMenuItem("Delete Librarian");
            JMenuItem d4 =new JMenuItem("Delete Administrator");

            delete.setForeground(Color.RED);


            d1.setBackground(Color.WHITE);
            d1.setMnemonic('E');
            d1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

            d2.setBackground(Color.WHITE);
            d2.setMnemonic('F');
            d2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

            d3.setBackground(Color.WHITE);
            d3.setMnemonic('G');
            d3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));

            d4.setBackground(Color.WHITE);
            d4.setMnemonic('H');
            d4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));


            d1.setFont(new Font("monospaced",Font.BOLD,16));
            d2.setFont(new Font("monospaced",Font.BOLD,16));
            d3.setFont(new Font("monospaced",Font.BOLD,16));
            d4.setFont(new Font("monospaced",Font.BOLD,16));

            delete.add(d1);
            delete.add(d2);
            delete.add(d3);
            delete.add(d4);

            ma.add(delete);
            d1.addActionListener(this);
            d2.addActionListener(this);
            d3.addActionListener(this);
            d4.addActionListener(this);

        }//for deleting student,teachers,librarian,admin

        {
            JMenu update =new JMenu("Update");
            update.setForeground(Color.BLUE);
            JMenuItem upstu=new JMenuItem("Update Student");
            update.add(upstu);

            upstu.setBackground(Color.WHITE);
            upstu.setMnemonic('I');
            upstu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));

            ma.add(update);
            upstu.addActionListener(this);
        }//for updating student


        {
            JMenu fee = new JMenu("Fee Details");
            JMenuItem s1 = new JMenuItem("Fee Structure");
            JMenuItem s2 = new JMenuItem("Student Fee Details");
            fee.setForeground(Color.RED);

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

            ma.add(fee);

        }//for fees related stuff

        {
            JMenu user = new JMenu("View");
            JMenuItem u1 = new JMenuItem("Student");
            JMenuItem u2 = new JMenuItem("Teacher");
            JMenuItem u3 = new JMenuItem("Librarian");
            JMenuItem u4 = new JMenuItem("Administrator");

            user.setForeground(Color.BLUE);

            u1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u1.setIcon(new ImageIcon(image4));
            u1.setMnemonic('S');
            u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
            u1.setBackground(Color.WHITE);

            u2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
            Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u2.setIcon(new ImageIcon(image5));
            u2.setMnemonic('T');
            u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
            u2.setBackground(Color.WHITE);

            u3.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
            Image image6 = icon6.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u3.setIcon(new ImageIcon(image6));
            u3.setMnemonic('L');
            u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
            u3.setBackground(Color.WHITE);

            u4.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
            Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            u4.setIcon(new ImageIcon(image7));
            u4.setMnemonic('V');
            u4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
            u4.setBackground(Color.WHITE);

            user.add(u1);
            user.add(u2);
            user.add(u3);
            user.add(u4);

            ma.add(user);

            u1.addActionListener(this);
            u2.addActionListener(this);
            u3.addActionListener(this);
            u4.addActionListener(this);
        }//view the llist of all students,teachers,librarain,administrator


        {
            JMenu parstu = new JMenu("Student");

            JMenuItem st = new JMenuItem("particular student");

            parstu.setForeground(Color.RED);

            st.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            st.setIcon(new ImageIcon(image4));
            st.setMnemonic('P');
            st.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
            st.setBackground(Color.WHITE);

            parstu.add(st);
            ma.add(parstu);

            st.addActionListener(this);

        }//view a particular student

        {
            JMenu utility = new JMenu("Utility");
            JMenuItem ut1 = new JMenuItem("Notepad");
            JMenuItem ut2 = new JMenuItem("Calculator");
            utility.setForeground(Color.BLUE);


            ut1.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon9.png"));
            Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ut1.setIcon(new ImageIcon(image19));
            ut1.setMnemonic('X');
            ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
            ut1.setBackground(Color.WHITE);


            ut2.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon10.png"));
            Image image21 = icon20.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            ut2.setIcon(new ImageIcon(image21));
            ut2.setMnemonic('Y');
            ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
            ut2.setBackground(Color.WHITE);



            utility.add(ut1);
            utility.add(ut2);

            ma.add(utility);

            ut1.addActionListener(this);
            ut2.addActionListener(this);


        }//utilities

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
            ma.add(exit);
        }//to logout

        setJMenuBar(ma);//puts the menubar on frame
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


            case "New Teacher":
                //new AddStudent().f.setVisible(true);

                a.addtal("teacher");//to add teacher,administrator,libraria
                break;

            case "New Student":
                a.addstudent();
                break;

            case "New Librarian":
                a.addtal("librarian");//to add teacher,administrator,libraria

                break;

            case "New Administrator":
                a.addtal("administrator");//to add teacher,administrator,librarian

                break;

            case "Delete Teacher":

                d.deletetal("teacher");
                break;

            case "Delete Student":
                v.viewstu();
                break;

            case "Delete Librarian":
                d.deletetal("librarian");
                break;

            case "Delete Administrator":
                d.deletetal("administrator");
                break;

            case "Update Student":
                u.updatestudent();
                break;

            case "Fee Structure":
                fe.feestructure();
                break;

            case "Student Fee Details":
                fe.stufees();
                break;

            case "Student":
                v.viewstu();
                break;


            case "Teacher":
                v.viewtal("teacher");
                //new AddStudent().f.setVisible(true);
                break;

            case "Librarian":
                v.viewtal("librarian");

                break;

            case "Administrator":
                v.viewtal("administrator");

                break;

            case "particular student":
                v.searchparstu();
                break;

            case "Notepad":
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;

            case "Calculator":
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }

                catch(Exception e){
                    e.printStackTrace();
                }
                break;

            case "Exit":
                System.exit(0);
                break;

        }



    }

    public static void main(String[] args){

        new adminframe().setVisible(true);
    }






}




