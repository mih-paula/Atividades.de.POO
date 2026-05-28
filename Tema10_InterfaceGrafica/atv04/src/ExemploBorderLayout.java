import javax.swing.*;
import java.awt.*;

public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout() {
        super("Exemplo BorderLayout");
        this.setLayout(new BorderLayout());

        JButton norte = new JButton("Norte");
        JButton sul = new JButton("Sul");
        JButton leste = new JButton("Leste");
        JButton oeste = new JButton("Oeste");
        JButton centro = new JButton("Centro");

        this.setSize(400, 300);
        this.setVisible(true);

    }
}