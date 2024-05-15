package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(Set<Convidado> convidadosSet) {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        Convidado conv = new Convidado(nome, codigoConvite);
        convidadosSet.add(conv);
    }

}
