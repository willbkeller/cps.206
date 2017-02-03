#Unit Testing

public class Car{
	
	public int drive(){
		startCar();
	           seatbeltOn();
		putInGear();
		accelerate();
	}
	
	public int startCar(){
		checkSourceOfIgnition();
		if(key)
		    startKeyCar();
		   /*put into ignition //imperative
	              turn //imperative
		   if(carb)
		      pressGass //imperative
		   else
		else startFobCar(); /*(pressButton) //imperative
           }

	public int putInGear(){
	   if(manual)
	     shiftManual();
	   else
	     shiftAuto();
	}

	public int seatbeltOn(){
	   grabSeatBelt
	   clickItorTicket
	}

	public int accelerate();
	public int turn();
	public int brake();
	public int startKeyCar();
	public int startFobCar();
	public int shiftManual(){
	    pressClutch(){
		workClutch(true);
	    }
	    moveGearShift(gear);
	    releaseClutch(){
		workClutch(false);
	    }

	private isClutchPress(boolean);

	private workClutch(boolean press){
		if (press)
		  isClutchPress = true
		  //do steps to press
		else isClutchPress = false //do steps to release
	}
	
	private testWorkClutch(){
		workClutch(true)
		assert(isClutchPress)
		workClutch(false)
		assert(!isClutchPress)
	}
}

The idea of this is that you take your problem and you break it down into easier problem that makes it
easy for everyone to read.
