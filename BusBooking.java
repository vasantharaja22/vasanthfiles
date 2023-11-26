package project;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBooking {

	public static void main(String[] args) {
    ArrayList<bus> m=new ArrayList<bus>();
    ArrayList<customerinfo> k=new ArrayList<customerinfo>();
     m.add(new bus(1,true,0));
     m.add(new bus(2,false,0));
     m.add(new bus(3,true,1));
     int useroption =1;
     Scanner sn=new Scanner(System.in);
     for(bus a:m)                       //for each 
      a.displayinfo();	 
     while(useroption == 1) {
    	 System.out.println("enter 1 to booking or 2 to Exist");
    	 useroption=sn.nextInt();
    if(useroption == 1) {
    	customerinfo book = new customerinfo();
		if(book.isAvailable(k,m)) {
    	     k.add(book);
    	     System.out.println("your Booking is comfirmed");
    	    }
    	    else {
    	     System.out.println("sorry.. Bus is full Try another bus or date");
    	  
    	    }
    	   }
    	
    }
    	
    	
     }
	}


