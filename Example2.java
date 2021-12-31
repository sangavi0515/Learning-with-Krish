public class Example2 {

 static int id;   
 int a=10;                     
 
 static {          //static block 
   id =100;       
   System.out.println(id);
   System.out.println("Static block");                      
   
  }
 
 {         // empty block 
   
   System.out.println(a);
   System.out.println("Empty block");
     
 }
 
 Example2() // constructor
{ System.out.println("constructor");}
 
 }
class Main{
 public static void main(String args[]) {
     
    Example2 ob1 = new Example2();
      
     
 }
}