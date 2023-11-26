package project;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util. *;
public class customerinfo {
	 private String cosname;
	 private int busno;
	 private Date date;
	 
    @SuppressWarnings("unused")
	customerinfo(){
    	Scanner h=new Scanner(System.in);
    	System.out.println("enter the passanger name:");
    	cosname=h.next();
    	System.out.println("enter the bus no:");
        busno:h.nextInt();
    	System.out.println("enter the date:");
    	String dateinput=h.next();
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
        	date=sdf.parse(dateinput);
    	} catch (ParseException e) {
    		e.printStackTrace();
    	}
        }
       public boolean isAvailable(ArrayList<customerinfo> k, ArrayList<bus>m) {     
    	   int capacity = 0;
    	   for (bus bus : m) {
    	    if (bus.getBusno() == busno) {
    	     capacity = bus.getCapacity();

    	    }
    	   }
    	   int booked = 0;
    	   for (customerinfo c : k) {
    	    if ( c.busno == busno&& c.date.equals(date)) {
    	     booked++;
    	    }
    	   }
    	   return booked < capacity ? true : false;
}
}