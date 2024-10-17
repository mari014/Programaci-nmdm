package tema2;

public class Ejerpersonaje {

    public static void main(String[] args) {


        //Personaje tiene vida y tiene maná
        // Si la vida es menor de 50 pinto que tiene que tomar poción de vida
        //SI la vida es menos de 50 pinto que tiene que tomar poción de mágia
        // Si la vida es menor qu e50 y el maná es menor que 50 que pinte "CORRE"

        int vidaPersonaje = 55;
        int manaPersonaje = 33;

        if (vidaPersonaje<=50) {
            System.out.println("Toma poción de vida");
        }
        if (manaPersonaje<=50) {
            System.out.println("Toma poción de mágia");
        }
        if (vidaPersonaje <= 50) {
            System.out.println("CORRE");
        }
        if (manaPersonaje <= 50) {
            System.out.println("CORRE");
        }
    }
}
