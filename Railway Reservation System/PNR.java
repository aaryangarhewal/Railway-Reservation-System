import java.util.*;
class PNR 
{

static int j=0;
static ArrayList<Integer> nlist = new ArrayList<Integer>();
public static void setpnr()
{
nlist.add(1820635082+j);
j=j+3;
}
public static void getpnr()
{
System.out.println("PNR : "+nlist);
}

public static void enquiry()
{int pnr_no;
Scanner e = new Scanner(System.in);
System.out.print("Enter PNR no. : ");

pnr_no=e.nextInt();

Iterator itr=nlist.iterator();


while(itr.hasNext())
{if((Integer)itr.next()==pnr_no)
{
Ticket.showTc(nlist.indexOf(pnr_no),Reservation.x);
}
}


}
}



class Ticket extends Passenger

{
public static void showTc(int f,int g)
{
System.out.println(plist.get(f)+"\n"+Train.tlist.get(g-1));
}

}




