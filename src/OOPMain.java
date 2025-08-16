import models.Transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OOPMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un objeto de transaction
        Transaction transaccion1 = new Transaction();
        transaccion1.setNombre("Transaccion Codigo");

        Transaction transaccion2 = new Transaction(
                "Transaccion dos",
                25.50,
                LocalDateTime.now(),
                "Yape",
                "Comida",
                "Chinawok"
        );

        System.out.println(transaccion1.getNombre());
        System.out.println(transaccion2.getCategoria());
        System.out.println(transaccion2.getId());

    }
}
