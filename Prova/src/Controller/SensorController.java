package Controller;

import dao.SensorDao;
import model.Sensor;

public class SensorController {
    private SensorDao dao = new SensorDao();

    public void cadastrarSensor(int id, String codigo, String tipo, String localizacao){
        Sensor sensor = new Sensor(id, codigo, tipo, localizacao);
        dao.inserir(sensor);
    }

    public Sensor consultar(String codigo){
        return dao.consultarPorCodigo(codigo);
    }
}