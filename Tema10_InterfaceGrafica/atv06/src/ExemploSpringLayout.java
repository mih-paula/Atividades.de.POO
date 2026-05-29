import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class ExemploSpringLayout extends JFrame {

    // Construtor da Classe
    public ExemploSpringLayout() {
        // Define o título da janela
        super("Exemplo SpringLayout");

        // Instancia o SpringLayout
        SpringLayout layout = new SpringLayout();

        // Obtenha o container da janela
        Container c = getContentPane();

        // Defina o layout do container
        c.setLayout(layout);

        // Criar os Componentes
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");

        // Adicione os botões ao container
        c.add(botao1);
        c.add(botao2);

        // --- Definir as Restrições do Botão 1 ---
        // Posicionamento Vertical: 20 pixels da borda superior da janela
        layout.putConstraint(SpringLayout.NORTH, botao1, 20, SpringLayout.NORTH, c);

        // Posicionamento Horizontal: 30 pixels da borda esquerda da janela
        layout.putConstraint(SpringLayout.WEST, botao1, 30, SpringLayout.WEST, c);


        // --- Definir as Restrições do Botão 2 ---
        // Posicionamento Vertical: 20 pixels abaixo do Botão 1
        layout.putConstraint(SpringLayout.NORTH, botao2, 20, SpringLayout.SOUTH, botao1);

        // Alinhamento Horizontal: Alinhado à esquerda (0 pixels de distância) do Botão 1
        layout.putConstraint(SpringLayout.WEST, botao2, 0, SpringLayout.WEST, botao1);


        // Configurar a Janela
        this.setSize(400, 300); // Defina o tamanho da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerramento da aplicação
        this.setVisible(true); // Torne a janela visível
    }
}