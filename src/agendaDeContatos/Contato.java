package agendaDeContatos;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int telefone;

    //construtor
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getTelefone() == contato.getTelefone();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTelefone());
    }

    @Override
    public String toString() {
        return "Contato: " +
                "nome= '" + nome + '\'' +
                ", telefone= '" + telefone + "\n";
    }
}
