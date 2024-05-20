package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        List<Integer> novaLista = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = novaLista.stream().reduce(0, Integer::sum);

        System.out.println("A soma do bloco de codigos é: " + resultado);

    }
}
