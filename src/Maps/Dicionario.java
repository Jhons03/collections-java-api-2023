package Maps;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo e seu constructor
    public Map<String, String> dicionario;
    public Dicionario() {
        this.dicionario = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if (!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }else {
            System.out.println("Nao tem palavra para remover.");
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionario);
    }
    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada = null;
        if (!dicionario.isEmpty()){
            palavraPesquisada = dicionario.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();
        d.adicionarPalavra("Correr", "locomover em uma velocidade superior ao andar");
        d.adicionarPalavra("Falar", "Uso da cordas vocais para emitir um som que se transforma em uma fala.");
        d.adicionarPalavra("Correr", "locomover em uma velocidade superior ao andar");

        d.exibirPalavras();



    }


}
