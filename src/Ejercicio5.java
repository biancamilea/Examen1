public class Ejercicio5 {
    public static int productElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int product = 1;
        for (int i = 0; i < arr.length; i += 2) {
            product *= arr[i];
        }
        return product;
    }
}
