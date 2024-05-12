public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    // ajusta o retorno para mostrar o texto e não o local armazenado
    @Override
    public String toString() {
        return descricao;
    }
}
