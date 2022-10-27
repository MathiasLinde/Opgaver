import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;

    Picture(){
        setLayout(new FlowLayout());
        image1 = new ImageIcon(getClass().getResource("ratatouille-rat.gif"));
        label1 = new JLabel(image1);
        add(label1);
        image2 = new ImageIcon(getClass().getResource("63453t345.gif"));
        label2 = new JLabel(image2);
        add(label2);
    }

    public static void main(String[] args) {
        Picture gui = new Picture();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Image Program");

    }
}
