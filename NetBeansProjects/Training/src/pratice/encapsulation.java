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
public class encapsulation {
    public static void main(String[] args){
        employee e = new employee();
        e.setage(11);
        System.out.println("age:"+e.getage());
        e.setname("Mohan");
        System.out.println("Name:"+e.getname());
    }
}
class employee{
    private String name;
    private int age;
    
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setage(int a){
        age = a; 
    }
    public int getage(){
        return age;
    }
}
