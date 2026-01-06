/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opps2;

/**
 *
 * @author mohan
 */
public class multilevelInheritance {
    public static void main(String[] args){
       employee e = new employee("Mohan",21,"Nrupathunga University",123,"INVOX",20000);   //creating a method
       //accesing the properties by using reference variable
       e.empinfo();
       
       System.out.println("___________________________");
       
       employee ee = new employee("Kiran",21,"Nrupathunga University",124,"Infosis",20000);
       ee.empinfo();
       
    }
}
class person{     //perent class
    String name;
    int age;
    
    public person(String n , int a){ //using an constructor
        this.name = n;  
        this.age = a;
    }
    public void perinfo(){ //method
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}

class student extends person{ //sub class
    String college;
    int id;
    
    public student(String n , int a , String c , int i){ //constructor
        super(n,a);  //helps to access the parent class properties
        this.college = c;
        this.id = i;
    }
    public void stuinfo(){  //method
        super.perinfo();
        System.out.println("College Name is: "+college);
        System.out.println("Student id: "+id);
    }
}

class employee extends student{
    String company;
    int salary;
    
    public employee(String n , int a , String c , int i , String co , int s){ //constructor
        super(n,a,c,i);//used to access the parent class properties
        this.company = co;
        this.salary = s;
    }
    public void empinfo(){ //method
        super.stuinfo();
        System.out.println("Company is "+company);
        System.out.println("Salary is "+salary);
    }
}