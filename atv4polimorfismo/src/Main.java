public class Main {
    public static void main(String[] arg){
        Veiculo v1 = new Carro("Fiat Uno");
        Veiculo v2 = new Bicicleta("Caliu");

        System.out.println("Modelo: " + v1.modelo);
        v1.mover();


        System.out.println("Modelo: " + v2.modelo);
        v2.mover();
    }
}
