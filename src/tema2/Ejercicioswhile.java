package tema2;

import java.util.Scanner;

public class Ejercicioswhile {
    public static void main(String[] args) {

        // Pida por teclado una contraseña mientras la longitud sea menor de 10 caracteres
        // tenga al menos una letra mayúscula
        // password.toUpperCase() PASA LA CADENA A MAYÚSCULA
        //password.toLowerCase() PASA LA CADENA A MINÚSCULA
        //length va a dar la longitud de la cadena



        String password= "hola";
        Scanner sc = new Scanner(System.in);
        while ( (password.equals(password.toLowerCase())) || (password.length()) < 10) {
            System.out.println("Introduce la contraseña:");
            password= sc.nextLine();
        }
    }
}
