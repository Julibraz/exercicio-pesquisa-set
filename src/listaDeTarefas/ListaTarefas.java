package listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void addTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                tarefaRemover = t;
                break;
            }
        }
        if (tarefaRemover != null) {
            tarefas.remove(tarefaRemover);
            System.out.println("Tarefa removida: " + descricao);
        } else {
            System.out.println("Tarefa não encontrada: " + descricao);
        }
    }

    public void exibirTarefas(){
        for(Tarefa t : this.tarefas){
            System.out.println(t.getDescricao());
        }
    }

    public int contarTarefas(){
        return this.tarefas.size();
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefas){
            if(t.getDescricao().equals(descricao)){
                t.setFeita(true);
            }
        }
        if(!tarefas.contains(descricao)){
            System.out.println("Tarefa não encontrada: " + descricao);
        }
        else if(tarefas.contains(descricao)){
            System.out.println("Tarefa marcada como concluída: " + descricao);
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefas){
            if(t.getDescricao().equals(descricao)){
                t.setFeita(false);
            }
        }
        if(!tarefas.contains(descricao)){
            System.out.println("Tarefa não encontrada: " + descricao);
        }
        else if(tarefas.contains(descricao)){
            System.out.println("Tarefa marcada como pendente: " + descricao);
        }
    }

    public void exibirtarefasConcluidas(){
        for(Tarefa t : tarefas){
            if(t.getFeita()){
                System.out.println(t.getDescricao());
            }
        }
    }

    public void exibirTarefasPendentes(){
        for(Tarefa t : tarefas){
            if(!t.getFeita()){
                System.out.println(t.getDescricao());
            }
        }
    }

    public void limparListaTarefas(){
        this.tarefas.clear();
    }
}
