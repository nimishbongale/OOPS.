/*

Author @nimishbongale

Version 1.0.2

Date DD/MM/YYYY

A program which uses the collection framework of java 

*/
import java.util.*;

class Q12bLL

{

	public static void main(String args[])//driver function 

	{

		Scanner sc = new Scanner(System.in);

		int ch;

		String s;

		LinkedList<String> ll = new LinkedList<String>();//initializing the linkedlist

		while(true){

		System.out.println("1.add name to linked list");

		System.out.println("2.Delete from head");

		System.out.println("3.Diplay using iterator");

		System.out.println("Enter choice");

		ch = sc.nextInt();

		switch(ch)

		{

			case 1:

			 System.out.println("Enter name");

			 s = sc.next();

			 ll.add(s);

			 break;

			case 2:

			 System.out.println("Removed name is :"+ ll.remove(0));

			 break;

			case 3:

			if(ll.peekFirst()==null)

			{

				System.out.println("LL empty");

			}

			else

			{

			 Iterator<String> itr = ll.iterator();

			 while(itr.hasNext())

			 {

			    String el = itr.next();

			    if(el.length()<5)

				System.out.println(el);

			 }

			}

				break;

			default:
			 System.exit(0);

		}

	}

 }

}
