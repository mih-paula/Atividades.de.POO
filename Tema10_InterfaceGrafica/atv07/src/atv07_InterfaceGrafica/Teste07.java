package atv07_InterfaceGrafica;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Teste07 extends JFrame {

    private final JLabel label;
    private final Icon icone;

    public Teste07() {
        super("Testando JLabel");

        icone = new ImageIcon(Teste07.class.getResource("borbo1.jpg"));

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label = new JLabel();
        label.setText("Label com ícone e texto com alinhamento inferior (BOTTOM)");
        label.setIcon(icone);

        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setToolTipText("Este é o label");

        container.add(label);

        setSize(500, 300);
        setVisible(true);
    }

}