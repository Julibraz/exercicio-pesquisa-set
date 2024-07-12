package agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    //atributo
    private Set<Contato> contatos;

    public AgendaDeContatos() {
        this.contatos = new HashSet<>();
    }

   public void addContato(String nome, int telefone){
        contatos.add(new Contato(nome, telefone));
   }

   public void exibirContatos(){
       System.out.println(contatos);
   }

   public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatos){
            //startsWith, vai retornar qualquer nome que seja iniciado com o nome informado
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
   }

   public Contato atualizarNumero(String nome, int numero, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
   }

}
