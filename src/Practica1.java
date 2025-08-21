import java.util.Scanner;


public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("por favor ingresa tu nombre \n");
        String n = scanner.nextLine();
        System.out.println("\n");

        System.out.println( "Muchas felicidades " + n + "\n");
        System.out.println("En la facultad estamos que no cabemos de gusto y orgullo por que están aprendiendo \n");
        System.out.println("a programar en Java con orientación a objetos. \n");
        System.out.println("De verdad \"Muchas felicidades!!\" \n");
        System.out.println("Un abarazo :)\n");

        scanner.close();
        
    }
    
}