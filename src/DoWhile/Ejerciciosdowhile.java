package DoWhile;

import java.util.Scanner;

public class Ejerciciosdowhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String password;

        do {
            System.out.println("dime la contraseña");
            password = sc.nextLine();
        } while (password.length() < 8);

        System.out.println("Tu contraseña es " + password);
    }
}
