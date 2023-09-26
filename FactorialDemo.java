//program to find factorial of a number
//FactorialDemo.java
//29.08.23
//kavya
import java.io.*;
import java.util.*;
public class FactorialDemo {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter integer value between 1 to 9: ");
	int n=sc.nextInt();
	int fact=1;
	for (int i=2;i<=n;i++)
	{
	 fact=fact*i;
	}
	System.out.println("factorial of" +n+ "is" +fact);
	}
}
