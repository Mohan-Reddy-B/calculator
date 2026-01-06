/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author mohan
 */
public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
        for(int i = 0 ; i<=10 ; i++){
            Thread.sleep(1000);//compail time
            System.out.println(i);
        }
    }

}