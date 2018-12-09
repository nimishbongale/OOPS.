import ISE.ISE_Department;
public class MainClass
{
   public static void main(String args[])throws Exception
   {
       ISE_Department obj=new ISE_Department();
       obj.readdata();
       obj.printdata();
       obj.print_number_of_designations();
       obj.number_of_research_consultancy_projs();
   }
}

