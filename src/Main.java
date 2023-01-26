import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese el tamaño del array de contraseñas: ");
                int tamaño = scanner.nextInt();

                System.out.print("Ingrese la longitud de las contraseñas: ");
                int longitud = scanner.nextInt();

                Password[] passwords = new Password[8];

                boolean[] fuerte = new boolean[tamaño];

                for (int i = 0; i < tamaño; i++) {
                    passwords[i] = new Password();
                    fuerte[i] = passwords[i].esFuerte();
                }
                for (int i = 0; i < tamaño; i++) {
                    System.out.println(passwords[i].getContrasena() + " " + fuerte[i]);
                }
            }
        }