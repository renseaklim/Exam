package Exercise_ONE;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        int n = 1;
        int[] arrayNum = new int[n];
        Scanner in = new Scanner(System.in);
        System.out.println("Choose option:");
        System.out.println("1.Input number in Array.");
        System.out.println("2.Output number from Array.");
        System.out.println("3.Exit.");
        System.out.print("Enter your choice:");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.print("Input number:");
                arrayNum[n]=in.nextInt();
                while(arrayNum[n] > 0){
                    n++;
                    System.out.print("Input number:");
                    arrayNum[n]=in.nextInt();
                }
                break;
            case 2:
                System.out.println("Output the element from the array");
                for(int j = 0; j<n; j++){
                    System.out.println("number[" + j + "] = " + arrayNum[j]);
                }
                break;
            case 3:
                System.exit(0);
        }

    }

}
