import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    private static JTextArea ta;

    public static void main(String args[]){


        //Creating the frame
        JFrame frame = new JFrame("Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JFormattedTextField(10);
        JButton send = new JButton("Send");

        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);


        // Text Area at the Center
        JTextArea ta = new JTextArea();
        JButton b = new JButton("Kage!");
        JButton a = new JButton("Fisk!");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kage!");
            }
        });
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fisk!");
            }

        });
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(ta);
            }
        });

        //Adding components to frame
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.getContentPane().add(BorderLayout.EAST,b);
        frame.getContentPane().add(BorderLayout.WEST,a);

        frame.setVisible(true);
    }



}
