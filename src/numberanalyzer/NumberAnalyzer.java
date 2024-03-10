/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberanalyzer;

import java.util.Scanner;

/**
 *
 * @author Clark
 */
public class NumberAnalyzer {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int totalCount = 0;
        int totalSum = 0;

        System.out.println("Enter integers (enter 0 to finish):");

        int input;
        do {
            input = scanner.nextInt();

            if (input > 0) {
                positiveCount++;
                totalSum += input;
            } else if (input < 0) {
                negativeCount++;
                totalSum += input;
            }

            if (input != 0) {
                totalCount++;
            }

        } while (input != 0);

        scanner.close();

        if (totalCount == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) totalSum / totalCount;

            System.out.println("Positive numbers count: " + positiveCount);
            System.out.println("Negative numbers count: " + negativeCount);
            System.out.println("Total count (excluding zeros): " + totalCount);
            System.out.println("Total sum (excluding zeros): " + totalSum);
            System.out.println("Average (excluding zeros): " + average);
        }
    }
    
}
