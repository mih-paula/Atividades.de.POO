public class Cachorro extends Animal{
    private String porte;


    public Cachorro(String nome, int idade, String porte){
        super(nome, idade);
        this.porte = porte;
    }

    public String getPorte(){
        return porte;
    }
    public void setPorte(){
        this.porte = porte;
    }

    public void correr(){
        System.out.println(nome + " está correndo...");
    }
    public void correr(int distaciaPercorrida){
        System.out.println(nome + " está correndo a: "+ distaciaPercorrida + "km/h");
    }
}
