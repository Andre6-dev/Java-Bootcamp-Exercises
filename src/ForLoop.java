import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("Ejemplo 1");
        System.out.println("=============================");

        // Imprimir los numeros del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("=============================");
        System.out.println("Ejemplo 2");
        System.out.println("=============================");

        // Tabla de multiplicar
        // Tabla del 12
        System.out.println("Tabla de multiplicar del 12");
        System.out.println("=============================");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hey, ingresa la tabla que quieres imprimir");
        int tablaAMultiplicar = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(tablaAMultiplicar + " x " + i + " = " + i * tablaAMultiplicar);
        }
        System.out.println("=============================");

        System.out.println("=============================");
        System.out.println("Ejemplo 3");
        System.out.println("=============================");

        // Cuenta regresiva de 30 numeros de 30 a 0
        //
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // Bucles anidados
        System.out.println("=============================");
        System.out.println("Ejemplo 4");
        System.out.println("=============================");

        // Tablas de multiplicar apiladas
//        for (int i = 1; i<= 5; i++) {
//            if (i == 1) {
//                for (int k = 1; k <= 5; k++) {
//                    System.out.print("Tabla " + k + "\t\t");
//                }
//                System.out.println("x");
//            }
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
//            }
//            System.out.println("|");
//        }

        for (int j = 1; j <= 5; j++) {
            System.out.print("Tabla del " + j + "\t");
        }
        System.out.println();

        for (int i = 1; i<= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println("|");
        }

        sc.close();

    }
}
