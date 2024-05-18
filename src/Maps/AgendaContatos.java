package Maps;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributo e seu construtor
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<String, Integer>();
    }

    private void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    private void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else {
            System.out.println("A lista esta vazia.");
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer contatoPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            contatoPorNome = agendaContatoMap.get(nome);
        }else {
            System.out.println("A lista esta vazia.");
        }
        return contatoPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos novaAgenda = new AgendaContatos();
        novaAgenda.removerContato("Silva");
        novaAgenda.adicionarContato("Edson", 973540894);
        novaAgenda.adicionarContato("Billy", 999998888);
        novaAgenda.adicionarContato("Shirley", 975130981);
        novaAgenda.adicionarContato("Billy", 999998888);

        novaAgenda.exibirContatos();
        System.out.println(novaAgenda.pesquisarPorNome("Edson"));
        novaAgenda.removerContato("Billy");
        novaAgenda.exibirContatos();
    }

}
