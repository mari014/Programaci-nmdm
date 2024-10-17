package Menu;

import java.util.Scanner;

public class Ejerciciocalculadora {

    public static void main(String[] args) {

        // Pedir por teclado dos números
        // mostrar un menu con las siguientes opciones
        //1.- sumar : pide dos números y sumalos
        // 2.- rectar : pide dos números y restalos
        // 3.- multiplicar : pedir dor numeros y los multiplicas
        // 4.- dividir : dos numeros y dividir
        // 5 .- el resto de la división: pedir dos numeros y el resto de división
        // 6.- elevar el primero al segundo : pide dos números y eleba el primero al segundo
        // 7 .- salir

        Scanner sc = new Scanner(System.in);

        int n1=0;
        int n2=0;
        int opcion = -1;

        while (opcion !=7) {
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Resto de la división");
            System.out.println("6.- Elevar el número");
            System.out.println("7.- Salir directamente");

        System.out.println("Dime el primer número para la operación");
        n1= Integer.parseInt(sc.nextLine());
        System.out.println("Dime el segundo número para la operación");
        n2= Integer.parseInt(sc.nextLine());

        System.out.println("Introduce opción elegida");

        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {

            case 1:
                System.out.println("Ha elegido sumar " + (n1 + n2));
                break;

            case 2:
                System.out.println("Has elegido la opción restar " + (n1 - n2));
                break;

            case 3:
                System.out.println(" Has elegido la opción multiplicar " + (n1 * n2));
                break;

            case 4:
                System.out.println(" Has elegido la opción dividir " + (n1 / n2));
                break;

            case 5:
                System.out.println(" Has elegido la opción del resto de la división " + Math.pow(n1, n2));
                break;

            case 6:
                System.out.println(" Has elegido la opción elevar número " + (n1 + 1 + n2 + n1));

            case 7:
                System.out.println("Salir");
                break;

            default:
                System.out.println("Error, opción incorrecta");


        }


        }



    }
}
