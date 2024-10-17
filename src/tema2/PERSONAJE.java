package tema2;

public class PERSONAJE {

    public static void main(String[] args) {
        //vida de personaje, escudoEspecial, (boolean)

        // SI la vida del personaje es menor que 50 y no tiene escudo pinta, "Toma poción"
        //Sino si la mágia es menor que 50 y no tiene escudo "toma poción magica".
        // Sino SI vidaP es menor que 50 y magiaP es menor que 50 "tomate algo y corre"

        int vidaP = 58;
        int magiaP= 40;
        boolean escudoEspecial = false;

        if (vidaP<50&& escudoEspecial ==false) {
            System.out.println("Toma poción vida");
        }else if (magiaP < 50 && escudoEspecial==false) {
            System.out.println("Toma poción mágia");
        }else if (vidaP < 50 && magiaP < 50) {
            System.out.println("tomate algo y CORRE");
        }
    }
}
