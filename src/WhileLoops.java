import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            // Imprimir los 10 primeros numeros
            System.out.println("\n==== Menu de Patrones de Estrellas ===");
            System.out.println("===========================");
            System.out.println("1. Imprimir el triangulo equilatero");
            System.out.println("2. Imprimir el triangulo equilatero inverso");
            System.out.println("3. Imprimir la piramide");
            System.out.println("4. Salir del programa");

            int opcion;

            System.out.println("Elija el numero de su eleccion");
            opcion = sc.nextInt();

            // VALIDAR QUE ESTO SEA UN NUMERO

            switch (opcion) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("Triangulo Equilatero");
                    System.out.println("=============================");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("============================");
                    break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("Triangulo Equilatero Inverso");
                    System.out.println("=============================");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 3:
                    System.out.println("=============================");
                    System.out.println("Piramide");
                    System.out.println("=============================");
                    for (int i = 1; i <= 6; i++) {
                        // Imprimir los espacios
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print(" ");
                        }
                        // Imprimir las estrellas
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar este programa");
                    continuar = false;
                    break;
                case 5:
                    // While loop
                    System.out.println("Una calculadora");
                default:
                    System.out.println("Error: No es una opcion valida");
            }
        }
        sc.close();
    }
}
