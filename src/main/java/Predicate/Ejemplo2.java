package Predicate;
import java.util.function.Predicate;
public class Ejemplo2 {


    public class EjercicioPredicate {
        public static void main(String[] args) {
            Predicate<Integer> esPositivo = numero -> numero > 0;

            boolean resultado1 = esPositivo.test(5); // true
            boolean resultado2 = esPositivo.test(-3); // false

            System.out.println("¿5 es positivo? " + resultado1);
            System.out.println("¿-3 es positivo? " + resultado2);
        }
    }
}
