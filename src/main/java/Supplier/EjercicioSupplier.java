package Supplier;
import java.util.Random;
import java.util.function.Supplier;
public class EjercicioSupplier {
        public static void main(String[] args) {
            Supplier<Integer> numeroAleatorio = () -> {
                Random random = new Random(); // Crea una instancia de Random
                int limite = 10; // Define el límite superior (exclusive)
                int numero = random.nextInt(limite) + 1; // Genera un número aleatorio entre 1 y limite
                return numero;
            };

            // Obtener un número aleatorio
            int numero1 = numeroAleatorio.get();
            System.out.println("Número aleatorio 1: " + numero1);

            // Obtener otro número aleatorio
            int numero2 = numeroAleatorio.get();
            System.out.println("Número aleatorio 2: " + numero2);
        }
    }
