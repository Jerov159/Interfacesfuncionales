package Predicate;
import java.util.function.Predicate;
public class predica {
        public static void main(String[] args) {
            Predicate<String> contieneDigito = str -> {
                for (char c : str.toCharArray()) {
                    if (Character.isDigit(c)) {
                        return true;
                    }
                }
                return false;
            };

            String cadena1 = "abc123";
            String cadena2 = "hola";

            System.out.println("¿Contiene dígito? " + cadena1 + ": " + contieneDigito.test(cadena1));
            System.out.println("¿Contiene dígito? " + cadena2 + ": " + contieneDigito.test(cadena2));
        }
    }
