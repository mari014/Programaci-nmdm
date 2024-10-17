import java.util.Scanner;

public class Ejemplofor {
    public static void main(String[] args) {


        /*
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }


        for (int num =1; num <= 10; num++){
            System.out.println(num);
        }


        // Pon con un for una cuenta atrás de 10 a 1

        for (int num =10; num >= 1; num --){
            System.out.println(num);
        }

        //Genera diez tiradas de un dado usando for, un dado de seis caras
        int tirada;
        for (int num = 1; num <=10; num ++){
            tirada =(int) (Math.random()*(6) + 1);
            System.out.println(tirada);
        }

        // pregunta por teclado 5 nombres de persona

        Scanner sc= new Scanner(System.in);
        for (int i=1; i<5; i++){
            System.out.println("Dime un nombre");
            sc.nextLine();
        }



        //Preguntar por teclado cinco nombres y pintarlos seguidos
        //Tenemos que ir guardando los nombres en una variable
        // nombre = nombre + nuevo

        String nombre;
        String cadenadenombre = " ";

        Scanner sc= new Scanner(System.in);
        for (int i=1; i<5; i++){
            System.out.println("Dime un nombre");
            nombre = sc.nextLine();
            cadenadenombre= cadenadenombre+nombre + " ";
        }
        System.out.println(cadenadenombre);




        //Pinta por pantalla la tabla de multiplicar del número 7
        //7*1


        for (int i=1; i<=10; i ++) {

            System.out.println(i + ("*7=") + (i*7));

        }




        //Pinta la tabla del 4 de al revés

        for (int i=10; i>=1; i --) {

            System.out.println(i + ("*4=") + (i*4));}


    // Tira un dado de 6 caras 100 veces y cuenta las veces que sale el seis

        int tirada = 0;
        int contador =0;
        for (int i=1; i<=10000; i++){
            tirada =(int) (Math.random()*(6) + 1);
            if (tirada ==6) {
                contador++;
            }

        }
        System.out.println("el seis a salido " + contador * 100/10000 + "% de veces que sale");




// Suma todos los números pares del 1 al 100
        // Te sale la suma directamente


        int total = 0;
        for (int i=1; i<=100; i++){

            if (i%2==0){
                total=total+i;
            }
        }
        System.out.println(total);

        // Pide 5 precios por teclado
        // Imprime el total

        Scanner sc= new Scanner(System.in);
        int total = 0;
        int precio;
        for (int i=1; i<5; i++){
            System.out.println("Dime la cuenta de la compra");
            precio = sc.nextLine();

            total = total +precio;


        }

        System.out.println("El precio total de la compra es " + total);

          */

        // Genera 100 números aleatorios entre 1 y 100
        // Muestra la suma de los pares y la suma de los impares
         int totalPares;
         int totalImpares;
         int tirada;
        for (int num = 1; num <=100; num ++){
            tirada =(int) (Math.random()*(100) + 1);
           if (tirada %2 ==0) {

               totalPares = totalPares + tirada;
           } else {
               totalImpares
           }
           }







    }

}

