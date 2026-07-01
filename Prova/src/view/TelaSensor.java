package view;

import Controller.SensorController;
import model.Sensor;
import javax.swing.*;

public class TelaSensor extends JFrame{
    private SensorController controller;
    private JLabel labelcodigo;
    private JButton botaoCadastrar;
    private JTextField botaoConsultar;
    private JTextArea textoCodigo;
    private JTextArea textoResultado;

public TelaSensor(){
    this.controller = new SensorController();
    initCompenents();
}
    private void initCompenents(){
labelId = new JLabel();
textoId = new JTextField();
labelcodigo = new JLabel();
textoCodigo = new JTextField();
labelTipo = new JLabel();
textoTipo = newJTextField();
