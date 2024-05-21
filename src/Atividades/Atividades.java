package Atividades;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;


public class Atividades {
    static class Atividade1{
        public static void main(String[] args) {
            //Desafio 1 - Mostre a lista na ordem numérica:
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            List<Integer> numerosOrdenados = numeros.stream().sorted(Integer::compareTo).toList();
            System.out.println(numerosOrdenados);
        }
    }
    static class Ativida2 {
        public static void main(String[] args) {
            //Desafio 2 - Imprima a soma dos números pares da lista:
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            List<Integer> resultado = numeros.stream().filter(numero -> numero % 2 == 0).toList();
            int soma = resultado.stream().reduce(0, Integer::sum);
            System.out.println(soma);
        }
    }

    static class Atividade3 {
        //Desafio 3 - Verifique se todos os números da lista são positivos:
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            numeros.stream().filter(n -> n > 0).forEach(System.out::println);
        }
    }
    static class Atividade4 {
        //Remova todos os valores ímpares e imprima os valores restantes
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            numeros.stream().filter(numero -> numero % 2 == 0).toList().forEach(System.out::println);

        }
    }
    static class Atividade5 {
        //Calcule a média dos números maiores que 5:
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            double maiores = numeros.stream()
                    //filtra os valores maiores que 5
                    .filter(n -> n > 5)
                    //transformar em double os itens da lista
                    .mapToDouble(n ->n.doubleValue())
                    //calcula a media
                    .average()
                    //coloca uma tratamento caso nao encontre uma media
                    .orElseThrow(() -> new NoSuchElementException("sem possibilidade de calcular"));
            System.out.println("A média encontrada foi: " + maiores);
        }
    }
    static class Atividade6 {
        //Verificar se a lista contém algum número maior que 10
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            boolean res = numeros.stream()
                    .allMatch(n -> n > 10);
            System.out.println(res ?  "Tem maior que 10" : "não tem");
        }
    }
    static class Atividade7 {
        // Encontrar o segundo maior da lista
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            numeros.stream()
                    //remove os numeros duplicados
                    .distinct()
                    //coloca em ordem reversa
                    .sorted(Comparator.reverseOrder())
                    //pula o primeiro item
                    .skip(1)
                    //limito a minha lista a 1 item
                    .limit(1)
                    .forEach(i -> System.out.print("O segundo maior numero é: " + i));

        }
    }
}

