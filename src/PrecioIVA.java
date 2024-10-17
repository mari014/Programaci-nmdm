public class PrecioIVA {
    public static void main(String[] args) {


        //Variables
        double precioProductoSinIVA = 10.00;


        double calculoIVA = (precioProductoSinIVA * 21)/100;


        double precioFinal = precioProductoSinIVA + calculoIVA;

        System.out.println("El precio final con IVA incluido es de " + precioFinal);


    }
}

