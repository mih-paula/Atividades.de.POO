import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploGridLayout extends JFrame {

    public ExemploGridLayout() {
        super("Exemplo GridLayout (linhas x colunas)");

        // Configura o layout: 2 linhas, 3 colunas
        this.setLayout(new GridLayout(2, 3));

        // Adiciona os botões
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));

        // Configurações da Janela
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}