/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class multisum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows size:");
        int row = sc.nextInt();
        System.out.println("Enter column size:");
        int col = sc.nextInt();
        System.out.println("Enter first array:");
        int [][]first = new int[row][col];
        for(int i = 0 ; i<row ;i++){
            for(int j = 0 ; j<col ; j++){
                first[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array:");
        int [][]second = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                second[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of an array:");
        int [][]sum = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++)
                    {
                     sum[i][j]=first[i][j]+second[i][j];
                     System.out.println(sum[i][j]);
                    }
        }
    }
}
