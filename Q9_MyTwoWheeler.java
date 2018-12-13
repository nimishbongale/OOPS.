import java.util.Scanner;

abstract class Vehicle
{
	int yom;
	Vehicle(int a)
	{
		this.yom=a;
	}
	
	abstract int getdata();
	abstract void putdata(int c);
}

class TwoWheeler extends Vehicle
{
	TwoWheeler(int d)
	{
		super(d);
	}
	int getdata()
	{
		return this.yom;
	}

	void putdata(int b)
	{
		this.yom=b;
	}	
}

final class FourWheeler extends Vehicle
{
	FourWheeler(int d)
	{
		super(d);
	}
	int getdata()
	{
		return this.yom;
	}

	void putdata(int b)
	{
		this.yom=b;
	}	
	
}

class MyTwoWheeler extends TwoWheeler
{
	MyTwoWheeler(int a)
	{
		super(a);
	}
	public static void main(String args[])
	{
		int q;
		System.out.println("Enter the year of manufacture for TwoWheeler: ");
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		MyTwoWheeler obj=new MyTwoWheeler(q);
		obj.putdata(q);
		System.out.println("Entered year of manufacture for TwoWheeler: "+obj.getdata());
	}	
}

