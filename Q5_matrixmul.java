import java.util.Scanner;
public class Q5_matrixmul
{
    static int C[][],D[][],E[][];
    static int r1,c1,r2,c2;
    static Scanner sc=new Scanner(System.in);
   
    public Q5_matrixmul()
    {}
    public Q5_matrixmul(int C[][],int D[][])
    {
       this.C=C;
       this.D=D;
    }
    
    public static void insert(int X[][],int m, int n)
    {
         for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                X[i][j]=sc.nextInt();
            }

    public void calc()
    {
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                E[i][j]=0;
                for(int k=0;k<c1;k++)
                E[i][j]+=C[i][k]*D[k][j];
            }
        }
    }
    
    public void display(int X[][],int m,int n)
    {
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            System.out.print(X[i][j]+"\t");
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        int A[][]=new int[10][10];
        int B[][]=new int[10][10];
        E=new int[10][10];
        
        System.out.println("Enter the dimensions of matrix 1: row, column");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the dimensions of matrix 2: row, column");
        r2=sc.nextInt();
        c2=sc.nextInt();
        if(c1!=r2)
        {
            System.out.println("Matrices are incompatible for multiplication!");
            System.exit(0);
        }
        
        System.out.println("Enter the contents of matrix 1");
        insert(A,r1,c1);
        System.out.println("Enter the contents of matrix 2");
        insert(B,r2,c2);    
       
        Q5_matrixmul obj=new Q5_matrixmul(A,B);
        obj.calc();
        
        System.out.println("A=");
        obj.display(A,r1,c1);
        System.out.println("B=");
        obj.display(B,r2,c2);
        System.out.println("A*B=");
        obj.display(E,r1,c2);
    }
}

        
        
