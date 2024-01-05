public static boolean check Armstrong(final int n)

{ int sum=0:

int exp=lenDigit(n):

int num=n:

while(num>0)

{ sum += (int)Math.pow((num%10),exp);

num=num/10:

}//while

return n==sum:

}//checkArmstrong()

public static void main(String args[]) {

Scanner sc=new Scanner(System.in);
 int inputNum=sc.nextInt();

if(checkArmstrong(inputNum)) System.out.print("YES");

else System.out.print("NO"):

}//main()

}//Armstrong