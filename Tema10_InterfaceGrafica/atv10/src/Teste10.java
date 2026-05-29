import javax.swing.SwingUtilities;
import javax.swing.*;

public class Teste10 extends JFrame {
    private JLabel labelCodigo;
    private JLabel labelNome;
    private JLabel labelEmail;
    private JTextField fieldCodigo;
    private JTextField fieldNome;
    private JTextField fieldEmail;
    private JButton buttonCadastrar;


    public Teste10() {
        initComponents();
    }

    private void initComponents() {
        labelCodigo = new JLabel();
        labelNome = new JLabel();
        labelEmail = new JLabel();

        fieldCodigo = new JTextField();
        fieldNome = new JTextField();
        fieldEmail = new JTextField();

        buttonCadastrar = new JButton();

        this.setTitle("Cadastrar Cliente");
        this.setSize(400, 300);
        this.setResizable(false); // Impede o redimensionamento da janela
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.getContentPane().setLayout(null);

        labelCodigo.setText("Código:");
        labelCodigo.setBounds(30, 30, 70, 20);
        this.add(labelCodigo);

        labelNome.setText("Nome:");
        labelNome.setBounds(30, 80, 70, 20);
        this.add(labelNome);

        labelEmail.setText("Email:");
        labelEmail.setBounds(30, 130, 70, 20);
        this.add(labelEmail);

        fieldCodigo.setBounds(90, 30, 50, 20);
        fieldCodigo.setEnabled(false); // Torna o campo somente leitura
        this.add(fieldCodigo);

        fieldNome.setBounds(90, 80, 250, 20);
        this.add(fieldNome);

        fieldEmail.setBounds(90, 130, 250, 20);
        this.add(fieldEmail);

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setBounds(90, 180, 120, 25);
        this.add(buttonCadastrar);

        this.setVisible(true);
    }
}