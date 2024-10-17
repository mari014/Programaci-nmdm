package tema2;

import java.util.Scanner;

public class ejercicioclaseifelse {

    public static void main(String[] args) {


        //Pedir por teclado la hora del día
        // 6-10 Buenos días
        // 12-20 Buenas tardes
        //en otro caso Buenas noches

        //Pedir nivel del jugador
        //1-5:
        // 1: Iniciado
        // 2: Amateur
        // 3: Profesional
        // 4: Experto
        // 5 :Dios

        Scanner sc = new Scanner(System.in);

        int hora;
        int nivel;

        System.out.println("QUe hora es ");
        hora = sc.nextInt();
        if (hora >= 6 && hora <= 10) {
            System.out.println("Buenos días");

        } else if (hora >= 12 && hora <= 20) {
            System.out.println("buenas tardes");

        } else if (hora >= 21 && hora <= 5) {
            System.out.println("buenas noches");

        }

        System.out.println("Dime que nivel eres");
        nivel = sc.nextInt();
        if (nivel == 1) {
            System.out.println("TU nivel es Iniciado");
        }
        if (nivel == 2) {
            System.out.println("TU nivel es Amateur");
        }
        if (nivel == 3) {
            System.out.println("TU nivel es Profesional");
        }
        if (nivel == 4) {
            System.out.println("TU nivel es Experto");
        }
        if (nivel == 5) {
            System.out.println("TU nivel es Dios");



        }
    }
}