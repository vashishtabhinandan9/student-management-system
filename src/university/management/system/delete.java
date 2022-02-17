package university.management.system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class delete extends JFrame implements ActionListener {

    JPanel contentPane;

    JTextField search;
    JButton b1;

    void deletetal(String s) {

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


        b1 = new JButton("Submit");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(Color.magenta, 2, true));
        b1.setForeground(Color.RED);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(600, 89, 90, 33);
        contentPane.add(b1);



        JLabel l1 = new JLabel("Delete"+" " + s);
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
        panel.setBorder(new TitledBorder(new LineBorder(Color.RED, 3, true), "Delete  "+ s,
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        panel.setBounds(70, 70, 800, 100);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        //Book();

        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);


    }//take is in the id of staff whom you wanto delete


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            String id = search.getText();

            try {
                conn cc = new conn();
                String q = "delete from login where ID= '"+id+"' ";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                setVisible(false);
            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        }

    }
}
