import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

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

        input.close();
    }
}
