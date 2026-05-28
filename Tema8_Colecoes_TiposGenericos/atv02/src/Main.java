public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Carol");
        Contato contato2 = new Contato("Marcos");
        Contato contato3 = new Contato("Fabiane");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        agenda.listarContatos();
        agenda.removerContato(contato2);
        agenda.listarContatos();
    }
}
