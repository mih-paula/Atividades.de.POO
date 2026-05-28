import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout extends JFrame {
    public ExemploFlowLayout() {
        super("Frame com FlowLayout");
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        this.setSize(320,120);
        Container container = this.getContentPane();

        container.add(b1);
        container.add(b2);
        container.add(b3);

        container.setLayout(new java.awt.FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);
    }
}