package ISE;
import java.util.Scanner;
public class ISE_Department extends Faculty implements Department
{
    static int n;
    static Faculty obj[]=new Faculty[20];
    public void readdata() 
    {
        try
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of accounts to be made: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Entering info for Person "+(i+1));
            System.out.println("Enter name:");
            obj[i].name=sc.next();
            System.out.println("Enter age:");
            obj[i].age=sc.nextInt();
            System.out.println("Enter designation:");
            obj[i].desig=sc.next();
            if(obj[i].age>58)
            throw new AgeException();
            System.out.println("Enter years of experience:");
            obj[i].yoe=sc.nextInt();
            System.out.println("Enter joining date:");
            obj[i].date=sc.nextInt();
            System.out.println("Enter subjects: ");
            obj[i].sub=sc.next();
            }
        }
    catch(AgeException e)
    {
        e.disp();
    }
}


public void printdata()
{
    System.out.print("*****Displaying Details*****\n");
    for(int i=0;i<n;i++)
    {        System.out.println("Name: "+obj[i].name+"\nDesignation: "+obj[i].desig+"\nAge:"+obj[i].age+"\nYears of experience:"+obj[i].yoe+"\nSubjects:"+obj[i].sub);
            System.out.println();
    }
}
        
        
public void print_number_of_designations()//randomly formulated function
        {
            int count=0;
            for(int i=0;i<n;i++)
            {  if(!((obj[i].desig).equals("")))
                count++;
            }
            System.out.println("Number of valid designations="+count);
        }
    

public void number_of_research_consultancy_projs()//randomly formukated function 
{
    int count=0;
    for(int i=0;i<n;i++)
            {  if(obj[i].yoe>5)
                count++;
            }
            System.out.println("No. of research consultancy projs handled="+count);
        }
    }
    
    
    
    
       
        
    
                

        