import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList = new ArrayList<>();

    private void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenadoPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public void exibirLista(){
        System.out.println(pessoaList);
    }

    public static void main(String[] args) {
        OrdenacaoPessoa novaPessoa = new OrdenacaoPessoa();
        novaPessoa.adicionarPessoa("Edson", 37, 1.80);
        novaPessoa.adicionarPessoa("Shirley", 38, 1.54);
        novaPessoa.adicionarPessoa("Mel", 17, 1.67);
        novaPessoa.adicionarPessoa("Billy", 2, 0.80);

        System.out.println(novaPessoa.ordenadoPorAltura());
        novaPessoa.exibirLista();

    }



}



