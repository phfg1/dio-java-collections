package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContatos(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroProNome = null;
        if(!agendaContatoMap.isEmpty()) {
           numeroProNome = agendaContatoMap.get(nome);
        }
        return numeroProNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 1456);
        agendaContatos.adicionarContato("Pedro Henrique", 1234);
        agendaContatos.adicionarContato("Pedro Ferreira", 123456);
        agendaContatos.adicionarContato("Carlos Augusto", 123456);
        agendaContatos.adicionarContato("Pedro", 12346);

        agendaContatos.exibirContatos();

        agendaContatos.removerContatos("Carlos Augusto");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Pedro Ferreira"));
    }


}
