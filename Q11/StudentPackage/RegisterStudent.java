package StudentPackage;
import java.util.Scanner;
public class RegisterStudent implements Student 
{
    public int n,totcredits;
    public double SGPA=0,CGPA=0,totregcredits=0;
    public String name,branch;
    public String subs[]=new String[10];
    public int marks[]=new int[10];
    public int credits[]=new int[10];
    public Scanner sc=new Scanner(System.in);
    public void getall()
    {
        try
        {
           System.out.println("Enter the total credits registered for: ");
            totregcredits=sc.nextDouble();
            if(totregcredits>30)
            throw new CreditLimit();
            
            System.out.println("Enter the no. of subjects:");
            n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
              System.out.println("Enter the name,the credits and marks obtained for subject "+(i+1));
              subs[i]=sc.next();
              credits[i]=sc.nextInt();
              marks[i]=sc.nextInt();
              SGPA+=(double)(((marks[i]/10)*credits[i])/totregcredits);
              CGPA=(double)SGPA/4;
              totcredits+=credits[i];
              }
            if(totcredits>totregcredits)
            {
                System.out.println("Invalid entry!");
                System.exit(0);
       }
    }
        catch(CreditLimit e)
        {
            e.disp();
        }
    }
    
    public void getdetails()
    {
        System.out.println("Enter the name and branch of student: ");
            name=sc.next();
            branch=sc.next();
        
    }
}



