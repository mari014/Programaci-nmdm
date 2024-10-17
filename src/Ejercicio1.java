import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Variables

        double costeDeFabricacion;
        double precioconIVA;
        double precioFinal;

        //Leer de teclado el coste de fabricación

        Scanner sc = new Scanner(System.in);
        System.out.println ("Dime el coste de fabricación del producto");
        costeDeFabricacion = sc.nextDouble();

        //SUMARLE EL MARGEN QUE YO QUIERO QUEDAR ES DE UN 30% (COSTE*30/100)
        costeDeFabricacion=costeDeFabricacion+ (costeDeFabricacion * 30/100);
        System.out.println ("El coste de fabricacion mas el margen es: " + costeDeFabricacion);

        //Sumarle el 21 de IVA que le tengo que dar a Hacienda
        precioFinal=costeDeFabricacion+ (costeDeFabricacion *21/100);

        System.out.println ("El precio final para el cliente es: " + precioFinal);

    }


}
