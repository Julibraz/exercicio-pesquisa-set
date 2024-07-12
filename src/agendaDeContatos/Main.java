package agendaDeContatos;

public class Main {
    public static void main(String[] args) {
        AgendaDeContatos agenda = new AgendaDeContatos();

        agenda.addContato("João", 12345678);
        agenda.addContato("Maria", 87654321);
        agenda.addContato("Pedro", 13579246);
        agenda.addContato("Maria 2", 98765432);
        agenda.addContato("Lucas", 24681357);
        agenda.addContato("Lucas Lima", 24681355);

        agenda.exibirContatos();

        agenda.pesquisarPorNome("Maria");

        agenda.atualizarNumero("Lucas", 24681355, 98745632);

        agenda.exibirContatos();
    }
}