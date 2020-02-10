package calculator;
import java.util.*;

public class Calculator {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int res=0;
System.out.println("Select option");
System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
int choice=sc.nextInt();
System.out.println("Enter first number");
int first=sc.nextInt();
System.out.println("Enter second number");
int second=sc.nextInt();
switch(choice)
{
case 1: Add add=new Add();
		res=add.cal(first, second, res);
		System.out.println("Addition of two numbers "+first+" and "+second+" is:"+res);
		break;
case 2: Subtract sub=new Subtract();
		sub.cal(first, second, res);
		res=sub.cal(first, second, res);
		System.out.println("Subtraction of two numbers "+first+" and "+second+" is:"+res);
		break;
case 3: Multiply mul=new Multiply();
		mul.cal(first, second, res);
		res=mul.cal(first, second, res);
		System.out.println("Multiply of two numbers "+first+" and "+second+" is:"+res);
		break;
case 4: Divide div=new Divide();
		div.cal(first, second, res);
		res=div.cal(first, second, res);
		System.out.println("Division of two numbers "+first+" and "+second+" is:"+res);
		break;
default:System.out.println("Enter valid option");
		break;
}
sc.close();
}
}
/**/