package busReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {

        int busNo;
		String passengerName;
		Date date;
		
		Booking(){  //constructor to collect data from passenger
			Scanner scanner =new Scanner(System.in)
	;		System.out.println("Enter the Passenegr Name:");
		    passengerName=scanner.next();
		    System.out.println("Enter Bus No: ");
		    busNo=scanner.nextInt();
		    System.out.println("Enter Date of Travel dd-mm-yyyy");
		    String dateInput=scanner.next();
		    SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		    try {
				date= dateFormat.parse(dateInput);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		public boolean isAvailable(ArrayList <Booking> booking,ArrayList<Bus>buses) {
	          int capacity=0;
	          for(Bus bus:buses) {
	        	  if(bus.getBusNo()==busNo)
	        		  capacity=bus.getCapacity();
	          }
	          int booked=0;
	          for(Booking b:booking) {
	        	  if(b.busNo==busNo && b.date.equals(date))
	              booked++;
	          }
	         
		return booked<capacity?true:false;
}
}
	
	

