package edu.jalc.classes.label;

public class SodaBottleLabelTest{

   public void testGetColor(){
      System.out.println("Testing SodaBottleLabel::getColor");
      SodaBottleLabel label = new SodaBottleLabel(3, 4.5);
      assert(3 == label.getColor());
   }
   
   public void testGetHeight(){
      System.out.println("Testing SodaBottleLabel::getHeight");
      SodaBottleLabel label = new SodaBottleLabel(7, 2.1);
      assert(2.1 == label.getHeight());      
   }
   
   public static void main(String[] args){
   
      SodaBottleLabelTest label = new SodaBottleLabelTest();
      label.testGetColor();
      label.testGetHeight();
      
      System.out.println("All Tests Passed");
   }
}