public class variable{
    int b=30; //instance variable
    static int c=50;//static variable
    
    public void display(){
        int num=10;
        int num2=20;
        int sum=num+num2;
        System.out.println("sum is "+sum);
    
}
    public static void print(){
    int num=50;
    int num2=30;
    int diff=num-num2;
    System.out.println("difference is"+diff);
}
    public static void main(String[] args) {
   int a=10;//locla variable
   System.out.println("variable a"+a);
   System.out.println("variable c is:"+c);
   variable g=new variable();  //function calling
   g.display();
   
   print();//if u use on static method u con't call the function
   variable bn=new variable();
   System.out.println("variable b is"+bn.b);
}
}