import java.util.*;

class AC extends Passenger
{

private static int[] seats = new int[18];

AC()
{

for (int i=0;i<18;i++)
{ seats[i]=0;}

		Scanner s = new Scanner(System.in);
		int choice = 1;
while (choice != 0) {
int seatnumber=0;

seatnumber = bookAC();
System.out.println("\n");
if (seatnumber == -1) 
{
System.out.println("We are sorry, there are no seats available.");
System.out.println();
}
else 
{				
System.out.println("You are in luck, we have a seat available!");
printBoardingPass(seatnumber);
}
			System.out.print("Another Ticket (1) , Exit (0) : ");
			choice = s.nextInt();
		}
}
	private static int bookAC() {
		for (int i = 0; i < 18; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;
	}

	private void printBoardingPass(int seatnumber) {
                addpass();
                PNR.setpnr();
		Date timenow = new Date();
		System.out.println();
                System.out.println("\nBooking Successful!!");
		System.out.println("\nDate: " + timenow.toString());
		System.out.println("Boarding pass for seat number: " + seatnumber);
		System.out.println("\nPlease be courteous, do not smoke. Enjoy your trip.");
		System.out.println(Passenger.plist);
		System.out.println("\n"+Reservation.from +"->" +Reservation.to+"\nDate : "+Reservation.date+"\n"+Reservation.train);
                PNR.getpnr();
	}

}


