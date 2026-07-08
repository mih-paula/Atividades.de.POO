package view;

import Controller.SensorController;
import model.Sensor;
import javax.swing.*;

public class TelaSensor extends JFrame {
    private SensorController controller;
    private JLabel labelId;
    private JTextField textoId;
    private JLabel labelCodigo;
    private JTextField textoCodigo;
    private JLabel labelTipo;
    private JTextField textoTipo;
    private JLabel labelLocalizacao;
    private JTextField textoLocalizacao;
    private JButton botaoSalvar;
    private JButton botaoConsultar;
    private JTextArea textoResultado;

    public TelaSensor() {
        controller = new SensorController();
        initComponents();
        setSize(320, 360);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        labelId = new JLabel();
        textoId = new JTextField();
        labelCodigo = new JLabel();
        textoCodigo = new JTextField();
        labelTipo = new JLabel();
        textoTipo = new JTextField();
        labelLocalizacao = new JLabel();
        textoLocalizacao = new JTextField();
        botaoSalvar = new JButton();
        botaoConsultar = new JButton();
        textoResultado = new JTextArea();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de Sensor");
        setLayout(null);

        labelId.setText("ID:");
        labelId.setBounds(30, 20, 80, 25);
        add(labelId);

        textoId.setBounds(110, 20, 160, 25);
        add(textoId);

        labelCodigo.setText("Código:");
        labelCodigo.setBounds(30, 55, 80, 25);
        add(labelCodigo);

        textoCodigo.setBounds(110, 55, 160, 25);
        add(textoCodigo);

        labelTipo.setText("Tipo:");
        labelTipo.setBounds(30, 90, 80, 25);
        add(labelTipo);

        textoTipo.setBounds(110, 90, 160, 25);
        add(textoTipo);

        labelLocalizacao.setText("Localização:");
        labelLocalizacao.setBounds(30, 125, 80, 25);
        add(labelLocalizacao);

        textoLocalizacao.setBounds(110, 125, 160, 25);
        add(textoLocalizacao);



        botaoSalvar.setText("Salvar");
        botaoSalvar.setBounds(30, 170, 110, 30);
        botaoSalvar.addActionListener(evt -> {
            try {
                int id = Integer.parseInt(textoId.getText());
                String codigo = textoCodigo.getText();
                String tipo = textoTipo.getText();
                String localizacao = textoLocalizacao.getText();

                controller.cadastrarSensor(id, codigo, tipo, localizacao);

                JOptionPane.showMessageDialog(this, "Sensor cadastrado com sucesso!");

                textoId.setText("");
                textoCodigo.setText("");
                textoTipo.setText("");
                textoLocalizacao.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um ID numérico válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(botaoSalvar);



        botaoConsultar.setText("Consultar");
        botaoConsultar.setBounds(160, 170, 110, 30);
        botaoConsultar.addActionListener(evt -> {
            String codigo = textoCodigo.getText();

            Sensor sensor = controller.consultar(codigo);

            if (sensor != null) {
                textoResultado.setText(
                        "ID: " + sensor.getId() +
                                "\nCódigo: " + sensor.getCodigo() +
                                "\nTipo: " + sensor.getTipo() +
                                "\nLocalização: " + sensor.getLocalizacao()
                );
            } else {
                textoResultado.setText("Sensor não encontrado!");
            }
        });
        add(botaoConsultar);

        textoResultado.setBounds(30, 215, 240, 80);
        textoResultado.setEditable(false);
        add(textoResultado);
    }
}