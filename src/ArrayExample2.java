import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        // Nuevo cambio

        // Llenar el arreglo con números ingresados por el usuario
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Imprimir los números del arreglo
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Nuevo Ejemplo
        int[] datos = {15, 16, 7, 88, 23};
        int max = datos[0];

        for (int numero : datos) {
            if (numero > max) {
                max = numero;
            }
        }

        System.out.println("El valor maximo es: " + max);

        input.close();
    }
}
