public class Array {

    public static void main(String[] args) {
        // list = [1, 'String', True,]
        // List<>
        // Arreglos en Java solo permiten un solo tipo de dato y el tamaño es fijo
        // Indices: Son una forma de acceder al valor de uno de los datos dentro de tu arreglo

        int[] numbers = {10, 20, 30};
        System.out.println("Elementos del arreglo(array)");
        System.out.println("El tamaño de la lista es " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("El indice es " + i + " y su valor es " + numbers[i]);
        }

        // For each
        String[] frutas = {"Manzana", "Lucuma", "Naranja", "Pera"};

        for (String fruta : frutas) {
            // fruta = frutas[i]
            System.out.println("La fruta es " + fruta);
        }

        // Buscar el promedio de una lista
        double[] listaNotasDelBootcamp = {12.5, 15.5, 18.6, 5.0, 12.0, 16.6, 15.7, 10.1, 14.6};

        // Calcular el total de las notas
        double total = 0;
        for (double valor : listaNotasDelBootcamp) {
            total += valor;
        }

        // Calculamos el promedio
        double promedio = total / listaNotasDelBootcamp.length;

        System.out.println("El total de notas es: " + total);
        System.out.println("El promedio del estudiante es: " + promedio);
    }
}
