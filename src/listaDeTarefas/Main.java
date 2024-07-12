package listaDeTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.addTarefa("Estudar Java");
        lista.addTarefa("Estudar C++");
        lista.addTarefa("Estudar C#");
        lista.addTarefa("Estudar C");
        lista.addTarefa("Estudar Python");
        lista.addTarefa("Estudar JavaScript");

        lista.exibirTarefas();

        System.out.println("Lista de tarefas concluidas: ");
        lista.exibirtarefasConcluidas();
        System.out.println();

        System.out.println("Lista de tarefas pendentes: ");
        lista.exibirTarefasPendentes();
        System.out.println();

        System.out.println("Removendo tarefa...");
        lista.removerTarefa("Estudar C++");
        lista.removerTarefa("Estudar Python");
        System.out.println();

        System.out.print("Quantidade de tarefas: " + lista.contarTarefas());
        System.out.println();

        System.out.println("Marcando tarefas como concluidas...");
        lista.marcarTarefaConcluida("Estudar Java");
        lista.marcarTarefaConcluida("Estudar JavaScript");
        System.out.println();

        System.out.println("Tarefas concluidas: ");
        lista.exibirtarefasConcluidas();
        System.out.println();

        System.out.println("Todas as tarefas: ");
        lista.exibirTarefas();

        lista.limparListaTarefas();

    }
}
