import java.util.Scanner;

public class Practica1Parte2 {

    public static void main(String[] args) {

        double Libra = 2.20462;
        Scanner scanner = new Scanner(System.in);

        System.out.println( "\nBienvenido a calculadora de conversión de kilo a libra \n");
        System.out.println("Ingresa la cantidad en kilos a convertir \n");
        double kilos = scanner.nextDouble();
        double resultado = kilos*Libra;
        System.out.println( "\n" + kilos + " kilos son: " + resultado + "libras. \n");

        scanner.close();

    }


}
