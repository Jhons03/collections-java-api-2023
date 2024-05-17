package Maps;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo e seu metodo
    public Map<String , String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    //functions
    private void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    private void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("A lista esta vazia.");
        }
    }
    private void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            System.out.println("A lista esta vazia.");
        }

    }

        private String pesquisarPorPalavra(String palavra){
            String palavraSelecionada = null;
            if(!dicionarioMap.isEmpty()){
                palavraSelecionada = dicionarioMap.get(palavra);
                }else{
                System.out.println("A lista esta vazia.");
            }
            return palavraSelecionada == null? "A palavra não foi encontrada" : palavraSelecionada;
        }

    public static void main(String[] args) {
        Dicionario novoDicionario = new Dicionario();

        novoDicionario.exibirPalavras();
        novoDicionario.adicionarPalavra("amor", "sentimento de felicidade extrema");
        novoDicionario.adicionarPalavra("cantar", "ato de falar de forma armônica com tons de voz diferente");
        novoDicionario.adicionarPalavra("ir", "o mesmo que seguir em frente");
        novoDicionario.adicionarPalavra("beijar", "ato de caricia utilizando a boca");
        novoDicionario.exibirPalavras();
        novoDicionario.removerPalavra("cantar");
        System.out.println(novoDicionario.pesquisarPorPalavra("cantar"));
        System.out.println(novoDicionario.pesquisarPorPalavra("amor"));

    }

}
