package Supplier;
import java.util.Random;
import java.util.function.Supplier;
public class Supply {
        private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        private static final int LONGITUD_CONTRASENA = 8;

        public static void main(String[] args) {
            Supplier<String> generarContrasena = () -> {
                StringBuilder sb = new StringBuilder();
                Random random = new Random();

                for (int i = 0; i < LONGITUD_CONTRASENA; i++) {
                    int indice = random.nextInt(CARACTERES.length());
                    char caracter = CARACTERES.charAt(indice);
                    sb.append(caracter);
                }

                return sb.toString();
            };

            String contrasena = generarContrasena.get();
            System.out.println("Contraseña generada: " + contrasena);
        }
    }
