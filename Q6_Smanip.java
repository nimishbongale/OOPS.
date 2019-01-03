/*

Author @nimishbongale

Version 1.0.1

Date DD/MM/YYYY

A program which works with strings 

*/
import java.util.*;

class Smanip

{

    public static void main(String args[])

    {

        int m,n,c=0;
        String s,s1,s2,t,t1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the text:-");

        s=sc.nextLine();
        t1=s;
        String splits[]=s.split(" ");

        System.out.println("Enter the position and no. of characters to be extracted");

        m=sc.nextInt();

        n=sc.nextInt();

        System.out.println("Resultant String="+s.substring(m,m+n));
        System.out.println("Enter the word to be searched: ");
        s1=sc.next();
        for(String assets : splits)
        if(assets.equals(s1))
        c++;
        System.out.println("Word count="+c);

        System.out.println("Enter the word to find:-");

        s2=sc.next();
        
        System.out.println("Enter the word to replace:-");

        s1=sc.next();

        t=s.replaceAll(s2,s1);

        System.out.println("Resultant String="+t);

       
        Arrays.sort(splits);

        System.out.print("Sorted String=");
        for(String assets : splits)
        System.out.print(assets+" ");

        System.out.println("\nEnter the second text:-");

        s2=sc.next();

        if(s1.equalsIgnoreCase(s2))

        System.out.println("Strings are equal!");

        else

        System.out.println("Strings are not equal!");   

        t1=t1.concat(s2);

        System.out.println("Concatenated String="+t1); 

    }

}
