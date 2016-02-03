package Feb1.Classes;

public class Bicycle {
	
	private int cadence;
	private int gear;
	private int speed;
	
	public Bicycle(int startCadence, int startgear, int startspeed) {
		
		cadence = startCadence;
		gear = startgear;
		speed = startspeed;
		
	}
	
	public int getCadence(){
		
		return cadence;
	}
	public int getGear(){
		
		return gear;
	}
	public int getSped(){
	
	return speed;
	}
	
	public void applyBreaks(int decrement) {
		
		speed -= decrement;
	}
	
	public void speedUp(int increment ) {
		
		speed += increment;
	}
	
		
		
		

}
