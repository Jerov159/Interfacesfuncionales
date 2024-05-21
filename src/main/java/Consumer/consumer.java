package Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class consumer {
        public static void main(String[] args) {
            List<String> nombres = new ArrayList<>(List.of("Juan", "María", "Pedro", "Ana", "Luis"));

            Consumer<List<String>> imprimirConFormato = lista -> {
                int linea = 1;
                for (String nombre : lista) {
                    System.out.println(linea + " - " + nombre);
                    linea++;
                }
            };

            imprimirConFormato.accept(nombres);
        }
    }
