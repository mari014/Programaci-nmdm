package DoWhile;

public class tiradahastaseis {

    public static void main(String[] args) {
    /*     int tirada;
        do {
            tirada = (int) (Math.random() * (6 - 1 + 1)) + 1;
            System.out.println(tirada);


        } while (tirada != 6); // tirar hasta que salga 6


        // Cuenta el número de tiradas que has necesitado hasta sacar el número 6
        // Simular lanzar un dado de seis caras, hasta que te salga un seis



        int tirada=0;
        int contador = 0;
      while (tirada !=6) {
          contador++;
          tirada = (int) (Math.random() * (6-1+1)) + 1;
          System.out.println(tirada);
      }
        System.out.println("Has necesitado " + contador + " tiradas");

   */

        // Simula tirar un dado de 20 caras hasta que te salga el 1 o el 20


        int tirada = 0;
        int contador = 0;
        while (tirada !=20  &&  tirada !=1) {
            contador++;

            tirada = (int) (Math.random() * (20-1+1)) + 1;
            System.out.println(tirada);
        }

        System.out.println("Has hecho " + contador);


    }
}
