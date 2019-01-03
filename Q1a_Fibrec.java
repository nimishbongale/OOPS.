/*
Author @nimishbongale
Version 1.0.4
Date DD/MM/YYYY
A program which prints the fibonacci series using recursion
*/

import java.util.Scanner;

class Fibrec
{
      static int fib(int n)
      {
              if(n==1)
              return 0;
              if(n==2)
              return 1;
              
              return (fib(n-1)+fib(n-2));
      }
      
      public static void main(String args[])
      {
              int a;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number of terms: ");
              a=sc.nextInt();
              for(int i=1;i<=a;i++)
              System.out.println(fib(i)+" ");
      }
}

            
