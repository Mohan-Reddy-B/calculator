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
public class multisum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        int sum = 0;

        // Taking input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
                sum += array[i][j]; // Adding element to sum
            }
        }

        // Printing the sum of the elements
        System.out.println("Sum of all elements: " + sum);

    }
}

    

