import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros = new ArrayList<>();

    private void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            soma += i;
        }
        return soma;
    }
    private int encontrarMaiorNumero() {
        int maior = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) > maior) {
                maior = listaNumeros.get(i);
            }
        }
        return maior;
    }
    private int encontrarMenorNumero() {
        int menor = 100;
        for (int i = 0 ; i < listaNumeros.size(); i++){
            if (listaNumeros.get(i) < menor) {
                menor = listaNumeros.get(i);
            }
        }
        return menor;
    }
    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(4);


        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        somaNumeros.exibirNumeros();
    }
}
