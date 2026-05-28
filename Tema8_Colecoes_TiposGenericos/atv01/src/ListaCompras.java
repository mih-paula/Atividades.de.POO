import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<Item> lista;


    public ListaCompras(){
        lista = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        lista.add(item);
        System.out.println("Item adicionados: " + item.getNome());
    }


    public void removerItem(Item item){
        lista.remove(item);
        System.out.println("Item excluido: " +item.getNome());

    }

    public void mostraLista(){
        System.out.println("Lista de compras");
        for(Item item : lista){
            System.out.println(item.getNome());
        }
    }
}
