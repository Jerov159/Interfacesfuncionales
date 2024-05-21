package Biconsumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
public class biconsum {

        public static void main(String[] args) {
            Map<String, Integer> edades = new HashMap<>();
            List<Persona> personas = new ArrayList<>();
            personas.add(new Persona("Juan", 25));
            personas.add(new Persona("María", 30));
            personas.add(new Persona("Pedro", 35));

            BiConsumer<Map<String, Integer>, List<Persona>> agregarEdades = (map, lista) -> {
                for (Persona persona : lista) {
                    map.put(persona.getNombre(), persona.getEdad());
                }
            };

            agregarEdades.accept(edades, personas);

            System.out.println("Edades:");
            edades.forEach((nombre, edad) -> System.out.println(nombre + ": " + edad));
        }

        static class Persona {
            private String nombre;
            private int edad;

            public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            public String getNombre() {
                return nombre;
            }

            public int getEdad() {
                return edad;
            }
        }
    }
