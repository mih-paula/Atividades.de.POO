public class Main {
    public static void main(String[] arg){
        Pagamento p1 = new PagamentoPix(145.00);
        Pagamento p2 = new PagamentoCartao(150.00);


        p1.processarPagamento();

        p2.processarPagamento();
    }
}
