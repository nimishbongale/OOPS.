/*

Author @nimishbongale

Version 1.0.2

Date DD/MM/YYYY

A program which implements the basic features of a stack 

*/
import java.util.Scanner;

class Stack
{
	int size,top,s[];
	
	Stack(int k)
	{
		this.size=k;
		this.top=-1;
		this.s=new int[k];
	}`
		
	void push(int item)
	{
		if(top==size-1)
		System.out.println("Stack overflow!");
		else
		s[++top]=item;
	}
	
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow!");
			return -1;
		}
		else
		return s[top--];
	}
	
	void display()
	{
		System.out.println("Current stack:- ");
		for(int i=0;i<=top;i++)
		System.out.print(s[i]+" ");
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,a,d;
		System.out.println("Enter the size of the stack ");
		d=sc.nextInt();
		Stack obj=new Stack(d);
		
		while(true)
		{
			System.out.println("\n*****MENU*****\n1.Push\n2.Pop\n3.Display\nEnter anything else to exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter the element");
				a=sc.nextInt();
				obj.push(a);
				break;
				
				case 2:
				if((a=obj.pop())!=-1)
				System.out.println("Popped element= "+a);
				break;
				
				case 3:
				obj.display();
				break;
				
				default:
				System.exit(0);
			}
		}
	}
}

				
				
