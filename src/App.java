/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        System.out.println("Enter -1 to quit");
        while (true){
            System.out.println("Number?");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            }
            if (number%2 == 0){
                System.out.println("The number is even.");
                even++;
            }
            else{
                System.out.println("The number is odd.");
                odd++;
            }
        }
        System.out.println("The number of even numbers was "+even+".");
        System.out.println("The number of odd numbers was "+odd+".");

    }
}
