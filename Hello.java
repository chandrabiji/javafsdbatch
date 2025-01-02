class TopLevel{
TopLevel(){
 System.out.println("Parent Default Constructor");
}
TopLevel(int x){
 this();
 System.out.println("Parent Parameterized Constructor");
}
}
class Hello extends TopLevel{
  Hello(){
   super(10);
   System.out.println("Default constructor");
  }
  Hello(int n){
  this();
  System.out.println("Parameterized Constructor");
  }
  public static void main(String[] args){
   System.out.println("Hello World");
   Hello h = new Hello(10);
  }
}