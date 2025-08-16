import java.util.*;

public class CollectionsGuide {

    public static void main(String[] args) {

        // LIST
        // Sistema de calificaciones usando una List
        List<Double> calificaciones = new ArrayList<>();

        calificaciones.add(11.4);
        calificaciones.add(19.0);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.5);

        // Calcular mi promedio
        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Su promedio es: " + promedio);

        // Encontrar el minimo y el maximo
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("La nota mas alta y minima es: " + max + " , " + min);

        // Buscar un elemento
        System.out.println("La nota de 18.0 existe en mi lista? " + calificaciones.contains(18.0));

        // SETS
        List<String> paises = new ArrayList<>();
        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Panama");
        paises.add("Peru");

        for (String pais : paises) {
            System.out.println(pais);
        }

        // Maps -> tipo clave valor
        // No necesitas el orden -> HashMap
        // Si necesitas el orden por insercion o LRU simple -> LinkedHashMap
        // Ordern por comparador -> TreeMap
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Pepito", 28);
        edades.put("Uriel", 23);
        edades.put("Paula", 21);

        System.out.println("La edad de Paula es: " + edades.get("Paula"));
        System.out.println("La persona Uriel existe en mi lista? " + edades.containsKey("Marcelo"));

        for (var e : edades.entrySet()) {
            String nombre = e.getKey();
            Integer edad = e.getValue();
            System.out.println(nombre + "->" + edad);
        }

        // Streams nueva forma de iterar
        edades.forEach((clave, valor) -> System.out.println(clave + " tiene " + valor));

        // Queue - Cola
        Queue<Persona> cola = new PriorityQueue<>(Comparator.comparing(Persona::getNombre));
        Persona hola = new Persona("Luis", 29);
        cola.add(new Persona("Luis", 29));
        cola.add(new Persona("Andre", 24));

        for (Persona persona : cola) {
            System.out.println(persona.nombre);
        }

    }

    public static class Persona implements Comparable<Persona> {
        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public int compareTo(Persona o) {
            return Integer.compare(this.edad, o.edad);
        }
    }
}
