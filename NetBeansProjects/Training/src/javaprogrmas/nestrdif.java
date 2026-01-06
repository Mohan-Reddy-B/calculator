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
public class nestrdif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        if (age > 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You are not eligible to donate blood because your weight is below 50 kg.");
            }
        } else {
            System.out.println("You are not eligible to donate blood because you are under 18.");
        }

        scanner.close();
    }
}

   