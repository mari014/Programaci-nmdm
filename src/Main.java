public class Main {
    public static void main(String[] args) {

        //Variables
        int radio = 0;
        double superficie = 0;
        double longitud = 0;

        radio = 5;

        superficie = Math.PI * radio * radio;
        longitud = Math.PI * 2 * radio;

        System.out.println("El valor de superficie es " + superficie);
        System.out.println("El valor de longitud es " + longitud);
    }
}