package Maps;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> quantidadePalavrasMap;

    public ContagemPalavras() {
        this.quantidadePalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        quantidadePalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        String palavraRemover;
        if (!quantidadePalavrasMap.isEmpty()){
            quantidadePalavrasMap.remove(palavra);
        }
    }
    public void exibirContagemPalavras(){
        System.out.println(quantidadePalavrasMap);
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraEncontrada = null;
        int maiorContagem = 0;
        if (!quantidadePalavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry : quantidadePalavrasMap.entrySet()){
                if (entry.getValue() > maiorContagem){
                    palavraEncontrada = entry.getKey();
                    maiorContagem = entry.getValue();
                }
            }
        }
        return palavraEncontrada;
    }

    public static void main(String[] args) {
        ContagemPalavras novaContagem = new ContagemPalavras();

        novaContagem.adicionarPalavra("baby", 3);
        novaContagem.adicionarPalavra("my", 5);
        novaContagem.adicionarPalavra("love", 7);
        novaContagem.adicionarPalavra("see", 6);

        novaContagem.exibirContagemPalavras();
        novaContagem.removerPalavra("see");
        novaContagem.exibirContagemPalavras();
        System.out.println(novaContagem.encontrarPalavraMaisFrequente());


    }



}
