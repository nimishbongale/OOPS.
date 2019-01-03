/*

Author @nimishbongale

Version 1.0.4

Date DD/MM/YYYY

A program which performs operations on complex no.s

*/
import java.util.Scanner;

class Complex
{
	static int r1,c1,r2,c2,e,f;
	Complex()
	{
		r1=c1=r2=c2=0;
	}
	
	Complex(int a,int b,int c,int d)
	{
		this.r1=a;
		this.c1=b;
		this.r2=c;
		this.c2=d;
	}
	
	void add()
	{
		e=r1+r2;
		f=c1+c2;
		System.out.println("Sum="+e+"+("+f+")i");
	}
	
	void sub()
	{
		e=r1-r2;
		f=c1-c2;
		System.out.println("Difference="+e+"+("+f+")i");
	}
	
	void mul()
	{
		e=r1*r2-c1*c2;
		f=r1*c2+c1*r2;
		System.out.println("Product="+e+"+("+f+")i");
	}
	
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of real and imaginary part of number 1: ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the values of real and imaginary part of number 2: ");
		r2=sc.nextInt();
		c2=sc.nextInt();
		Complex obj=new Complex(r1,c1,r2,c2);
		System.out.println("\n1.Add\n2.Subtract\n3.Multiply\nEnter anything else to exit\n");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			obj.add();
			break;
			
			case 2:
			obj.sub();
			break;
			
			case 3:
			obj.mul();
			break;
			
			default:
			System.exit(0);
		}
	}
}


  
	
