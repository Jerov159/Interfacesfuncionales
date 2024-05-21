package Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Ejemplo2 {

        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

            Consumer<List<Integer>> imprimirMultiplosDe3 = lista -> {
                for (Integer numero : lista) {
                    if (numero % 3 == 0) {
                        System.out.println(numero);
                    }
                }
            };

            imprimirMultiplosDe3.accept(numeros);
        }
    }

