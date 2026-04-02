public class Carro {
    String modelo;
    int ano;
    String cor;
    String placa;


     public void setModelo(String modelo){
          this.modelo=modelo;
     }
     public String getmodelo(){
          return modelo;
     }
     public void setAno(int ano){
          this.ano=ano;
     }
     public int getAno(){
          return ano;
     }
     public void setCor(String cor){
          this.cor=cor;
     }
     public String getCor(){
          return cor;
     }
    public void setPlaca(String placa) {
         this.placa = placa;
    }
    public String getPlaca() {
         return placa;
    }

    public void mostrarDadosCarro(){
        System.out.println("     Dados do carro    ");
        System.out.println("Modelo: " + getmodelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
    }

    public void Ligar(){
         System.out.println(getmodelo() + " ligada!");
    }
    public void Dirigir(){
         System.out.println(getmodelo() + " dirigindo...");
    }
    public void Acelerar(){
         System.out.println(getmodelo() + " acelerando, rum,  rum, rum ...");
    }

}
