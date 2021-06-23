import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        //TASK
        //Find the sum of 2 integers, if they are equal multiply by 3 their sum.


        Scanner sc = new Scanner(System.in);
        System.out.print("First integer is: ");
        int a = sc.nextInt();
        System.out.print("Second integer is: ");
        int b = sc.nextInt();

        int result = a + b;


        if (a == b) {
            result *= 3;
            System.out.println("The numbers are equal so the result is multiply by 3 and it is: " + result);
        } else {
            System.out.println("The sum of the numbers is: " + result);
        }


    }
}
