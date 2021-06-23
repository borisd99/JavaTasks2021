import java.util.Scanner;

public class GetMinMaxArray {

    public static void minMaxElementOfArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the elements in the array: ");
        int numberOfElements = sc.nextInt();
        int[] array = new int[numberOfElements];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);

    }


    public static void main(String[] args) {

        minMaxElementOfArray();

    }
}
