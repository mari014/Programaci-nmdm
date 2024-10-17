package tema2;

import java.util.Scanner;

public class Ejerciciovideo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia;
        int mes;

        System.out.println("dime el día en el que estás");
        dia = scanner.nextInt();

        System.out.println("dime el mes en el que estamos");
        mes = scanner.nextInt();


        if (dia > 22 && mes == 12 || mes == 2 || mes == 3) {
            System.out.println("Es invierno");
        } else if (dia > 20 && mes == 3 || mes == 4 || mes == 5 || mes == 6){
            System.out.println("Es primavera");

        } else if (dia > 20 && mes == 6 || mes == 5 || mes == 6 || mes == 7 || mes == 8 || mes == 9) {
            System.out.println("Es verano");
        } else if (dia > 9 && mes == 9 || mes == 10 || mes == 11 || dia < 21 && mes == 12){
            System.out.println(" Es otoño");
        }
    }
}

