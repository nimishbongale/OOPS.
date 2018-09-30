import java.util.Scanner;

class Fibrec
{
      static int fib(int n)
      {
              if(n==1)
              return 0;
              if(n==2)
              return 0;
              
              return (fib(n-1)+fib(n-2));
      }
      
      public static void main(String args[])
      {
              int a;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number of terms: ");
              a=sc.nextInt();
              for(int i=1;i<=n;i++)
              System.out.println(fib(i)+" ");
      }
}

            
