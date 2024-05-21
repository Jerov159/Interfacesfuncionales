package Bifunction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
public class bifunction {
        public static void main(String[] args) {
            List<Integer> lista1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
            List<Integer> lista2 = new ArrayList<>(List.of(4, 5, 6, 7, 8));

            BiFunction<List<Integer>, List<Integer>, List<Integer>> unionSinDuplicados = (l1, l2) -> {
                Set<Integer> union = new HashSet<>();
                union.addAll(l1);
                union.addAll(l2);
                return union.stream().collect(Collectors.toList());
            };

            List<Integer> resultado = unionSinDuplicados.apply(lista1, lista2);
            System.out.println("Lista 1: " + lista1);
            System.out.println("Lista 2: " + lista2);
            System.out.println("Unión sin duplicados: " + resultado);
        }
    }

