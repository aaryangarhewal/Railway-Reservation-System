import java.util.*;

class Booking extends Passenger {


	private static int[] seats = new int[30];

	Booking() {

		

		// Lets start by setting all seats equal to 0 (aka Empty)
		for (int i = 0; i < 30; i++) {
			seats[i] = 0;
		}

		// Setup our scanner and default the choice to Lower.
		Scanner s = new Scanner(System.in);
		int choice = 1;

		// Ask user for a seat and store their choice.
		System.out.print("\n**Berth Preference**\nLower (1)\tMiddle (2)\tUpper (3)\nSide Lower (4)\tSide Upper (5)\tExit (0) : ");
		choice = s.nextInt();
                System.out.println("\n");

		// While their choice is not the one for exit, execute our booking.
		while (choice != 0) {
			int seatnumber = 0;


			// If they chose a Lower seat, attempt to book it.
			if (choice == 1) {
				seatnumber = bookLower();


				// No Lower seats available, try booking other seat for them instead.
				if (seatnumber == -1) {
					seatnumber = bookMiddle();
				if (seatnumber == -1) {
					seatnumber = bookUpper();
				if (seatnumber == -1) {
					seatnumber = bookSLower();
				if (seatnumber == -1) {
					seatnumber = bookSUpper();
				
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book a Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book a Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book a Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book a Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
				else {
					// Booking a Lower seat was successful.
					System.out.println("You are in luck, we have a Lower seat available!");
					printBoardingPass(seatnumber);
				}
			}
			else if (choice == 2) {

				// If they chose booking Middle, check to see if it is available.
				seatnumber = bookMiddle();
			
				// If not available, see if we have Lower seats available.
				if (seatnumber == -1) {
					seatnumber = bookLower();
				if (seatnumber == -1) {
					seatnumber = bookUpper();
				if (seatnumber == -1) {
					seatnumber = bookSLower();
				if (seatnumber == -1) {
					seatnumber = bookSUpper();

					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Middle seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Middle seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Middle seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Middle seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
				else {
					// Booking Middle seat was successful.
					System.out.println("You are in luck, we have Middle seat available!");
					printBoardingPass(seatnumber);
				}
			}
			else if (choice == 3) {

				
				seatnumber = bookUpper();
			
				
				if (seatnumber == -1) {
					seatnumber = bookLower();
				if (seatnumber == -1) {
					seatnumber = bookMiddle();
				if (seatnumber == -1) {
					seatnumber = bookSLower();
				if (seatnumber == -1) {
					seatnumber = bookSUpper();

					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
				else {
					
					System.out.println("You are in luck, we have Upper seat available!");
					printBoardingPass(seatnumber);
				}
			}
			else if (choice == 4) {

				
				seatnumber = bookSLower();
			
				
				if (seatnumber == -1) {
					seatnumber = bookLower();
				if (seatnumber == -1) {
					seatnumber = bookMiddle();
				if (seatnumber == -1) {
					seatnumber = bookUpper();
				if (seatnumber == -1) {
					seatnumber = bookSUpper();

					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Lower seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
				else {
					
					System.out.println("You are in luck, we have Side Lower seat available!");
					printBoardingPass(seatnumber);
				}
			}
			else if (choice == 5) {

				
				seatnumber = bookSUpper();
			
				
				if (seatnumber == -1) {
					seatnumber = bookLower();
				if (seatnumber == -1) {
					seatnumber = bookMiddle();
				if (seatnumber == -1) {
					seatnumber = bookUpper();
				if (seatnumber == -1) {
					seatnumber = bookSLower();

					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book Side Upper seat. But do have another seat.");
						printBoardingPass(seatnumber);
					}
				}
				else {
					
					System.out.println("You are in luck, we have Side Upper seat available!");
					printBoardingPass(seatnumber);
				}
			}
			else {
				// Print an error message if they did not choose 1, 2, 3, 4, 5 or 0 for their choice.
				System.out.println("Invalid choice made. Please try again!");
				choice = 0;
			}


			// No seats were available. 
			if (seatnumber == -1) {
				System.out.println("We are sorry, there are no seats available.");
				System.out.println();
			}

                        
			// Reprompt for a choice
			System.out.print("\n**Berth Preference**\nLower (1)\tMiddle (2)\tUpper (3)\nSide Lower (4)\tSide Upper (5)\tExit (0) : ");
			choice = s.nextInt();
		}

			
	}


	// This function checks for Lower seats and returns seat number or -1 if full.
	private static int bookLower() {
		for (int i = 0; i < 6; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;
	}


	// This function checks to see if Middle seats were available, -1 if full.
	private static int bookMiddle() {
		for (int i = 6; i < 12; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;

	}

	// This function checks to see if Upper seats were available, -1 if full.
	private static int bookUpper() {
		for (int i = 12; i < 18; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;

	}


	// This function checks to see if Side Lower seats were available, -1 if full.
	private static int bookSLower() {
		for (int i = 18; i < 24; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;

	}

	// This function checks to see if Side Upper seats were available, -1 if full.
	private static int bookSUpper() {
		for (int i = 24; i < 30; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;

	}

	// This simply prints out a nice little boarding pass message with their seat number and date of issue.
	private void printBoardingPass(int seatnumber) {
                addpass();
                PNR.setpnr();
		Date timenow = new Date();
		System.out.println();
                System.out.println("\nBooking Successful!!");
		System.out.println("\nDate: " + timenow.toString());
		System.out.println("Boarding pass for seat number: " + seatnumber);
		System.out.println("\nPlease be courteous, do not smoke. Enjoy your trip.");
		System.out.print(plist);
		System.out.println("\n"+Reservation.from +"->" +Reservation.to+"\nDate : "+Reservation.date+"\n"+Reservation.train);
                PNR.getpnr();
	}
}






