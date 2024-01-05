class A{
public static void funA1(){
System.out.println("funA1 called from class A");
}
public static void funA2(){
System.out.println("funA2 called from class A");
}
}
class B{
public static void main(String args[]){
A ob=new A();
A.funA1();
A.funA2();
}
}