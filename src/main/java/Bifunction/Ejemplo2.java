package Bifunction;
import java.util.function.BiFunction;
public class Ejemplo2 {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> multiplicar = (a, b) -> a * b;

            int resultado = multiplicar.apply(5, 3);
            System.out.println("Resultado: " + resultado); // Imprime: Resultado: 15
        }
    }

