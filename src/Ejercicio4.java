public class Ejercicio4 {
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static int countConsonants(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c)) {
                continue;
            }
            boolean isVowel = false;
            for (char v : vowels) {
                if (c == v) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                count++;
            }
        }
        return count;
    }
}


