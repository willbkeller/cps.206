package edu.jalc.classes.bottle;

import edu.jalc.classes.lid.SodaBottleLid;
import edu.jalc.classes.liquid.Soda;
import edu.jalc.classes.label.SodaBottleLabel;

public class SodaBottleApp {

	public static void main(String... args) throws Exception {
		SodaBottle sodaBottle = new SodaBottle(20, new SodaBottleLid(1, 2), new Soda(30), new SodaBottleLabel(1, 2));
		System.out.println("Capacity: " + sodaBottle.getCapacity());
	}
}