import feature.Car;

import java.util.Scanner;

// This is the main class.
public class Main {
    // This is the main driver   method.
    public static void main(String[] args) {
        // This is the standard print statement
        System.out.println("Welcome to Codigo Tecsup");
        // Este objeto es una instancia de la clase Car
        Car lamborghini = new Car();
        lamborghini.acelerate();
        lamborghini.stop();

        Car nissan = new Car("Negro", "Nissan", "Modelo");

        System.out.println(nissan.color);

        nissan.acelerate();
        nissan.stop();

        // Datos primitivos
        int numero = 1500;
        int numero2 = 200;

        Integer numero3 = 300;
        double numeroDecimal = 200.50;

        boolean esMayorDeEdad = false;
        char variableChar = 'A';

        int result = numero2 + numero + numero3;

        // Datos no primitivos
        String nombre = "Andre";

        String[] arreglo = new String[5];
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Lamborghini"};

        // Python nombre = "Andre"

        // Declaring String variable
        String s = "1000";

        // Convert to int using Integer.parseInt()
        int i = Integer.parseInt(s);

        long l = Long.parseLong(s);

        // Printing value of i
        System.out.println(i);

        // CALCULADORA
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Ingresa el primer numero");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingresa el segundo numero");
        int segundoNumero = scanner.nextInt();

        int resultado = primerNumero + segundoNumero;

        // "+" "-" "*" "/"
        System.out.println("La suma de los dos numeros es: " + resultado);

        scanner.close(); // Close the scanner to release resources
    }

    private static int sumar(int a, int b) {
        // This is a simple method to add two numbers
        return a + b;
    }
}