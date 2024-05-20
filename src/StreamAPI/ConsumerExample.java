package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * Representa uma operação que aceita um argumento do tipo T(você defini o tipo) e não retorna nenhum resultado
 * É utilizada principalemte para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar
 * ou retornar um valor
 */


public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //usar o consumer com expressão lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        numeros.forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.println(n);
                    }
                }
        );
    }


}
