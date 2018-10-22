import java.util.Scanner;
class Stringmanip
{
	public static void main(String args[])
	{
		int m,n;
		String s,s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:-");
		s=sc.next();
		System.out.println("Enter the position and no. of characters to be extracted");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("Resultant String="+s.substring(m,m+n));
		System.out.println("Enter the word to be searched for:-");
		System.out.println(s.indexOf(" "));
	}
}

		
		
		
