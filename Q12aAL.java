import java.util.*;

class Q12aAL

{

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        int ch;

        String s;

        ArrayList<String> al = new ArrayList<String>();

        while(true){

        System.out.println("1.add name to array list");

        System.out.println("2.Delete from head");

        System.out.println("3.Diplay using iterator");

        System.out.println("Enter choice");

        ch = sc.nextInt();

        switch(ch)

        {

            case 1:

             System.out.println("Enter name");

             s = sc.next();

             al.add(s);

             break;

            case 2:

             System.out.println("Removed name is :"+ al.remove(0));

             break;

            case 3:

             Iterator<String> itr = al.iterator();

             while(itr.hasNext())

             {

                String el = itr.next();

                if(el.length()<5)

                System.out.println(el);

            }

                break;

            default:
             System.exit(0);

        }

    }

 }

}
