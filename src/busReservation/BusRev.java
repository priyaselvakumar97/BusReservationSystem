package busReservation;
import java.util.Scanner;
public class BusRev {

	public static void main(String[] args) {

		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
		    userOpt=scanner.nextInt();
		       if(userOpt==1) {
		    	   System.out.println("Booking...");
		       }
		
		
		}
	}

}
