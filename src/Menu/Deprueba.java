package Menu;

import java.util.Scanner;

public class Deprueba {
    public static void main(String[] args) {

        int opcion = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Hacer una cosa");
        System.out.println("2.- Hacer otra cosa");
        System.out.println("3.- Hacer una diferente");
        System.out.println("4.- Hacer lo que diga el profe");
        System.out.println("5.- Salir");

        System.out.println("INtroduce opción elegida");

        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){

            case 1:
                System.out.println("Has elegido la opción 1"); break;

            case 2:
                System.out.println("Has elegido la opción 2"); break;

            case 3:
                System.out.println(" Has elegido la opción 3");break;

            case 4:
                System.out.println( " Has elegido la opción 4");break;

            case 5:
                System.out.println("bay bay, gracias por elegir este programa");break;

            default:
                System.out.println("Error, opción incorrecta");

        }



    }
}
