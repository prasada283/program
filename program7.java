import java.util.Scanner;
class Search_Element
{
public static void main(String args[]){
int n,x,flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.print("enter no.of arrays you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements:");
for(i=0;i<n;i++){
a[i]=s.nextInt();
System.out.print("enter the element you want to find");
x=s.nextInt();
for(i=0;i<n;i++){
if(a[i]==x){
flag=1; break;}}
if(flag==1)
{
System.out.println("element found at position:"+(i+1));}
else
{System.out.println("element not found");}
}}}