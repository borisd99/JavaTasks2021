import java.util.Scanner;

public class Array {


    public static void main(String[] args) {

        //TASK:
        //Write a program that prints all numbers from a given array that are divisible by 3 or 7


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the elements in the array: ");
        int numbersOfElements = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] array = new int[numbersOfElements];
        for (int i = 0; i < numbersOfElements; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("The numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) || (array[i] % 7 == 0)) {
                System.out.print(array[i] + " ");
            }
        }


    }
}
