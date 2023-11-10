import java.awt.*;
import javax.swing.*;

public class BorderLayout1 extends JFrame {
    private JButton b1, b2, b3, b4, b5;
    private BorderLayout layout;
    
    public BorderLayout1() {
        super("BorderLayout Demo");
        layout = new BorderLayout(5, 5);
        setLayout(layout);

        b1 = new JButton("Enter the number");
        add(b1, BorderLayout.NORTH);
        b2 = new JButton("Binary");
        add(b2, BorderLayout.WEST);

        b3 = new JButton("Octal");
        add(b3, BorderLayout.CENTER);

        b4 = new JButton("Hex");
        add(b4, BorderLayout.EAST);

        b5 = new JButton("Result");
        add(b5, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        BorderLayout1 frame = new BorderLayout1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
