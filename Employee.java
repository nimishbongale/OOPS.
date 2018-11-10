import java.util.Scanner;
class Personal
{

    public static String name,edu;
    public static int age,yoe,nol;
    private static double basic,da,hra,lamt;
    Personal(String name,String edu,int age,int yoe,double basic,double da,double hra,int nol,double lamt)
    {

        this.name=name;
        this.edu=edu;
        this.age=age;
        this.yoe=yoe;
        this.basic=basic;
        this.da=da;
        this.hra=hra;
        this.nol=nol;
        this.lamt=lamt;
    }

    boolean isEligible()
    {
        if(((basic+da+hra)>0)&&(yoe>=2)&&(age<70))
        return true;
        return false;
    }
    
    double taxpay()

    {

        double sal=basic+hra+da;

        if(sal>1000000)
        return (0.3*sal);

        else if(sal>500000)
        return (0.2*sal);

        else if(sal>200000)
        return (0.05*sal);

        return 0;
    }

  boolean isEligiblePromotion()
    {

        if((yoe>7)&&((hra+da+basic)<600000))
        return true;

        return false;
    }

 void Display()

    {

        System.out.println("Name="+name+"\nEducation="+edu+"\nAge="+age+"\nYears of experience="+yoe+"\nBasic pay="+basic+"\nDearness Allowance="+da+"\nHouse Rent Allowance="+hra+"\nNumber of loans="+nol+"\nLoan amount="+lamt);

    }
}



public class Employee

{

    public static void main(String args[])

    {
        int n,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        n=sc.nextInt();

        while(i<=n)
        {
            System.out.println("Enter details of Employee "+i+" (name,edu,age,yoe,basic,da,hra,nol,lamt)");

            Personal obj=new Personal(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextInt(),sc.nextDouble());

            obj.Display();

            System.out.println("Loan Eligibility="+obj.isEligible());

            System.out.println("Tax payable="+obj.taxpay());

            System.out.println("Promotion Eligibility="+obj.isEligiblePromotion());
            i++;
        }

    }

}
