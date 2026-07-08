package model;

public class Medicao {
    private int id;
    private double valor;
    private String unidade;
    private String dataHora;


    public Medicao() {
    }

    public Medicao(int id, double valor, String unidade, String dataHora){
        this.id=id;
        this.valor=valor;
        this.unidade=unidade;
        this.dataHora= dataHora;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }



    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor=valor;
    }


    public String getUnidade(){
        return unidade;
    }
    public void setUnidade(String unidade){
        this.unidade=unidade;
    }


    public String getDataHora(){
        return dataHora;
    }
    public void setDataHora(String dataHora){
        this.dataHora=dataHora;
    }


    public void medir(Sensor sr){
        System.out.println("Medir sensor: " + sr.getId() + " - " + sr.getCodigo() + " - " + sr.getTipo() + " - " + sr.getLocalizacao());    }
}
