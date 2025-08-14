public class ForLoopPatterns {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("Ejemplo 5");
        System.out.println("=============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=============================");
        System.out.println("Ejemplo 6");
        System.out.println("=============================");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=============================");
        System.out.println("Ejemplo 7");
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
    }
}
