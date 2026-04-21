public class Main {
    public static void main(String[] arg){
        Forma f1 = new Circulo("Circulo", 3);
        Forma f2 = new Retangulo("Retangulo" ,  8, 7);


        System.out.println("Área do " + f1.nome + ": " + f1.calcularArea());
        System.out.println("Área do " + f2.nome + ": " + f2.calcularArea());


    }
}
