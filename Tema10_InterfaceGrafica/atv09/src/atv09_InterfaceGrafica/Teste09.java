package atv09_InterfaceGrafica;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Teste09 extends JFrame {

    private JButton botao1, botao2;
    private Icon borbo2;

    private final String strIcone = "comando_icone";
    private final String strFinalizar = "Finalizar";

    public Teste09() {
        super("Testando Botões");

        borbo2 = new ImageIcon(Teste09.class.getResource("borbo1.jpg"));
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        botao1 = new JButton("Botão Java", borbo2);
        botao1.setToolTipText("Pressione o botão");
        botao1.setActionCommand(strIcone);
        container.add(botao1);

        botao2 = new JButton(strFinalizar);
        botao2.setToolTipText("Finaliza o programa");

        container.add(botao2);


        GerenciadorBotoes gestorBotoes = new GerenciadorBotoes();


        botao1.addActionListener(gestorBotoes);
        botao2.addActionListener(gestorBotoes);


        setSize(545, 280);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Garante o encerramento padrão no 'X'
        setVisible(true);
    }


    private class GerenciadorBotoes implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {


            if (event.getActionCommand().equals(strIcone)) {
                JOptionPane.showMessageDialog(Teste09.this, "Você pressionou: botão associado a uma imagem");
            }
            else if (event.getActionCommand().equals(strFinalizar)) {

                System.exit(0);
            }
        }
    }

}