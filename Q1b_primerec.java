/*

Author @nimishbongale

Version 1.0.2

Date DD/MM/YYYY

A program which prints prime no.s using recursion

*/
import java.util.Scanner;
class primerec
{
    static int i;
    static int calc(int n)//recursive function calc
    {
        if(n==1)return -1;
        if(n==2) return 1;
        if(i%(n-1)==0)return 0;
        
        return calc(n-1);
    }
    
     public static void main(String args[])//driver function 
    {
        int b,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        i=sc.nextInt();
        b=calc(i);
        if(b==-1)
        System.out.println(i+" is neither a prime nor composite number");
        else if(b==0)
        System.out.println(i+" is a composite number");
        else
        System.out.println(i+" is a prime number");
    }
}

        
        
