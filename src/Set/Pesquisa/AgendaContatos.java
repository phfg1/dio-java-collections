package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String name, int number) {
        contatosSet.add(new Contato(name, number));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisaPorNome(String name) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatosSet) {
            if(c.getName().startsWith(name)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String name, int newNumber) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if(c.getName().equalsIgnoreCase(name)){
                c.setNumber(newNumber);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pedro 2", 1234567);
        agendaContatos.adicionarContato("Pedro H", 1234);
        agendaContatos.adicionarContato("Pedro F", 12567);
        agendaContatos.adicionarContato("Pedro G", 34567);
        agendaContatos.adicionarContato("Pedro FG", 13457);
        agendaContatos.adicionarContato("Pedro H", 12356);

        agendaContatos.exibirContatos();

        agendaContatos.pesquisaPorNome("H");


        agendaContatos.atualizarNumeroContato("Pedro 2", 555555);

        agendaContatos.exibirContatos();

    }

}