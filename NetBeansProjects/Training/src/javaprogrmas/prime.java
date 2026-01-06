/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrmas;
import java.util.*;

/**
 *
 * @author mohan
 */
public class prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers <= 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) { // Optimized check up to sqrt(num)
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}
