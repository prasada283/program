import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("no it is vowels");
else
System.out.println("yes it is consonant");
}}