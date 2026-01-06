/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;



/**
 *
 * @author mohan
 */
public class abstraction {
    public static void main(String[] args){
     samsung s = new samsung();
      s.call();
      s.cammara();
      s.charge();
      s.whatsapp();
       
    }
    
}
abstract class mobile{
    abstract void cammara();
    abstract void call();
    abstract void charge();
    abstract void whatsapp();
}    
    class samsung extends mobile{

        @Override
        void cammara() {
            System.out.println("Cammara features");
        }

        @Override
        void call() {
            System.out.println("Call features"); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void charge() {
            System.out.println("Charging features"); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void whatsapp() {
            System.out.println("Whatsapp features"); //To change body of generated methods, choose Tools | Templates.
        }
        
    }

