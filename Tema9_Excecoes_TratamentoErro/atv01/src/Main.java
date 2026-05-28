import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(100.0, 500.0);

        try {
            conta.deposita(-50.0); // valor inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }


        try {
            conta.deposita(0); // também inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }


        try {
            conta.deposita(200.0); // valor válido
            System.out.println("Depósito realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }
        System.out.println("Saldo atual: " + conta.getSaldo());


    }
}
