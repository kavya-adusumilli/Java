//program to find sum of first n natural numbers
//NaturalNumbers.java
//29.08.23
//kavya
import java.io.*;
import java.util.*;
public class SumofNaturalNumbers {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter  n value: ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	  sum=sum+i;
	}
	System.out.println("sum of first" +n+ "natural numbers is"+sum);
	}
}
