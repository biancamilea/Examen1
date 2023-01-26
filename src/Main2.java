package circulo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double r = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a r: ");

        r = scanner.nextDouble();


        Circulo1 circulo1 = new Circulo1();

        double area = Circulo1.calcularArea(r);
        double longitud = Circulo1.calcularLongitud(r);

        System.out.println("Área: " + area);
        System.out.println("Longitud: " + longitud);

        Circulo1 c = new Circulo1();
        c.setR(10);
        System.out.println("Area: " + c.calcularArea());
        System.out.println("Longitud: " + c.calcularLongitud());
    }
}
