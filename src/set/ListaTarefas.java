package set;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }
    public void adicionaTarefas(String descricao, boolean concluida) {
        Tarefa descricaoTarefa = new Tarefa(descricao, concluida);
        listaDeTarefas.add(descricaoTarefa);
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = t;
                break;
            }
        }
        listaDeTarefas.remove(tarefaRemover);
    }
    public void exibirTarefas() {
        if (!listaDeTarefas.isEmpty()) {
            System.out.println(listaDeTarefas);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public void contarTarefas(){
        System.out.println(listaDeTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaDeTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaDeTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : listaDeTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : listaDeTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas(){
        if (listaDeTarefas.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            listaDeTarefas.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas tarefasTrabalho = new ListaTarefas();

        tarefasTrabalho.adicionaTarefas("correr", false);
        tarefasTrabalho.adicionaTarefas("comer", false);
        tarefasTrabalho.adicionaTarefas("trabalhar", false);

        tarefasTrabalho.exibirTarefas();
        tarefasTrabalho.removerTarefa("comer");
        tarefasTrabalho.marcarTarefaConcluida("correr");
        tarefasTrabalho.exibirTarefas();
        tarefasTrabalho.limparListaTarefas();
    }


}
