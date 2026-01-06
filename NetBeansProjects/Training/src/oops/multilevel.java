/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
/**
 *
 * @author mohan
 */
public class multilevel {
   public static void main(String[] args){
       employee em=new employee("Mohan","Bangalore",30000,"tcs");
       em.employeeinfo();
       
       System.out.println("______________________________");
       
        employee emm=new employee("kiran","Bangalore",30000,"tcs");
        emm.employeeinfo();
        
        System.out.println("____________________________________");
        
        student sd=new student("Narendra","bengalore",123,"nrupathunga");
        sd.studentinfo();
   } 
}
class person{
    String name;
    String address;
    
    public person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void personinfo(){
        System.out.println("name is:"+name);
        System.out.println("Address is:"+address);
    }
}
class student extends person{
    int id;
    String college;
     public student(String name,String address,int id,String college){
         super(name,address);
         this.id=id;
         this.college=college;
     }
    public void studentinfo(){
        super.personinfo();
        System.out.println("id is:"+id);
        System.out.println("college is:"+college);
    } 
}
class employee extends person{
    int salary;
    String company;
    
    public employee(String name,String address,int s,String com){
        super(name,address);
        salary=s;
        company=com;
    }
    public void employeeinfo(){
    super.personinfo();
    System.out.println("Salary is:"+salary);
    System.out.println("Company is:"+company);
}
}