/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author mohan
 */
public class minmam {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {25, 14, 9, 32, 7, 50, 18};

        // Find the minimum value
        int min = numbers[0]; // Assume first element is the minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update minimum if a smaller value is found
            }
        }

        // Print the minimum value
        System.out.println("The minimum value in the array is: " + min);
    }
}

