/**
 * interface to implement methods
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
import java.util.Scanner;
public class JavaAssignment
{
   public static void main(String args[])
   {
       String mno,regno,ch;
       Scanner sc=new Scanner(System.in);
       System.out.println("*****ABC Motors (R)*****");
       System.out.println("Enter the registration number:- ");
       regno=sc.next();//Accpeting register number
       System.out.println("Enter the model number(year of manufacture followed by model type,followed by P or D(for eg:-2017ASDFP):- ");
       mno=sc.next();
       ch=mno.substring(4,8);//using string functions to extract model type
       switch(ch)
       {
           case "QWER":
           (new QWE(regno,mno,true,false,false)).display();
           break;
           
           case "QWET":
           (new QWE(regno,mno,true,true,false)).display();
           break;
           
           case "QWEY":
           (new QWE(regno,mno,true,true,true)).display();
           break;
           
           case "ASDF":
           (new ASD(regno,mno,true,false,false)).display();
           break;
           
           case "ASDG":
           (new ASD(regno,mno,true,true,false)).display();
           break;
           
           case "ASDH":
           (new ASD(regno,mno,true,true,true)).display();
           break;
           
           case "ZXCV":
           (new ZXC(regno,mno,true,false,false)).display();
           break;
           
           case "ZXCB":
           (new ZXC(regno,mno,true,true,false)).display();
           break; 
           
           case "ZXCN":
           (new ZXC(regno,mno,true,true,true)).display();
           break;//using a temporary instance to call display function
           
           default:
           System.out.println("Invalid model no.!");
        }
        sc.close();
    }
}

interface Vehicle//interface to implment display()
{
    public void display();
}

/**
 * The superclass 
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
class ABCmotors
{
    // instance variables 
    String registno,modelno;
    /**
     * Constructor for objects of class ABCmotors
     */
    public ABCmotors(String reg,String mn)
    {
        // initialise instance variables
        this.registno=reg;
        this.modelno=mn;
    }

    /**
     * An example of a method 
     * 
     * @param      modelname 
     * @return     P or D
     */
    public char petrolordiesel()
    {
        if(modelno.charAt(modelno.length()-1)=='P')
        return 'P';
        else if(modelno.charAt(modelno.length()-1)=='D')//extracting last character
        return 'D';
        else
        return '\0';
    }
}

/**
 *Subclass 2
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
class ASD extends ABCmotors implements Vehicle
{
    // instance variables 
    boolean overcarr;
    boolean sptrstrim;
    boolean sunrf;

    /**
     * Constructor for objects of class ASD
     */
    public ASD(String r,String mno,boolean mg,boolean pw,boolean aku)
    {
        // initialise instance variables
        super(r,mno);
        this.overcarr=mg;
        this.sptrstrim=pw;
        this.sunrf=aku;
    }

    /**
     * An example of a method
     * 
     * @param  null
     * @return  void 
     */
    public void display()
    {
        System.out.println("*****INFO*****");
        System.out.println("Registration Number:-"+registno+"\nModel Number:-"+modelno+"\nManual Gear Transmission:-"+true+"\nPetrol or Diesel:-"+petrolordiesel()+"\nWide Tyres:-"+true+"\nHalon Lights:-"+true+"\nBack Wipers:-"+true+"\nOvercarr:-"+overcarr+"\nsptrstrim:-"+sptrstrim+"\nSunroof:-"+sunrf);        
    }
}

/**
 *Subclass 3
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
class ZXC extends ABCmotors implements Vehicle
{
    // instance variables 
    boolean extnbtspace;
    boolean custombdclr;
    boolean sunrf;

    /**
     * Constructor for objects of class ZXC
     */
    public ZXC(String r,String mno,boolean mg,boolean pw,boolean aku)
    {
        // initialise instance variables
        super(r,mno);
        this.extnbtspace=mg;
        this.custombdclr=pw;
        this.sunrf=aku;
    }

    /**
     * An example of a method
     * 
     * @param  null
     * @return  void 
     */
    public void display()
    {
        System.out.println("*****INFO*****");
        System.out.println("Registration Number:-"+registno+"\nModel Number:-"+modelno+"\nManual Gear Transmission:-"+true+"\nPetrol or Diesel:-"+petrolordiesel()+"\nLeather Seat:-"+true+"\nRear View Camera with Parking assist:-"+true+"\nAuto rain wipers:-"+true+"\nExtnbtspace:-"+extnbtspace+"\ncustombdclr:-"+custombdclr+"\nSunroof:-"+sunrf);        
    }
}

/**
 *Subclass 1
 * 
 * @author Nimish Bongale 
 * @version 1.0.0
 */
class QWE extends ABCmotors implements Vehicle
{
    // instance variables 
    boolean foglights;
    boolean ABS;
    boolean sunrf;

    /**
     * Constructor for objects of class QWE
     */
    public QWE(String r,String mno,boolean mg,boolean pw,boolean aku)
    {
        // initialise instance variables
        super(r,mno);
        this.foglights=mg;
        this. ABS=pw;
        this.sunrf=aku;
    }

    /**
     * An example of a method
     * 
     * @param  null
     * @return  void 
     */
    public void display()
    {
        System.out.println("*****INFO*****");
        System.out.println("Registration Number:-"+registno+"\nModel Number:-"+modelno+"\nManual Gear Transmission:-"+true+"\nPetrol or Diesel:-"+petrolordiesel()+"\nPower Windows:-"+true+"\nAuto Key Unlock:-"+true+"\nFoglights:-"+foglights+"\nABS:-"+ABS+"\nSunroof:-"+sunrf);        
    }
}




