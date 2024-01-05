import java.util.Scanner;
class InputDayNumberIf{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn = scob.nextInt();
if(dn==0){System.out.println("Sun");}
else if(dn==1){System.out.println("mon");}
else if(dn==2){System.out.println("tue");}
else if(dn==3){System.out.println("wed");}
else if(dn==4){System.out.println("thu");}
else if(dn==5){System.out.println("fri");}
else if(dn==6){System.out.println("sat");}
else {System.out.println("invalid");}
}}