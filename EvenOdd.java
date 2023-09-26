//java program to find nature of number
//23.08.23
//evenodd.java
//kavya
import java.io.*;
import java.util.*;
public class EvenOdd
{
	public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a number: ");
	int n=sc.nextInt();
	if(n%2==0)
	{
	  System.out.println(n+"is even number");
	}
	else
	{
	  System.out.println(n+"is odd number");
	}
   }
}
	
