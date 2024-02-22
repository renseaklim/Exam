package Exercise_ONE;

import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = new int[n];
        int count = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers (enter a negative number to quit):");

        while (true) {
            int input = in.nextInt();

            if (input < 0) {
                break;
            }

            if (count == numbers.length) {
                int[] newArray = new int[count + n];
                for (int i = 0; i < count; i++) {
                    newArray[i] = numbers[i];
                }
                numbers = newArray;
            }

            numbers[count] = input;
            count++;
        }

        System.out.println("Entered numbers:");
        System.out.print("array={");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("}");
    }
}
