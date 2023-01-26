import java.util.Random;

public class Password {
    int longitud = 8;
    String contrasena;
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
    private Random random = new Random();

    public Password(){
        this.contrasena = generatePassword (8);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public void generarPassword() {
        this.contrasena = generatePassword(longitud);
    }

    private String generatePassword(int longitud) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(CHARS.length());
            sb.append(CHARS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
