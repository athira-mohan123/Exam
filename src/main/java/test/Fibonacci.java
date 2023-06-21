package test;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	int n1=0,n2=1,n3,i;
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	System.out.print(n1+" "+n2);
	for (i=0;i<count-2;i++)
	{
	n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
	}
}
}s
