package App;

import view.TelaMedicao;
import view.TelaSensor;

public class Main {
    public static void main(String[] args){
        TelaSensor janela1 = new TelaSensor();
        janela1.setVisible(true);

        TelaMedicao janela2 = new TelaMedicao();
        janela2.setVisible(true);
    }
}
