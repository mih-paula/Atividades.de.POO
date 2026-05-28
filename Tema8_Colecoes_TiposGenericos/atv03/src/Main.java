public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        Tarefa tarefa1 = new Tarefa("Lavar-louça");
        Tarefa tarefa2 = new Tarefa("Limpar casa");
        Tarefa tarefa3 = new Tarefa("Lavar roupas");

        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);
        lista.adicionarTarefa(tarefa3);

        lista.listarTarefas();
        lista.removerTarefa(tarefa1);
        lista.listarTarefas();
    }
}