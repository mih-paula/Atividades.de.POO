package Controller;

import dao.SensorDao;
import model.Sensor;

public class SensorController {
    private SensorDao dao = new SensorDao();

    public void cadastrarSensor(int id){
        Sensor sensor = new Sensor();
        sensor.setId(id);
        dao.inserir(sensor);
    }

    public Sensor consultar(String codigo){
        return dao.consultarPorCodigo(codigo);
    }

}
