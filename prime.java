import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int n,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number \t");
		n=sc.nextInt();
		if(n==1)
		System.out.print("1 is neither prime nor composite");
		else
		{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is a composite number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println(n+" is a prime number");
		}
	}
}		
