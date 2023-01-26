import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    int n = 0;
    int suma = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = scanner.nextInt();


      for (int i = 2; i <= n*2; i ++) {
          suma = suma + n;
        }
        System.out.println("La suma de los primeros " + n + " números pares es: " + suma);
    }
}
