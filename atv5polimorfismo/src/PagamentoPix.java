public class PagamentoPix extends Pagamento{


    public PagamentoPix(double valor){
        super(valor);
    }

    @Override
    public void processarPagamento(){
        System.out.println(" Pagamento de R$ " + valor + " realizado com pix. ");
    }
}
