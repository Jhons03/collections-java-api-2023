package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Set<Contato> atualizarNumeroContato(String nome, int novoNumero){
        Set<Contato> contatoAtualizado = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado.add(c);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Edson", 973540894);
        agenda.adicionarContato("Mel", 971234568);
        agenda.adicionarContato("Shirley", 971234569);
        agenda.adicionarContato("Billy", 971234510);
        agenda.adicionarContato("Aline", 971234511);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Shirley"));
        System.out.println(agenda.atualizarNumeroContato("Shirley", 975130981));
    }
}
