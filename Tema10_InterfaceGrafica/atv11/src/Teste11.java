import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Teste11 extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoSenha;


    public Teste11() {
        super("Testando JTextField e JPasswordField");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        campoTexto1 = new JTextField(10);
        container.add(campoTexto1);

        campoTexto2 = new JTextField("Digite seu texto aqui:");
        container.add(campoTexto2);

        campoTexto3 = new JTextField("Campo de texto não editável", 20);
        campoTexto3.setEditable(false);
        container.add(campoTexto3);

        campoSenha = new JPasswordField("Texto oculto");
        container.add(campoSenha);

        GerenciadorTextField gerenteTexto = new GerenciadorTextField();

        campoTexto1.addActionListener(gerenteTexto);
        campoTexto2.addActionListener(gerenteTexto);
        campoTexto3.addActionListener(gerenteTexto);
        campoSenha.addActionListener(gerenteTexto);

        setSize(360, 120);
        setLocationRelativeTo(null); // Centraliza na tela
        setVisible(true);
    }

    private class GerenciadorTextField implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            String stringExibicao = "";

            if (evento.getSource() == campoTexto1) {
                stringExibicao = "campoTexto1: " + evento.getActionCommand();
            }
            else if (evento.getSource() == campoTexto2) {
                stringExibicao = "campoTexto2: " + evento.getActionCommand();
            }
            else if (evento.getSource() == campoTexto3) {
                stringExibicao = "campoTexto3: " + evento.getActionCommand();
            }
            else if (evento.getSource() == campoSenha) {
                JPasswordField senha = (JPasswordField) evento.getSource();

                stringExibicao = "campoSenha: " + new String(senha.getPassword());
            }

            JOptionPane.showMessageDialog(null, stringExibicao);
        }
    }

}