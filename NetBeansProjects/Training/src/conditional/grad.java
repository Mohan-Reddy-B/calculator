/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.Scanner;
/**
 *
 * @author mohan
 */
public class grad {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        double marks=sc.nextDouble();
        
        if(marks>85 && marks<=100){
            System.out.println("Marks is:"+marks);
            System.out.println("A-Grad");
        }
        else if(marks>75 && marks<=85){
            System.out.println("Marks is:"+marks);
            System.out.println("B-Grad");
        }
        else if(marks>60 && marks<=75){
            System.out.println("Marks is :"+marks);
            System.out.println("C-Grad");          
        }
        else if(marks>40 && marks<=60){
            System.out.println("Marks is:"+marks);
            System.out.println("D-Grad");
        }else{
            System.out.println("Fail");
        }
    }
}
