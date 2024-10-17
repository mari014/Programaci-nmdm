package Mar;

import java.util.Scanner;

public class debe {
    public static void main(String[] args) {


        // Un alumno quiere saber su nota final de programación.
        // Tres exámenes parciales: (nota1, nota2,nota3) media : 55%
        // Examen final: notaexamenFinal: 30%
        // Trabajo final: notaTrabajofinal: 15%
        //nota1: 7.5: teclado


        double notaExamenFinal;
        double notaTrabajoFinal;
        double nota1;
        double nota2, nota3;
        double mediaParciales;
        double notafinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("dime la nota del primer examen");
        nota1=sc.nextDouble();

        System.out.println("ingrese la nota del segundo examen");
        nota2=sc.nextDouble();

        System.out.println("ingrese la nota del tercer examen");
        nota3=sc.nextDouble();

        System.out.println("Ingrese la nota del examen final");
        notaExamenFinal=sc.nextDouble();

        System.out.println("Ingrese la nota del trabajo final");
        notaTrabajoFinal=sc.nextDouble();

        mediaParciales = (nota1 + nota2 + nota3) / 3;

        notafinal = (mediaParciales * 55 / 100) + (notaExamenFinal * 30 / 100) + (notaTrabajoFinal * 15 / 100);
        System.out.println("la nota final del alumno es:" + notafinal);




    }
}


