import java.util.Scanner;
class Smanip
{
	public static void main(String args[])
	{
		int m,n,c=0,e,f;
		String s,s1,s2,t,t1;
		char a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text:-");
		s=sc.nextLine();
		t=s;
		t1=s;
		System.out.println("Enter the position and no. of characters to be extracted");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("Resultant String="+s.substring(m,m+n));
		System.out.println("Enter the word to be searched for:-");
		s1=sc.nextLine();
		s.trim();
		s=s+' ';
		for(int i=0;i<s.length();i++)
		{		
		   if(s1.equals(s.substring(i,s.indexOf(' '))))
			c++;
			s=s.substring(s.indexOf(' ',s.length()-1));
			i=s.indexOf(' ');
			
			}
		System.out.println("Word count="+c);
		System.out.println("Enter the word to be replaced for:-");
		s1=sc.nextLine();
		System.out.println("Enter the word to be searched with:-");
		s2=sc.nextLine();
		s.replaceAll(s1,s2);
		System.out.println("Resultant String="+s);
		char d[]=t.toCharArray();
		for(int i=0;i<t.length();i++)
		{
			for(int j=0;j<t.length()-i-1;j++)
			{
				if(d[j]>d[j+1])
				{
					temp=d[j];
					d[j]=d[j+1];
					d[j+1]=d[j];
				}
			}
		}
		t.toString();
		System.out.println("Resultant String="+t);	
		System.out.println("Enter the second text:-");
		s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2))
		System.out.println("Strings are equal!");
		else
		System.out.println("Strings are not equal!");	
		t1.concat(s2);
		System.out.println("Resultant String="+t1);	
	}
}

		
		
		
