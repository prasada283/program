import java.util.Scanner;
class inputMonthNumber{
public static void displayMonth(int n)
{
switch(n){
case 0:System.out.println("jan");break;
case 1:System.out.println("feb");break;
case 2:System.out.println("mar");break;
case 3:System.out.println("apr");break;
case 4:System.out.println("may");break;
case 5:System.out.println("june");break;
case 6:System.out.println("july");break;
case 7:System.out.println("aug");break;
case 8:System.out.println("sep");break;
case 9:System.out.println("oct");break;
case 10:System.out.println("nov");break;
case 11:System.out.println("dec");break;
default:System.out.println("invalid");
}}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int mn;
mn=scob.nextInt();
displayMonth(mn);
}}
