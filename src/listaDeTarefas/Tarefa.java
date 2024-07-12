package listaDeTarefas;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean feita = false;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //getters e setters
    public String getDescricao() {
        return this.descricao;
    }

    public boolean getFeita() {
        return this.feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }
}
