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
public class twosum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sumArray = new int[rows][cols];

        // Taking input for the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        // Taking input for the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

        // Calculating the sum of the two arrays
        System.out.println("Sum of both arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}


