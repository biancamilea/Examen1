import java.util.Scanner;

    public class Ejercicio6 {
        public static void main(String[] args) {
            int size = 20;
            int[] myArray = new int[size];
            Scanner sc = new Scanner(System.in);


            for (int i = 0; i < size; i++) {
                myArray[i] = i;
            }

            System.out.print("Enter the index of the element you want to remove: ");
            int index = sc.nextInt();

            while (index >= size) {
                System.out.println("Invalid index. Please enter a valid index: ");
                index = sc.nextInt();
            }


            int temp = myArray[index];
            for (int i = index; i < size-1; i++) {
                myArray[i] = myArray[i+1];
            }
            myArray[size-1] = temp;


            for (int i : myArray) {
                System.out.print(i + " ");
            }
        }
    }
