
import java.util.*;

public class Start
{
public static void main(String args[])
{
new Welcome();
Login user = new Login();
new Main();


}
}

class Welcome
{
Welcome()
{
System.out.println("\n\n\t\t* * * * * * * * * * * * * * * * * * * * *\n\t\t* Welcome to Railway Reservation Portal *\n\t\t* * * * * * * * * * * * * * * * * * * * *\n\n");
}
}

class Login
{
String usr_name, password;
Scanner sc = new Scanner(System.in);
Login()
{
System.out.println("**LOGIN**\n");
System.out.print("Enter User Name : ");
usr_name = sc.nextLine();
System.out.print("\nEnter Password : ");
password = sc.nextLine();
}
}

class Main
{int a=1;
Main()
{while(a!=0){
System.out.println("\n\t\t* * * Train Ticketing * * *");
System.out.println("\nPlan MY JOURNEY (1)\t\t\tPNR Enquiry (2)\n\nMy Bookings/Cancellation (3)\t\tExit (0)\n");
Scanner m = new Scanner(System.in);
a = m.nextInt();
if(a==1)
{new Reservation();}
if(a==2)
{PNR.enquiry();}

}
System.out.println("\n\t\t* * * THANKS FOR VISITING!! * * *");
}
}





