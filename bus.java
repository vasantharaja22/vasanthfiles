package project;

public class bus {
      private int busno;
      private boolean ac;
      private int capacity;
	
	public bus(int busno, boolean ac, int capacity) {
		super();
		this.busno = busno;
	    this.ac = ac;
		this.capacity = capacity;
		
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
   public void displayinfo() {
	   System.out.println("busno:"+busno +  "ac:" + ac + "capacity:" + capacity );
	   
   }
}