package Function;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class Ejemplo2 {
        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));

            Function<List<Integer>, Integer> sumarNumeros = lista ->
                    lista.stream()
                            .mapToInt(Integer::intValue)
                            .sum();

            int resultado = sumarNumeros.apply(numeros);

            System.out.println("Lista de números: " + numeros);
            System.out.println("Suma: " + resultado);
        }
    }
