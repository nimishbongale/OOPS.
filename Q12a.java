import java.util.Scanner;
import java.util.ArrayList;
public class Q12a{

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        ArrayList<String> myQ = new ArrayList<>();

        int ch;

        while (true) {

            System.out.println("\n\n--------    MENU    --------");

            System.out.println("1. Enqueue");

            System.out.println("2. Dequeue");

            System.out.println("3. Display");

            System.out.println("4. Print names with len < 5");

            System.out.println("Enter anything else to exit: ");

            ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.print("Enter string to enqueue: ");

                myQ.add(myQ.size(), sc.next());

                break;



            case 2:

                System.out.println("The string dequeued is: " + myQ.remove(0));

                break;



            case 3:

                for (int i = 0; i < myQ.size(); i++) {

                    System.out.println(myQ.get(i));

                }

                break;



            case 4:

                for (int i = 0; i < myQ.size(); i++) {

                    if (myQ.get(i).length() < 5)

                        System.out.println(myQ.get(i));

                }

                break;

            default:

                System.out.println("Wrong choice");

            }

        }

    }

}
