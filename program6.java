class Main{
public static void main(String args[]){
int[] numbers={12,5,6,7,8,4};
int sum=0;
Double average;
for(int number:numbers){
sum +=number;
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("Average="+average);
}}


