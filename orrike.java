import java.util.*;
public class Test
{
  public static void main (String[]args)
  {
    System.out.println("java program to check given character is digit or not");
    Scanner sc = new Scanner (System.in);
    System.out.println ("Please enter a character");
    char ch = sc.next ().charAt (0);
     if(Character.isDigit(ch))
	 {
	  	System.out.println("Given Character is Digit.");
	 }
	 else
	 {
	  	System.out.println("Given Character is Not Digit.");
	 }
  }}