package busReservation;

public class Bus {
		private int busNo;
		private boolean ac;
		private int capacity;//use get and set methods for private 
		
		// creating constructor
		Bus(int no,boolean ac,int cap){
			this.busNo=no;
			this.ac=ac;
			this.capacity=cap;
		}
           public int getCapacity(){   //get method also called or accessor method
            	return capacity;
            }
           public void setcapacity(int cap) {  //set also called mutator method 
        	   capacity=cap;
           }
           public boolean isAc() {
        	   return ac;
           }
           public void setAc(boolean val) {
        	   ac=val;
           }
           public int getBusNo() {
        	   return busNo;
           }
          public void  displayBusInfo() {
        	  System.out.println("Bus No:"+busNo+" "+"AC:"+ac+" "+"Total Capacity:"+capacity);
          }
	}



