/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

/**
 *
 * @author mohan
 */
public class programif {
    public static void main(String[] args){
        int marks=10;
        if(marks>90 && marks<=100){
            System.out.println("the marksis:"+marks);
            System.out.println("A grade");
        }
            else if(marks>=75 && marks<90){
                    System.out.println("the marks is:"+marks);
                    System.out.println("B grade");
                    }
            else if(marks>=55 && marks<75){
                    System.out.println("marks is :"+marks);
                    System.out.println("C grade");
                    }
            else if (marks>=45 && marks<55){
                System.out.println("marks is "+marks);
                System.out.println("D grade");
            }
            else{
                System.out.println("marks is:"+marks);
                System.out.println("Fail");
            }
        
        }
        
    }
    
