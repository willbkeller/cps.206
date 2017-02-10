package edu.jalc.classes.bottle;

import edu.jalc.classes.lid.SodaBottleLid;
import edu.jalc.classes.liquid.Soda;
import edu.jalc.classes.label.SodaBottleLabel;

public class SodaBottle {

	private final double capacity;
	private SodaBottleLid lid;
	private Soda soda;
   private SodaBottleLabel label;

	private SodaBottle() throws Exception {
		this.capacity = 0;
		this.setLid(null);
		this.soda = null;
      this.label = null;
	}

	SodaBottle(double capacity, SodaBottleLid lid, Soda soda, SodaBottleLabel label) throws Exception {
		this.capacity = capacity;
		this.setLid(lid);
		this.setSoda(soda);
      this.setLabel(label);
	}

	double getCapacity(){ return capacity; }
	SodaBottleLid getLid(){	return this.lid; }
	Soda getSoda(){ return this.soda; }

	SodaBottle setLid(SodaBottleLid lid) throws Exception {
		if(lid == null) throw new Exception("SodaBottleLid cannot be null");
		this.lid = lid;
		return this;
	}

	SodaBottle setSoda(Soda soda){
		this.soda = soda;
		return this;
	}
   
   SodaBottle setLabel(SodaBottleLabel label){
      this.label = label;
      return this;
   }
}