import java.util.Scanner;
class Loop1r {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=0;i=i-5)
System.out.println(i+",");
}
}