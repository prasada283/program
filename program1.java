import java.util.Scanner;
class inputDayNumber{
public static void displayDay(int n)
{
switch(n){
case 0:System.out.println("sunday");break;
case 1:System.out.println("monday");break;
case 2:System.out.println("tuesday");break;
case 3:System.out.println("wednesday");break;
case 4:System.out.println("thursday");break;
case 5:System.out.println("friday");break;
case 6:System.out.println("saturday");break;
default:System.out.println("invalid");
}}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
displayDay(dn);
}}
