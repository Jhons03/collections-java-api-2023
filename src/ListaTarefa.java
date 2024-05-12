import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        // lista vazia para adicionar as descrições que vou remover
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            // adiciona as tarefas que for igual na lista criada
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        // remove da lista original todos os itens que estão na lista tarefasParaRemover
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void imprimirTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("carro");
        listaTarefa.adicionarTarefa("moto");
        System.out.println("O numero de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("moto");
        listaTarefa.imprimirTarefa();


    }


}
