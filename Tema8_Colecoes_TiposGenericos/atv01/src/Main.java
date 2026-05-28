public class Main {
    public static void main(String[] args){
        ListaCompras lista = new ListaCompras();
        Item item1 = new Item("Tomate");
        Item item2 = new Item("Beterraba");
        Item item3 = new Item("Cenoura");
        Item item4 = new Item("Abacate");



        lista.adicionarItem(item1);
        lista.adicionarItem(item2);
        lista.adicionarItem(item3);


        lista.mostraLista();
        lista.removerItem(item3);
        lista.mostraLista();

        lista.adicionarItem(item4);
        lista.mostraLista();


    }
}
