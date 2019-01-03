package ResultPackage;
import StudentPackage.RegisterStudent;
public class Display
{
    static String grade;
    static int m;
    static float sumCGPA;
    public static void main(String args[])throws Exception 
    {
            (new StudentPackage.RegisterStudent()).getdetails();
            StudentPackage.RegisterStudent obj[]=new StudentPackage.RegisterStudent[4];
            for(int i=0;i<4;i++)
            {
                obj[i]=new StudentPackage.RegisterStudent();
                System.out.println("*****SEM "+(i+1)+"*****");
                obj[i].getall();
                System.out.println("Results for SEM "+(i+1));
                for(int j=0;j<obj[i].n;j++)
                {
                    m=obj[i].marks[j];
                    if(m>90)
                    grade="S+";
                    else if(m>80)
                    grade="S";
                    else if(m>70)
                    grade="A";
                    else if(m>60)
                    grade="B";
                    else if(m>50)
                    grade="C";
                    else if(m>40)
                    grade="D";
                    else grade="F";
                
                    System.out.println(obj[i].subs[j]+"\t"+grade);
                }
                try
                  {  
                if(obj[i].SGPA>10.0)
                throw new InvalidSGPA();
                else
                {
                System.out.println("SGPA="+obj[i].SGPA);
                sumCGPA+=obj[i].CGPA;
            }
            }
            catch(InvalidSGPA e)
            {  e.disp();  }
        }
            System.out.println("CGPA="+sumCGPA);
     }
}
