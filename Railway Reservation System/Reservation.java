import java.util.*;
class Reservation
{
Scanner tc = new Scanner(System.in);
static String from,to,date,train;
int a;
static int x;
Reservation()
{System.out.println("\nFrom");
System.out.print("(eg. INDB-Indore Jn, NU-Narsinghpur, \n\tJBP-Jabalpur, BPL-Bhopal Jn) : ");
from = tc.nextLine();
System.out.println("\nTo");
System.out.print("(eg. INDB-Indore Jn, NU-Narsinghpur, \n\tJBP-Jabalpur, BPL-Bhopal Jn) : ");
to = tc.nextLine();
System.out.print("\nJOURNEY DATE : ");
date = tc.nextLine();

Train.details();


x = tc.nextInt();

System.out.print("Select Coach Type : AC (1) , Sleeper (2) : ");
a = tc.nextInt();

if(a==1)
{new AC();}
else if(a==2)
{new Booking();}

}
}




class Train extends Reservation
{
static ArrayList<String> tlist = new ArrayList<String>();
public static void details()
{System.out.println("\n****Available Trains****\n");

tlist.add("(1) JANSHATABDI (12062)\n05:30-11:00 | Travel Time : 05:30");
tlist.add("(2) INDRAYANI EXP (22105)\n09:30-14:00 | Travel Time : 04:30");
tlist.add("(3) SOMNATH EXP (11464)\n11:40-18:20 | Travel Time : 06:40");
tlist.add("(4) MALWA EXP (12919)\n12:25-23:28 | Travel Time : 11:03");
tlist.add("(5) INTERCITY EXP (22188)\n17:23-22:15 | Travel Time : 04:52");
tlist.add("(6) MAHAKAUSHAL EXP (12189)\n18:10-05:50 | Travel Time : 11:40");
tlist.add("(7) VINDHYACHAL EXP (11271)\n22:10-09:30 | Travel Time : 11:20");
tlist.add("(8) NARMADA EXP (18234)\n22:28-04:05 | Travel Time : 05:37");
for(String str:tlist)
{System.out.println(str);
System.out.println("\n");}
train = tlist.get(x+1);
}

}
class Passenger 
{ String name,gender;
  int age;
static ArrayList<String> plist = new ArrayList<String>();
public void addpass()
{Scanner z = new Scanner(System.in);
System.out.print("\n**Add Passenger**\nName : ");
name = z.nextLine();
System.out.print("\nGender : Male(M) Female(F) Other(O) : ");
gender = z.nextLine();
System.out.print("\nAge : ");
age = z.nextInt();
plist.add(name+" "+gender+" "+age);
}

}

