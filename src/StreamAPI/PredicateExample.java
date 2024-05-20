package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "python", "kotlin", "C#", "ruby", "dart", "javascript", "go");
        //predicate raiz
        Predicate<String> palavrasSelecionadas = n -> n.length() > 5;

        //criei um filtro com o predicate
        palavras.stream().filter(n -> n.length() > 5).forEach(System.out::println);


    }
}
