import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class Teste12 extends JFrame {
    private final JCheckBox checkB;
    private final JCheckBox checkI;
    private final JRadioButton rbotao1;
    private final JRadioButton rbotao2;
    private final JRadioButton rbotao3;
    private final ButtonGroup grupoRadio;
    private final JPanel painel1;
    private final JPanel painel2;

    public Teste12() {
        super("Testando CheckBox e RadioButton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        painel1 = new JPanel();
        painel2 = new JPanel();

        checkB = new JCheckBox("Bold");
        checkI = new JCheckBox("Itálico");

        painel1.add(checkB);
        painel1.add(checkI);

        container.add(painel1);

        rbotao1 = new JRadioButton("Plain", true);
        rbotao2 = new JRadioButton("Bold", false);
        rbotao3 = new JRadioButton("Itálico", false);

        painel2.add(rbotao1);
        painel2.add(rbotao2);
        painel2.add(rbotao3);

        container.add(painel2);

        grupoRadio = new ButtonGroup();
        grupoRadio.add(rbotao1);
        grupoRadio.add(rbotao2);
        grupoRadio.add(rbotao3);

        Gerenciador gerente = new Gerenciador();

        checkB.addItemListener(gerente);
        checkI.addItemListener(gerente);
        rbotao1.addItemListener(gerente);
        rbotao2.addItemListener(gerente);
        rbotao3.addItemListener(gerente);

        setSize(320, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class Gerenciador implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            Object src = event.getSource();

            boolean selecionado = event.getStateChange() == ItemEvent.SELECTED;

            SwingUtilities.invokeLater(() -> {

                if (src == checkB) {
                    if (selecionado) {
                        JOptionPane.showMessageDialog(Teste12.this, "Checkbox Bold selecionado");
                    } else {
                        JOptionPane.showMessageDialog(Teste12.this, "Checkbox Bold desmarcado");
                    }
                }
                else if (src == checkI) {
                    if (selecionado) {
                        JOptionPane.showMessageDialog(Teste12.this, "Checkbox Itálico selecionado");
                    } else {
                        JOptionPane.showMessageDialog(Teste12.this, "Checkbox Itálico desmarcado");
                    }
                }


                else if (src == rbotao1 && selecionado) {
                    JOptionPane.showMessageDialog(Teste12.this, "Radio Plain selecionado");
                }
                else if (src == rbotao2 && selecionado) {
                    JOptionPane.showMessageDialog(Teste12.this, "Radio Bold selecionado");
                }
                else if (src == rbotao3 && selecionado) {
                    JOptionPane.showMessageDialog(Teste12.this, "Radio Itálico selecionado");
                }
            });
        }
    }
}