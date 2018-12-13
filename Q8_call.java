import java.util.Scanner;
class call
{
    public static void main(String args[])
    {
        double r;
        System.out.println("Enter the radius: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        circle obj=new circle(r);
        System.out.println("Enter the radius and angle: ");
        sector obj1=new sector(sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter the radius and arc length: ");
        segment obj2=new segment(sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of circle="+obj.area()+"\nArea of sector="+obj1.areasec()+"\nArea of segment="+obj2.areaseg());
    }
}

class circle
{
    static double r;
    circle(double radius)
    {
        this.r=radius;
    }
    
    double area()
    {
        return (Math.PI*r*r);
    }
    
}
class sector extends circle
{
    static double ang;
    sector(double rad,double angle)
    {
        super(rad);
        this.ang=angle;
    }
    
    double areasec()
    {
        return ((Math.PI*r*r)*(ang/(2*Math.PI)));
    }
}

class segment extends circle 
{
    static double l;
    segment(double rad,double length)
    {
        super(rad);
        this.l=length;
    }
    
    double areaseg()
    {
        return (r*r*(Math.asin(l/(2*r))-(l/(2*r))*Math.sqrt(1-Math.pow((l/(2*r)),2))));
    }
}


        
        
    
