package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class librarianframe extends JFrame implements  ActionListener {

    view v=new view();
    updatelib lb =new updatelib();

    librarianframe(){
        super("Librarian");

        setSize(1024, 600);
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image a1 = a.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel al1 = new JLabel(a2);

        add(al1);

        JMenuBar ml=new JMenuBar();
        {
            JMenu parstu = new JMenu("Student");

            JMenuItem st = new JMenuItem("Particular Student");

            parstu.setForeground(Color.BLUE);

            st.setFont(new Font("monospaced",Font.BOLD,16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
            st.setIcon(new ImageIcon(image4));
            st.setBackground(Color.WHITE);

            parstu.add(st);
            ml.add(parstu);

            st.addActionListener(this);

        }//view a particular student

        {
            JMenu update =new JMenu("Update");
            update.setForeground(Color.RED);

            JMenuItem bs = new JMenuItem("Book status");
            update.add(bs);

            ml.add(update);
            bs.addActionListener(this);

        }//update book status of particular student

        {
            JMenu li =new JMenu("Student");
            li.setForeground(Color.BLUE);
            JMenuItem ls = new JMenuItem("List");
            li.add(ls);


            ml.add(li);
            ls.addActionListener(this);

        }//view list of student not returned the book

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
            ml.add(exit);
        }//to logout

        setJMenuBar(ml);
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);


    }

    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();//this sees what menuitems is clicked and returns the string in that
        //menuitems

        switch (msg){


            case "Particular Student":
                //new AddStudent().f.setVisible(true);
                v.viewstu();
                break;

            case "Book status":
                //new StudentDetails().setVisible(true);
                lb.updateattendance();


                break;

            case "List":
                break;

            case "Exit":
                System.exit(0);
                break;

        }



    }

    public static void main(String[] args){

        new librarianframe().setVisible(true);
    }


}
