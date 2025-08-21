import java.util.Scanner;

public class Practica1Parte3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        double pi = 3.141516 ;
        System.out.println("Bienvenido a la calculadora de perímetro y área de circulos \n");
        System.out.println( "Ingresa por favor el diametro del circulo \n");
        double d = scanner.nextDouble();

        double perimetro = pi*d ;
        double area = pi*((d/2)*(d/2)); // no se si lo queria así profesor o usar Math.pow :(
        
        System.out.println("El perímetro del circulo es: " + perimetro + "\n");
        System.out.println("El área del circulo es " + area + "\n" );

        scanner.close();
    }
    
}
