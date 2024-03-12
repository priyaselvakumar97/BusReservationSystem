package busReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		
       ArrayList<Bus> buses=new ArrayList<Bus>();
       ArrayList<Booking> bookings=new ArrayList<Booking>();
       buses.add(new Bus(1,true,2));
       buses.add(new Bus(2,true,50));
       buses.add(new Bus(3,false,55));
       buses.add(new Bus(4,true,60));
       buses.add(new Bus(5,false,65));
       int userOpt=1;
       Scanner scanner=new Scanner(System.in);		
	
       for(Bus b:buses) { //to access arrayList we use foreach loop
            b.displayBusInfo();
       }
       
       while(userOpt==1) {
		System.out.println("Enter 1 to Book and 2 to Exit");
		    userOpt=scanner.nextInt();
		    if(userOpt==1) {
	    	   Booking booking=new Booking();
	    	   if(booking.isAvailable(bookings,buses)) {
		       bookings.add(booking);
		       System.out.println("Your booking is confirmed");
		    }
	    	   else
		    	System.out.println("Sorry, bus is full ...Try another bus or Date");	
		}
	}
	}
}
         

