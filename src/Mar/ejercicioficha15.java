package Mar;

import java.time.Month;

public class ejercicioficha15 {

    public static void main(String[] args) {

        // Ejercicio 15
        //TEngo 2000 euros en el banco
        // INterçes al recibir 2,75 anual al año
        // de esos intereses se lleva Hacienda 18%

        // Cuanto dinero me generan esos 2000 a los seis meses
        double dinero = 2000;
        double interesGenerado= 2000 *2.75 /100; //interés anual
        interesGenerado = interesGenerado/12; // Interés de seis meses

        System.out.println("El banco me da de interés" + interesGenerado);

        double retencionHacienda = interesGenerado * 18/100;
        System.out.println("Al restar la retencion me queda" + (interesGenerado - retencionHacienda));

        //EJERCICIO 17  la formula es: (int) (Math.random() * (max -min+1) + min);

        // Crear un número entero positivo aleatorio entre 1 y 49
        int apartadoA = (int) (Math.random() * (49 -1+1) + 1);
        System.out.println(apartadoA);

        double apartadoC= Math.random() *10 + 1; // * (10-1+1)+1
        System.out.println(apartadoC);

        int apartadoE = (int) (Math.random() * (100 - (-100)+1)-100);
        System.out.println(apartadoE);

        int apartadoF = (int) (Math.random() * (5 - 1 + 1) +1 );
        System.out.println(apartadoF);

        int apartadoG = (int) (Math.random() * (12 - 1 + 1) +1 );
        System.out.println(Month.of(apartadoG));

        //EJERCICIO 18

        int a = 10, b = 3 , c = 1, d, e;
        float x, y;
        x= a / b;
        //c = (a < b) && c; // no se puede por que c no es un boleano sino un entero.
        d = a + b++;
        e = ++a - b;
        y = (float)a / b;

      // EJERCICIO 13 LA OTRA HOJA

        int numCorrectas = 15;
        int numIncorrectas = 3;
        int numBlanco = 2;

        int resultado = (numCorrectas*5) - numIncorrectas;
        System.out.println(resultado);









    }
}
