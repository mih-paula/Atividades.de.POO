package view;

import Controller.MedicaoController;
import model.Medicao;
import javax.swing.*;

public class TelaMedicao extends JFrame {
    private MedicaoController controller;
    private JLabel labelId;
    private JTextField textoId;
    private JLabel labelValor;
    private JTextField textoValor;
    private JLabel labelUnidade;
    private JTextField textoUnidade;
    private JLabel labelDatahora;
    private JTextField textoDataHora;
    private JLabel labelSensor;
    private JTextField textoSensor;
    private JButton botaoSalvar;
    private JButton botaoConsultar;
    private JTextArea textoResultado;

    public TelaMedicao() {
        controller = new MedicaoController();
        initComponents();
        setSize(320, 400);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        labelId = new JLabel();
        textoId = new JTextField();
        labelValor = new JLabel();
        textoValor = new JTextField();
        labelUnidade = new JLabel();
        textoUnidade = new JTextField();
        labelDatahora = new JLabel();
        textoDataHora = new JTextField();
        labelSensor = new JLabel();
        textoSensor = new JTextField();
        botaoSalvar = new JButton();
        botaoConsultar = new JButton();
        textoResultado = new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de Medição");
        setLayout(null);

        labelId.setText("ID:");
        labelId.setBounds(30, 20, 80, 25);
        add(labelId);

        textoId.setBounds(110, 20, 160, 25);
        add(textoId);

        labelValor.setText("Valor:");
        labelValor.setBounds(30, 55, 80, 25);
        add(labelValor);

        textoValor.setBounds(110, 55, 160, 25);
        add(textoValor);

        labelUnidade.setText("Unidade:");
        labelUnidade.setBounds(30, 90, 80, 25);
        add(labelUnidade);

        textoUnidade.setBounds(110, 90, 160, 25);
        add(textoUnidade);

        labelDatahora.setText("Data/Hora:");
        labelDatahora.setBounds(30, 125, 80, 25);
        add(labelDatahora);

        textoDataHora.setBounds(110, 125, 160, 25);
        add(textoDataHora);

        labelSensor.setText("Sensor:");
        labelSensor.setBounds(30, 160, 80, 25);
        add(labelSensor);

        textoSensor.setBounds(110, 160, 160, 25);
        add(textoSensor);

        botaoSalvar.setText("Salvar");
        botaoSalvar.setBounds(30, 205, 110, 30);
        botaoSalvar.addActionListener(evt -> {
            try {
                int id = Integer.parseInt(textoId.getText());
                double valor = Double.parseDouble(textoValor.getText());
                String unidade = textoUnidade.getText();
                String dataHora = textoDataHora.getText();


                controller.cadastrarMedicao(id, valor, unidade, dataHora);

                JOptionPane.showMessageDialog(this, "Medição cadastrada com sucesso!");

                textoId.setText("");
                textoValor.setText("");
                textoUnidade.setText("");
                textoDataHora.setText("");
                textoSensor.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos para ID e Valor.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(botaoSalvar);

        botaoConsultar.setText("Consultar");
        botaoConsultar.setBounds(160, 205, 110, 30);
        botaoConsultar.addActionListener(evt -> {
            try {
                int codigoBusca = Integer.parseInt(textoId.getText());

                Medicao medicao = controller.consultar(codigoBusca);

                if (medicao != null) {
                    textoResultado.setText(
                            "ID: " + medicao.getId() +
                                    "\nValor: " + medicao.getValor() +
                                    "\nUnidade: " + medicao.getUnidade() +
                                    "\nData/Hora: " + medicao.getDataHora()
                    );
                } else {
                    textoResultado.setText("Medição não encontrada!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Insira um número de ID válido no campo 'ID' para consultar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        });
        add(botaoConsultar);

        textoResultado.setBounds(30, 250, 240, 80);
        textoResultado.setEditable(false);
        add(textoResultado);
    }
}