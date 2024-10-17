package tema2;

public class ejercicioclaseniño {

    public static void main(String[] args) {
        //1-11 hola niñoç
        //12-17 hola chaval
        // 18-29 hola tío
        //30-50 hola hombre
        //> 60 hola abuelo

        int edad = 23;
        char sexo ='m';


        if (edad >= 1 && edad <=11) {
            System.out.println("Hola niño");
        }
        else if (edad >= 12 && edad <= 17) {
            System.out.println("Hola chaval");
        }
        else if (edad >= 18 && edad <=29) {
            System.out.println("Hola tía");
        }
        else if (edad >= 30 && edad <= 50) {
            System.out.println("hola mujer");
        }
        else if (edad>= 60){
            System.out.println("hola abuela");
        }


    }
}
