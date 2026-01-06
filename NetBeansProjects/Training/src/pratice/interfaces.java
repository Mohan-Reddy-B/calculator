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
public class interfaces {
   public static void main(String[] args){
       dell d = new dell();
       d.copy();
       d.cut();
       d.past();
       d.undo();
   } 
}
interface laptop{
    public void copy();
    public void past();
    public void cut();
    public void undo();
}
class dell implements laptop{

    @Override
    public void copy() {
        System.out.println("Copy properties"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void past() {
        System.out.println("Past properties"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cut() {
        System.out.println("Cut properties"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        System.out.println("Undo properties"); //To change body of generated methods, choose Tools | Templates.
    }
    
}