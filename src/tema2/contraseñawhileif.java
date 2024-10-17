package tema2;

import java.util.Scanner;

public class contraseñawhileif {
    public static void main(String[] args) {
        //pida por teclado una contraseña mientras la longitud sea menos que 8 caracteres

        Scanner scanner = new Scanner(System.in);
        String password= "1";
        while (password.length() < 8) {
            System.out.println("Introduce contraseña");
            password= scanner.nextLine();
        }



    }
}
