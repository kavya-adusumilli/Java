import java.io.*;
import java.lang.*;
import java.util.*;
public class CmdLineArgs1 extends Object {
//Object is the super class of all classes in java
public static void main(String args[]) {
if(args.length!=2) {
   System.out.println("Invalid number of integers");
}
else
{
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int z = x + y;
System.out.println("sum of"+x+"and"+y+"is"+z);
}
}
