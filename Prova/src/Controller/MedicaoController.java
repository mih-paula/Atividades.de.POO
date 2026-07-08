package Controller;

import dao.MedicaoDao;
import model.Medicao;

public class MedicaoController {

    private MedicaoDao dao = new MedicaoDao();

    public void cadastrarMedicao(int id, double valor, String unidade, String dataHora){
        Medicao medicao = new Medicao(id, valor, unidade, dataHora);
        dao.inserir(medicao);
    }

    public Medicao consultar(int id){
        return dao.consultarPorId(id);
    }
}