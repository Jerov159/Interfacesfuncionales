package Function;
import java.util.function.Function;
public class functi {

        public static void main(String[] args) {
            Function<String, Integer> evaluarOperacion = expresion -> {
                String[] partes = expresion.split("[+\\-*/]");
                int a = Integer.parseInt(partes[0].trim());
                int b = Integer.parseInt(partes[1].trim());
                char operador = expresion.charAt(partes[0].length());

                switch (operador) {
                    case '+':
                        return a + b;
                    case '-':
                        return a - b;
                    case '*':
                        return a * b;
                    case '/':
                        return a / b;
                    default:
                        throw new IllegalArgumentException("Operador inválido");
                }
            };

            String operacion1 = "5 + 3";
            String operacion2 = "8 * 2";

            int resultado1 = evaluarOperacion.apply(operacion1);
            int resultado2 = evaluarOperacion.apply(operacion2);

            System.out.println(operacion1 + " = " + resultado1);
            System.out.println(operacion2 + " = " + resultado2);
        }
    }
