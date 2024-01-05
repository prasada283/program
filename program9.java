import java.util.Scanner;

class Search_Element {
    public static void main(String args[]) {
        int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array: ");
        n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

for(i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++)
{ 
int temp=0;
if(a[i]<a[j]){
 temp=a[i];
a[i]=a[j];
a[j]=temp;
}}}
for(int y:a)
System.out.print(y+" ");
}}