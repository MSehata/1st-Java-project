/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author MolokoSehata
 */
public class FibonacciSeries {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        System.out.println("Fibonacci series up to " + numTerms + " terms:");
        printFibonacciSeries(numTerms);
    }
    
     public static void printFibonacciSeries(int numTerms) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
