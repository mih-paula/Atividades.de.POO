package View;


import Controller.PessoaController;
import Model.Pessoa;

import javax.swing.*;


public class JanelaCadastrarPessoa extends JFrame {
    private PessoaController controller;
    private JLabel labelNome;
    private JButton botaoCadastrar;
    private JButton botaoConsultar;
    private JTextField textoNome;
    private JTextArea textoResultado;


    private JLabel labelId;
    private JTextField textoId;
    private JButton botaoAtualizar;
    private JButton botaoExcluir;


    public JanelaCadastrarPessoa() {
        this.controller = new PessoaController();
        initComponents();
    }


    private void initComponents() {
        labelId = new JLabel();
        textoId = new JTextField();
        labelNome = new JLabel();
        textoNome = new JTextField();

        botaoCadastrar = new JButton();
        botaoConsultar = new JButton();
        botaoAtualizar = new JButton();
        botaoExcluir = new JButton();
        textoResultado = new JTextArea();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de pessoa");
        setLayout(null);


        labelId.setText("ID:");
        labelId.setBounds(30, 20, 60, 25);
        add(labelId);

        textoId.setBounds(90, 20, 180, 25);
        add(textoId);


        labelNome.setText("Nome:");
        labelNome.setBounds(30, 55, 60, 25);
        add(labelNome);

        textoNome.setColumns(20);
        textoNome.setBounds(90, 55, 180, 25);
        add(textoNome);


        //botão cadastrar
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(evt -> {
            String nome = textoNome.getText();
            controller.cadastrarPessoa(nome);
            JOptionPane.showMessageDialog(
                    this, "Pessoa cadastrada com sucesso!"
            );
        });
        botaoCadastrar.setBounds(30, 110, 110, 30);
        add(botaoCadastrar);


        //botão consultar
        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(evt -> {
            String nome = textoNome.getText();
            Pessoa pessoa = controller.consultarPessoa(nome);
            if (pessoa != null) {
                textoResultado.setText(
                        "id: " + pessoa.getId()
                                + "\nNome: " + pessoa.getNome());
            } else {
                textoResultado.setText("Pessoa não encontrada!");
            }
        });

        botaoConsultar.setBounds(160, 110, 110, 30);
        add(botaoConsultar);

        //botão de atualizar
        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(evt -> {
            try {
                int id = Integer.parseInt(textoId.getText());
                String nome = textoNome.getText();

                controller.atualizarPessoa(id, nome);
                JOptionPane.showMessageDialog(this, "Pessoa atualizada com sucesso!");
                textoResultado.setText("Dados atualizados!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um ID numérico válido para atualizar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        botaoAtualizar.setBounds(30, 140, 110, 30);
        add(botaoAtualizar);


        //botão de excluir
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(evt -> {
            try {
                int id = Integer.parseInt(textoId.getText());

                controller.excluirPessoa(id);
                JOptionPane.showMessageDialog(this, "Pessoa excluída com sucesso!");

                textoId.setText("");
                textoNome.setText("");
                textoResultado.setText("Registro excluído!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um ID numérico válido para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        botaoExcluir.setBounds(160, 140, 110, 30);
        add(botaoExcluir);


        textoResultado.setColumns(20);
        textoResultado.setRows(5);
        textoResultado.setBounds(30, 190, 240, 100);
        add(textoResultado);

        setSize(330, 350);
        setLocationRelativeTo(null);
    }

}

