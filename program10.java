import java.util.Scanner;
class Test{
public static void checkEvenOdd(int a){
if(a%2==0)
System.out.println("even");
else
System.out.println("odd");
}
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
Test.checkEvenOdd(n);
}}
