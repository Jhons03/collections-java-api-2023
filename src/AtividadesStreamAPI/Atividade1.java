package AtividadesStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Atividade1 {

    public static void main(String[] args) {
        //Desafio 1 - Mostre a lista na ordem numérica:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosOrdenados = numeros.stream().sorted(Integer::compareTo).toList();
        System.out.println(numerosOrdenados);
    }
}

class Ativida2 {
    public static void main(String[] args) {
        //Desafio 2 - Imprima a soma dos números pares da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> resultado = numeros.stream().filter(numero -> numero % 2 == 0).toList();
        int soma = resultado.stream().reduce(0, Integer::sum);
        System.out.println(soma);
    }
}

class Atividade3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().filter(n -> n > 0).forEach(System.out::println);
    }
}
