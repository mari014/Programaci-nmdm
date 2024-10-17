package tema2;

public class HoMmasedad {

    public static void main(String[] args) {

        int edad = 23;
        char sexo ='m';

        if (sexo == 'm') {
            if (edad >= 1 && edad <=11) {
                System.out.println("Hola niña");
            }
            if (edad >= 12 && edad <= 17) {
                System.out.println("Hola chaval");
            }
            if (edad >= 18 && edad <=29) {
                System.out.println("Hola tía");
            }
            if (edad >= 30 && edad <= 50) {
                System.out.println("hola mujer");
            }
            if (edad>= 60){
                System.out.println("hola abuela");
            }
        }

        if (sexo == 'h') {
            if (edad >= 1 && edad <=11) {
                System.out.println("Hola niño");
            }
            if (edad >= 12 && edad <= 17) {
                System.out.println("Hola chaval");
            }
            if (edad >= 18 && edad <=29) {
                System.out.println("Hola tío");
            }
            if (edad >= 30 && edad <= 50) {
                System.out.println("hola hombre");
            }
             if (edad>= 60){
                System.out.println("hola abuelo");
            }
        }
        }


    }

